package com.example.stringmanipulationservice;

import jakarta.jws.WebMethod;

public interface StringManipulationService {
    @WebMethod
    String reverseText(String text);

    @WebMethod
    int countCharacters(String text);
}
