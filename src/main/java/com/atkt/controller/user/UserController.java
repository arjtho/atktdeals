package com.atkt.controller.user;

import com.atkt.builder.user.UserBuilder;
import com.atkt.common.user.UserStatus;
import com.atkt.helper.view.user.UserViewHelper;
import com.atkt.model.service.User;
import com.atkt.model.view.user.UserRequest;
import com.atkt.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private static final Logger userLogger = Logger.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value="user/createUser", method = RequestMethod.POST, produces="application/json")
    @ResponseBody
    public User createAccount(ModelMap model, @RequestBody UserRequest userRequest) {

        UserViewHelper userViewHelper = new UserViewHelper();
        UserBuilder userBuilder = userViewHelper.getUserBuilder(userRequest);
        User user = userBuilder.build();
        Long userId = userService.createUser(user);
        if(userId != null && userId > 0) {
            userLogger.info("User Created Successfully");
            user.setUserStatus(UserStatus.SUCCESS);
        }
        return user;
    }
}