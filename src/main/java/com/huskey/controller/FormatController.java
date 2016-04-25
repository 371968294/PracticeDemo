package com.huskey.controller;

import com.huskey.model.FormatModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/18 001813:56
 * @Description:
 */
@Controller
@RequestMapping(value = "/format")
public class FormatController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) throws NoSuchFieldException, SecurityException {
        if (!model.containsAttribute("contentModel")) {
            FormatModel formatModel = new FormatModel();

            formatModel.setMoney(12345.678);
            formatModel.setDate(new Date());

            model.addAttribute("contentModel", formatModel);
        }
        return "formattest";
    }
}
