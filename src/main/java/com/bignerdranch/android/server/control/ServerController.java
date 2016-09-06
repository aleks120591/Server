package com.bignerdranch.android.server.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/server")
public class ServerController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getServer(){
        return "Hello";
    }
}