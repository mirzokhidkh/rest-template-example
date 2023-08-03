package com.example.resttemplatedemo.config;

import com.example.resttemplatedemo.model.crif.schemes.MGRequest;
import com.example.resttemplatedemo.model.crif.schemes.MGResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


import java.util.List;

//@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//
//        super.configureMessageConverters(converters);
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setClassesToBeBound(MGRequest.class, MGResponse.class);
//
//        MarshallingHttpMessageConverter converter = new MarshallingHttpMessageConverter(marshaller, marshaller);
//        converters.add(converter);
//    }


}