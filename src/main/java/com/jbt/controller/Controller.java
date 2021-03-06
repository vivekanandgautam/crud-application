package com.jbt.controller;

import com.jbt.service.MySqlDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MySqlDb mySqlDb;

    @RequestMapping("/")
    String HelloWorld(){
        mySqlDb.method();
        return "Hello World";
    }
}
