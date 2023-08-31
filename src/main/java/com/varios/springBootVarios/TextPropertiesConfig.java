package com.varios.springBootVarios;

import com.varios.springBootVarios.di.models.service.IServicio;
import com.varios.springBootVarios.di.models.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:mensajes.properties")
})
public class TextPropertiesConfig {



}
