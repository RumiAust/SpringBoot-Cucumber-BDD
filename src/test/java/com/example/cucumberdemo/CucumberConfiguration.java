package com.example.cucumberdemo;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberDemoApplication.class)
public class CucumberConfiguration {
}
