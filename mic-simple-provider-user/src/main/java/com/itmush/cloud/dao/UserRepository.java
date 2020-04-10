package com.itmush.cloud.dao;

import com.itmush.cloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author fubinD
 * @Date 2020/4/10
 */
@Mapper
public interface UserRepository {

    List<User> findAll();

    User findById(@Param("id") Long id);

}
