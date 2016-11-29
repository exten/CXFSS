package com.it.h2.m0.api.dao;

import com.it.h2.m0.api.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by flower9 on 12/11/2016.
 */
public interface IUserDao {
    List<UserVO> findUsersByName(@Param("name") String name);
}
