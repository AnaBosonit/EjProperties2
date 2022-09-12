package com.example.EjProperties2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "demo")
public class ConfigProperties {
    private String VAR1;
    private int My_VAR2;


    public void setVAR1(String VAR1) {
        this.VAR1 = VAR1;
    }

    public void setMy_VAR2(int my_VAR2) {
        My_VAR2 = my_VAR2;
    }
}
