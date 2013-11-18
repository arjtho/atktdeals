package com.atkt.controller.login;

import com.atkt.builder.user.UserBuilder;
import com.atkt.common.user.UserStatus;
import com.atkt.helper.view.user.UserViewHelper;
import com.atkt.model.common.user.UserJpa;
import com.atkt.model.service.User;
import com.atkt.model.view.user.UserRequest;
import com.atkt.service.login.LoginService;
import com.atkt.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class LoginController {

    //get log4j handler
    private static final Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @Autowired
    ReloadableResourceBundleMessageSource messageSource;

    @Autowired
    LoginService loginService;




    @RequestMapping(value="/getLogin", method = RequestMethod.POST)
	public String getIndexPage(ModelMap model) {
        logger.info("get login page");
		return "login/login";
	}



    @RequestMapping(value="login/doLogin", method = RequestMethod.POST, produces="application/json")
    @ResponseBody
    public User doLogin(ModelMap model, HttpServletRequest httpRequest,  @RequestBody UserRequest userRequest) {
        UserViewHelper userViewHelper = new UserViewHelper();
        UserBuilder userBuilder = userViewHelper.getUserBuilder(userRequest);
        UserBuilder resultUserBuilder = loginService.doLogin(userBuilder.build());
        User user = resultUserBuilder.build();
        if(user != null) {
            UserStatus userStatus = user.getUserStatus();
            if(userStatus != UserStatus.SUCCESS) {
                user.setErrorMessage(messageSource.getMessage("login.user.invalid.user.or.password", null, httpRequest.getLocale()));
                List<String> errorFields =new ArrayList<String>();
                errorFields.add("email");
                errorFields.add("password");
                user.setErrorFields(errorFields);
            }
        }
        return user;
    }
}