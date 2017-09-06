package com.yt.portal.controller;

import com.yt.demo.core.dao.SPUDao;
import com.yt.demo.core.entity.SPUEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * web-api
 * Created by jackdeng on 2017/9/5.
 */
@Controller
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private SPUDao spuDao;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    @ResponseBody
    public List<SPUEntity> get()  {
        return spuDao.findTop60ByModelId(Long.valueOf(18015));
    }
}
