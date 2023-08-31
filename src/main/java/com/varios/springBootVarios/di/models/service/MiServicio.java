package com.varios.springBootVarios.di.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{

    public String operacion(){
        return "ejecutado";
    }
}
