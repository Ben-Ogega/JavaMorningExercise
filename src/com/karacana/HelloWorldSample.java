package com.karacana;

import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

public class HelloWorldSample {

    @Name("com.oracle.Hello")
    @Label("Hello World!")
    static class Hello extends Event {
        @Label("Message")
        String message;
    }

    public static void main(String... args) {
        Hello event = new Hello();
        event.begin();
        event.message = "Hello world!";
        event.commit();
        System.out.println(event.message);
    }
}