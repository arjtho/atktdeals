package com.atkt.controller.login;

import com.atkt.service.product.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginController {


    //get log4j handler
    private static final Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping("/getLogin")
	public String getIndexPage(ModelMap model) {
        logger.info("get login page");
		return "login/login";
	}
}