package org.osmand.didemo;

import org.junit.Before;
import org.junit.Test;
import org.osmand.didemo.controllers.ConstructorInjectedController;
import org.osmand.didemo.services.GreetingServiceImpl;

import static junit.framework.TestCase.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETINGS, constructorInjectedController.sayHello());
    }
}
