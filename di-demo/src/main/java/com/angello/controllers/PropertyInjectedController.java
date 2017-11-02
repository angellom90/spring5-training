package com.angello.controllers;

import com.angello.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
