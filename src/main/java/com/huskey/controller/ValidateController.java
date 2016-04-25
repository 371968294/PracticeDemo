package com.huskey.controller;

import com.huskey.dao.impl.BaseDao;
import com.huskey.model.News;
import com.huskey.model.ValidateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/17 001717:23
 * @Description:
 */
@Controller
@RequestMapping("/validate")
public class ValidateController {

    @Autowired
    @Qualifier("baseDao")
    private BaseDao<News, Integer> baseDao;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        if (!model.containsAttribute("contentModel")) {
            model.addAttribute("contentModel", new ValidateModel());
        }
        return "validatetest";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(Model model, @Valid @ModelAttribute("contentModel") ValidateModel validateModel, BindingResult result)
            throws NoSuchAlgorithmException {

        if (result.hasErrors()) {
            return test(model);
        }
        return "validatesuccess";
    }

    @RequestMapping("test1")
    private String getJson() {
        News news = new News();
        news.setTitle("123");
        news.setContent("234");
        baseDao.save(news);
        return "";
    }


}
