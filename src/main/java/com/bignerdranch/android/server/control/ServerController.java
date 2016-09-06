package com.bignerdranch.android.server.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/server")
public class ServerController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getServer(ModelMap model){
        return "Hello";
    }
}