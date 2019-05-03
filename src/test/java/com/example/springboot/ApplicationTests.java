package com.example.springboot;

import com.example.springboot.controller.EmployeeCurdController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private EmployeeCurdController employeeCurdController;

    @Before
    public void setUp() throws Exception {
        base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void testEmployee() throws Exception {
    }
}
