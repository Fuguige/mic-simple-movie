package com.itmush.cloud.rest;

import com.itmush.cloud.dao.UserRepository;
import com.itmush.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserRest
 * @Description TODO
 * @Author fubinD
 * @Date 2020/4/10
 */
@RestController
public class UserRest {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findById(id);
        return user;
    }
}
