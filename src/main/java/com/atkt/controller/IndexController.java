package com.atkt.controller;

import com.atkt.service.product.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class IndexController {

    @Autowired
    private ProductService productService;
    //get log4j handler
    private static final Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping("/")
	public String getIndexPage(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        List products  = productService.listProducts();
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + products);
		return "index";
	}
}