package com.chtti.spring.demo.demo2Mean.contoller;

import com.chtti.spring.demo.demo2Mean.Training;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontoller {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String hello(){
        return "Sping boot start using maven success123";
    }
    @GetMapping(value = "/welcome")
    public String welcome(){
        return "my second boot endpoint";
    }

    @GetMapping(value = "/ed1")
    public Integer endPoint1(){
        return 123456;
    }
    @GetMapping(value = "/ed2")
    public Double endPoint2(){
        return 3.14159;
    }
    @GetMapping(value = "/ep3")
    public Training enPoint3(){
        return new Training("Spring-mvc","MarkHo",28);

    }
    @GetMapping(value = "/ep4")
    public String[] endPoint4(){
        String[] lessons = {"Spring-mvc","Spring boot","R deep learning","ios"};
        return lessons;
    }
    @GetMapping(value="/ep5")
    public Training[] endPoint5() {
        Training[] secondQuarter ={new Training("Spring-mvc","MarkHo",28),
                new Training("Spring Boot/React","MarkHo",56)};
        return secondQuarter;
    }

}
