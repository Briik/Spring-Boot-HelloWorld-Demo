package hello.service;

import org.joda.time.LocalTime;

public class HelloWorld {
    public String sayHello() {
        LocalTime currentTime = new LocalTime();
        Greeter greeter = new Greeter();
        return (greeter.sayHello() + " The current time is: " + currentTime);
    }
}
