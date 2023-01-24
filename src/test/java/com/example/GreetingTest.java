package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingTest {
    
    @Test
    public void whenGreetingHasMessageThenExpectMessage() {

        Greeting greeting = ImmutableGreeting.builder()
            .message("message")
            .build();

        Assertions.assertEquals("message", greeting.getMessage());
    }
}
