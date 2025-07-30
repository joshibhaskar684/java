package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

    @RequestMapping("j")
    public String ji() {
        return "<h1>ji boliye na</h1>";
    }
    @GetMapping("s")
    public  String sunye( @RequestParam String name, @RequestParam String name1) {
        return "you are "+ name.concat(" ").concat(name1);
    }
    @GetMapping("s1")
    public String Sunona(@RequestParam String name,@RequestParam String name1){
        return name;

    }
    @PostMapping("s2")
    public String sum(@RequestParam int n,@RequestParam int n1){
        int s=n+n1;
        return " sum = "+s;
    }
}
