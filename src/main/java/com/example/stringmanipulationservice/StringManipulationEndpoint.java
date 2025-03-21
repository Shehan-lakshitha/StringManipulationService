package com.example.stringmanipulationservice;

import jakarta.xml.ws.Endpoint;

public class StringManipulationEndpoint {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/StringManipulationService", new StringManipulationServiceImpl());
    }
}
