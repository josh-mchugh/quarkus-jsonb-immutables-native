package com.example;

import org.immutables.value.Value;

import io.quarkus.runtime.annotations.RegisterForReflection;

@Value.Immutable
@RegisterForReflection
public abstract class Greeting {
    
    public abstract String getMessage();
}
