package org.osmand.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public String sayGreeting(){
        return "Hello, this is Setter Greeting Service.";
    }
}
