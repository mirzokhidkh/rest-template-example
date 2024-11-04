package com.example.mockapi.model.test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        CreateLoanContract createLoanContract = new CreateLoanContract();
        createLoanContract.setId(1);
        createLoanContract.setCode("1kkkk");
//        createLoanContract.setName("11111");

        List<Guar> guars = new ArrayList<>();
        Guar guar = new Guar();
        guar.setGuar1("111");
        guar.setGuar2("222");
        guar.setGuar3("333");

        guars.add(guar);

        createLoanContract.setData(guars);

        validateRequest(createLoanContract);




    }

    private static void validateRequest(Object userRequest) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(userRequest);
        if (!violations.isEmpty()) {
            StringBuilder errorMessage = new StringBuilder();
            for (ConstraintViolation<Object> violation : violations) {
                errorMessage.append(violation.getPropertyPath().toString()).append("-").append(violation.getMessage()).append(", ");
            }
            throw new RuntimeException("Validation failed: \n"+ errorMessage);
        }

    }
}
