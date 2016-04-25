package com.huskey.controller;

import com.huskey.service.INewsService;
import com.huskey.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/16 00169:19
 * @Description:
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    @Autowired
    private INewsService iNewsService;

    @Autowired
    private IPersonService iPersonService;

    @RequestMapping(value = "/test", produces = "application/json; charset=utf-8")
    public String index() {

        iPersonService.savePerson();
        return "我爱中国";
    }

    @RequestMapping(value = "/detail/{id}", method = {RequestMethod.GET})
    public ModelAndView getDetail(@PathVariable(value = "id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @RequestMapping(value = "/*", method = {RequestMethod.GET})
    public ModelAndView urlTest() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("urlTest");
        return modelAndView;
    }
}
