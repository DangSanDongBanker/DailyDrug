package com.dailyDrug.controller;

import com.dailyDrug.Service.ProductService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class UserController {

    @Resource
    private ProductService productService;

}
