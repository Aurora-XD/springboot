package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeCurdController {

    @RequestMapping("/employees")
    public String selectEmployee() {
        return "[\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"小明\",\n" +
                "      \"age\": 20,\n" +
                "      \"gender\": \"男\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"小红\",\n" +
                "      \"age\": 19,\n" +
                "      \"gender\": \"女\"  \n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"小智\",\n" +
                "      \"age\": 15,\n" +
                "      \"gender\": \"男\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"name\": \"小刚\",\n" +
                "      \"age\": 16,\n" +
                "      \"gender\": \"男\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"name\": \"小霞\",\n" +
                "      \"age\": 15,\n" +
                "      \"gender\": \"女\"\n" +
                "    }\n" +
                "  ]";
    }

    @RequestMapping("/insertEmployee")
    public String insertEmployee() {
        return "";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee() {
        return "";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee() {
        return "";
    }
}
