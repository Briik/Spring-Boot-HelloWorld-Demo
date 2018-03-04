package hello.resource;

import hello.service.HelloWorld;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloResource {

    private final HelloWorld helloWorld;

    public HelloResource() {
        this.helloWorld = new HelloWorld();
    }

    @RequestMapping("/")
    String root() {
        return helloWorld.sayHello();
    }
}
