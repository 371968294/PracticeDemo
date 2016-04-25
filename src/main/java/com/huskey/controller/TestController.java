package com.huskey.controller;

import com.huskey.dao.INewsDao;
import com.huskey.model.News;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Husky on 16/4/20.
 */
@Controller
@RequestMapping("/testController")
public class TestController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private INewsDao iNewsDao;



}
