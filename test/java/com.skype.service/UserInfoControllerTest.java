package com.skype.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserInfoControllerTest {

    private static final Logger logger = LogManager.getLogger(UserInfoControllerTest.class);

    @Test
    public void queryMaxID() throws Exception {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://localhost:8080/getMaxID.html?userName=jyc1992928");

        HttpResponse response = httpClient.execute(get);
        if(response.getStatusLine().getStatusCode()==200){
          //  System.out.println(response.getEntity());A
            String maxID=EntityUtils.toString(response.getEntity());
            Assert.assertEquals(maxID,"1000");
        }
        else {
            logger.debug(response.getStatusLine().getStatusCode());
            Assert.assertNotNull(null);
        }
    }

}