package com.skype.service;

import com.google.gson.Gson;
import com.skype.domain.MessageBean;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;


/**
 * Created by Administrator on 2016/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MsgServiceTest {

    @Autowired
    MsgService msgService;


    @Test
    public void testDealMsg() throws IOException {
        MessageBean bean = new MessageBean();
        bean.setId(92);
        bean.setBody_xml("你好");
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://localhost:8080/dealMsg.do");
        post.setHeader("accept", "application/json");
        Gson gson = new Gson();

        StringEntity entity = new StringEntity(gson.toJson(bean));
        entity.setContentType("application/json;charset=utf-8");


        post.setEntity(entity);
        HttpResponse response = httpClient.execute(post);

    }


}