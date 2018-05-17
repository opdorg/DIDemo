package org.osmand.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"})
public class PrimaryGreetingService implements GreetingService {

    //public String sayGreetings(){
    //    return "Hello, this is Primary Greeting Service.";
    //}

    public String sayGreeting(){
        return "Hallo, dies ist der primäre Begrüßungsdienst.";
    }
}
