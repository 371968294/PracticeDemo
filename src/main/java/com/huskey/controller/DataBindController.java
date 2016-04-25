package com.huskey.controller;

import com.huskey.dao.INewsDao;
import com.huskey.model.AccountModel;
import com.huskey.model.News;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/16 001610:33
 * @Description:
 */
@Controller
@RequestMapping("/databind")
@SessionAttributes(value = "sessionaccountmodel")
public class DataBindController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private INewsDao iNewsDao;

    @ModelAttribute("sessionaccountmodel")
    public AccountModel initAccountModel(){

        return new AccountModel();
    }

    @RequestMapping(value = "/parambind", method = {RequestMethod.GET})
    public ModelAndView paramBind() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("parambind");
        return modelAndView;
    }

    @RequestMapping(value = "/parambind", method = {RequestMethod.POST})
    public ModelAndView paramBind(HttpServletRequest request,
                                  @RequestParam("urlParam") String urlParam,
                                  @RequestParam("formParam") String formParam,
                                  @RequestParam("formFile") MultipartFile formFile) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("urlParam", urlParam);
        modelAndView.addObject("formParam", formParam);
        modelAndView.addObject("formFileName", formFile.getOriginalFilename());

        modelAndView.setViewName("parambindresult");
        return modelAndView;
    }

    @RequestMapping(value="/modelautobind", method = {RequestMethod.GET})
    public String modelAutoBind( Model model){
        model.addAttribute("accountmodel", new AccountModel());
        return "modelautobind";
    }

    @RequestMapping(value="/modelautobind", method = {RequestMethod.POST})
    public String modelAutoBind( @ModelAttribute("accountmodel") AccountModel accountModel){

        return "modelautobindresult";
    }

    @RequestMapping(value="/cookiebind", method = {RequestMethod.GET})
    public String cookieBind(HttpServletRequest request, Model model, @CookieValue(value="JSESSIONID", defaultValue="") String jsessionId){

        model.addAttribute("jsessionId", jsessionId);
        return "cookiebindresult";
    }

    @RequestMapping(value="/requestheaderbind", method = {RequestMethod.GET})
    public String requestHeaderBind(Model model, @RequestHeader(value="User-Agent", defaultValue="") String userAgent){

        model.addAttribute("userAgent", userAgent);
        return "requestheaderbindresult";
    }


    @RequestMapping(value="/usernamebind", method = {RequestMethod.POST})
    public String userNameBindPost( @ModelAttribute("sessionaccountmodel") AccountModel accountModel){

        //重定向到密码绑定测试
        return "redirect:passwordbind";
    }

    @RequestMapping(value="/passwordbind", method = {RequestMethod.GET})
    public String passwordBind(@ModelAttribute("sessionaccountmodel") AccountModel accountModel){

        return "passwordbind";
    }

    @RequestMapping(value="/passwordbind", method = {RequestMethod.POST})
    public String passwordBindPost(@ModelAttribute("sessionaccountmodel") AccountModel accountModel, SessionStatus status){

        //销毁@SessionAttributes存储的对象
        status.setComplete();
        //显示绑定结果
        return "sessionmodelbindresult";
    }


}
