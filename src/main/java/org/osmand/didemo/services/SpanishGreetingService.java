package org.osmand.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class SpanishGreetingService implements GreetingService {

    public static final String GREETINGS = "Hello, Good evening";

    public String sayGreetings(){
        return "Hola, este es el Servicio de saludo primario.";
    }
}
