package org.osmand.didemo;

import org.junit.Before;
import org.junit.Test;
import org.osmand.didemo.controllers.PropertyInjectedController;
import org.osmand.didemo.controllers.SetterInjectedController;
import org.osmand.didemo.services.GreetingServiceImpl;

import static junit.framework.TestCase.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETINGS, setterInjectedController.sayHello());
    }
}
