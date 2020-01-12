package com.ibank.remittance.core.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.ibank.remittance.core.agent.bank",
"com.ibank.remittance.core.agent.account",
"com.ibank.remittance.core.agent.remittance"} )
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}