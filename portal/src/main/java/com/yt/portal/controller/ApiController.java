package com.yt.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * web-api
 * Created by jackdeng on 2017/9/5.
 */
@Controller
@RequestMapping(value = "/api")
public class ApiController {
    @RequestMapping(value = "get", method = RequestMethod.GET)
    @ResponseBody
    public Integer get()  {
        return 1;
    }
}
