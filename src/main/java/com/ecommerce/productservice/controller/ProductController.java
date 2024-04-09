package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Products")
public class ProductController {

    //https://fakestoreapi.com/products/1
    //About Pathvariable
    @GetMapping("/{id}/{name}")
    public String getProductById(@PathVariable("id") int id, @PathVariable("name") String name)
    {
        return ("Product Id is "+id+" " +name);
    }
    //About POST method
    //ProductController ProductController --> Converts received json into java object
    @PostMapping("")
    public Product CreateProduct(@RequestBody Product val)
    {
        System.out.println(val.getId());
        System.out.println(val.getName());
        val.setName("test");
        System.out.println(val.getName());
        return val;
    }

}
