package com.example.resttemplatedemo.exception;


import com.example.resttemplatedemo.model.ResultAsync;
import com.example.resttemplatedemo.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);


//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)

    @ExceptionHandler({Exception.class})
    public final ResponseEntity<ResultAsync> handleAllExceptions(Exception ex, WebRequest request) {
        logger.error("" + Util.stackTrace(ex));

        ResultAsync result = new ResultAsync();
        result.setCode(5);
        result.setMsg("" + ex.getMessage() + " Request:" + request.getDescription(false));
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {
        final StringBuffer errors = new StringBuffer();

        for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.append(error.getField() + ": " + error.getDefaultMessage());
            errors.append(", ");
        }
        logger.error("" + Util.stackTrace(ex));


        ResultAsync result = new ResultAsync(2, errors.toString());
        return handleExceptionInternal(ex, result, headers, HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({IllegalStateException.class, ConstraintViolationException.class})
    public final ResponseEntity<ResultAsync> handleIllegalExceptions(Exception ex, WebRequest request) {
        logger.error("" + Util.stackTrace(ex));


        ResultAsync result = new ResultAsync(2, ex.getMessage());
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomizedRequestException.class)
    public final ResponseEntity<?> handleCustomizedRequestException(CustomizedRequestException ex, WebRequest request) {
        logger.error("" + Util.stackTrace(ex));


        ResultAsync result = new ResultAsync(ex.getCode(), ex.getMessage());
        return new ResponseEntity<>(result, HttpStatus.valueOf(ex.getHttpResponseCode()));
    }

    //to handle exception when tyring to pass wrong SexEnum value
    @ExceptionHandler(HttpMessageConversionException.class)
    public final ResponseEntity<?> handleHttpMessageConversionException(HttpMessageConversionException ex, WebRequest request) {
        logger.error("" + Util.stackTrace(ex));


        ResultAsync result = new ResultAsync(2, ex.getCause().getCause().getMessage());
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }


    //this will handle situation when there's exception during binding, for example you accept number and user passess string (A123.00 for example)
    @Override
    protected ResponseEntity<Object> handleTypeMismatch(
            TypeMismatchException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        logger.error("" + Util.stackTrace(ex));


        ResultAsync result = new ResultAsync(2, ex.getMessage());

        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    //this will handle situation when user sending empty request body in post request
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {

        logger.error("" + Util.stackTrace(ex));

        ResultAsync result = new ResultAsync(2, ex.getMessage());
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    //this will handle situation when user sending without required request parameter
    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return super.handleMissingServletRequestParameter(ex, headers, status, request);
        logger.error("" + Util.stackTrace(ex));

        ResultAsync result = new ResultAsync(2, ex.getMessage());
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }


}
