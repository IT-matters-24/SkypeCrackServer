package com.skype.dao;

import com.skype.domain.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/8/7.
 */
@Repository
public class MsgDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertMsg(MessageBean bean){

    }


}
