package com.skype.service;

import com.skype.dao.MsgDao;
import com.skype.domain.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/7.
 */
@Service
public class MsgService {
    @Autowired
    private MsgDao msgDao;


    public void insertMsg(MessageBean bean){
         msgDao.insertMsg(bean);
    }


}
