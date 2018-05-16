package org.osmand.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String GREETINGS = "Hello, Good evening";

    public String sayGreetings(){
        return "Hello, this is Setter Greeting Service.";
    }
}
