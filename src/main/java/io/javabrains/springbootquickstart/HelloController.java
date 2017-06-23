package io.javabrains.springbootquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbasnet on 6/21/2017.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() { return "Hello from controller"; }
}
