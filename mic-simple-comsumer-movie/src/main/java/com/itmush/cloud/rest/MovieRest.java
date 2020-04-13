package com.itmush.cloud.rest;

import com.itmush.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MovieRest
 * @Description TODO
 * @Author fubinD
 * @Date 2020/4/13
 */
@RestController
public class MovieRest {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }

}
