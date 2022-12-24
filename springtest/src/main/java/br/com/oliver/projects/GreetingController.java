package br.com.oliver.projects;

import br.com.oliver.projects.entity.GreetingResponse;
import br.com.oliver.projects.entity.GreetingResquest;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "param", defaultValue = "World") String name,
                             @RequestParam(value = "param2", defaultValue = "Segundo Parametro")
                             String name2) {
        StringBuilder teste = new StringBuilder();
        teste.append(template);
        teste.append(" ");
        teste.append(name);
        teste.append(" ");

        teste.append(" ");
        teste.append(name2);
        teste.append(" ");
        teste.append("Viva");


        return new Greeting(counter.longValue(), teste.toString());
    }

    @PostMapping("/greetingPost")
    public @ResponseBody GreetingResponse greetingPost(@RequestBody GreetingResquest requestTest) {
        StringBuilder testTwo = new StringBuilder();
        testTwo.append(template);
        testTwo.append(" ");
        testTwo.append(requestTest.getRequestTest());
        testTwo.append(" ");
        testTwo.append(" ");
        testTwo.append(requestTest.getRequestTest2());
        testTwo.append(" ");
        testTwo.append("Congrats");

        GreetingResponse variavelResposta = new GreetingResponse();
        variavelResposta.setContent(testTwo.toString());
        System.out.println(">>>> log variavelResposta: " + variavelResposta);
        return variavelResposta;
    }


}
