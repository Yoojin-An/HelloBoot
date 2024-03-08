package yoojinspring.helloboot;

import java.util.Objects;

public class HelloController {
    public String hello(String name) {
        SimpleHelloService helloService = new SimpleHelloService();

        return helloService.sayhello(Objects.requireNonNull(name));
    }
}
