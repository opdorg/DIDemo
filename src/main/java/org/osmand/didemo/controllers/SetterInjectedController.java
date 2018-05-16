package org.osmand.didemo.controllers;

import org.osmand.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    // we should never be doing DI using property
    private GreetingService greetingService;

    public String sayHello() {

        return greetingService.sayGreetings();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
