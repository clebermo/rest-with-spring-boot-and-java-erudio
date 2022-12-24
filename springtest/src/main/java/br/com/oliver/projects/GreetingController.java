package br.com.oliver.projects;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")
                             String name) {
        StringBuilder teste = new StringBuilder();
        teste.append(template);
        teste.append(" ");
        teste.append(name);
        teste.append(" ");
        teste.append("Viva");


        return new Greeting(counter.longValue(), teste.toString());
    }
}
