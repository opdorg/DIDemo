package org.osmand.didemo.controllers;

import org.osmand.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    // we should never be doing DI using property
    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }


}
