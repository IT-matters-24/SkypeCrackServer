package com.skype.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/8/12.
 */

@Repository
public class UserInfoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int queryMaxID(String userName) {
        if (userName.equals("jyc1992928"))
            return 1000;
        return 0;
    }
}
