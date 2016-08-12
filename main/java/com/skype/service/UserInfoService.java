package com.skype.service;

import com.skype.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/12.
 */

@Service
public class UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;


    public int queryMaxID(String userName){
        return userInfoDao.queryMaxID(userName);
    }
}
