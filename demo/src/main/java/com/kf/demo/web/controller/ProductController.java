package com.kf.demo.web.controller;

import com.kf.demo.dao.ProductDao;
import com.kf.demo.model.Product;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    //Récupérer la liste des produits
    @GetMapping(value = "/Produits")
    public List <Product> listeProduits() {
        return productDao.findAll();
    }


    }

