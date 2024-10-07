package com.example.mockapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthModal {
    //    private String grant_type = "password"; //this field 'grant_type' only exists for xalq-bank-reestr-yoshlar-portali
    private String grant_type;
    private String username;
    private String password;
}
