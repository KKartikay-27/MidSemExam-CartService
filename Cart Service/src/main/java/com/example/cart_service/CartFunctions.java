package com.example.cart_service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartFunctions {

    @RequestMapping("/")
    public String welcomeHandler() {
        return "Welcome";
    }


    @RequestMapping("/carts")
    public void getAll(){
    }


    @RequestMapping("/carts/{id}")
    public void getASingle(@PathVariable String id){
    }

    @RequestMapping("/userCart")
    public void getUserCart(){
    }

    @RequestMapping("/newItem")
    public void add(){
    }

    @RequestMapping("/upCart")
    public void updateCart(){
    }






}
