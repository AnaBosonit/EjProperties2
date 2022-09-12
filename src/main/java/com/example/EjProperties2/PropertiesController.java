package com.example.EjProperties2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@RestController
public class PropertiesController {

    @Value("${VAR1}")
    String var1;
    @Value("${My.VAR2}")
    String var2;
    @Value("${VAR3:var3 no tiene valor}")
    String var3;

    @Value("${demo.My_VAR2}")
    String var4;

    @GetMapping ("valores")
    public String getValores(){

        return "El valor de Var1 es: " + var1 + " - El valor de My.VAR2 es: " + var2 + " - Var 4: " + var4;
    }

/*
* GET /valores/ -> return “valor de var1 es: “+var1+ “valor de my.var2 es: “+var2;*/

    /*

    Intentar leer el valor ‘VAR3’, que no existe en application.properties. Deberá asignar a la variable el texto ‘var3 no tiene valor”

    GET /var3/ -> return “valor de var3 es: “+var3;*/

    @GetMapping ("var3")
    public String getVar3(){
        return "valor de var3 es:" +var3;
    }
}
