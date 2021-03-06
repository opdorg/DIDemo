package org.osmand.didemo;

import org.junit.Before;
import org.junit.Test;
import org.osmand.didemo.controllers.PropertyInjectedController;
import org.osmand.didemo.services.GreetingServiceImpl;

import static junit.framework.TestCase.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETINGS, propertyInjectedController.sayHello());
    }
}
