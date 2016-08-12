package com.skype.web;

import com.skype.service.UserInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/8/12.
 */

@Controller
public class UserInfoController {
    private static final Logger logger = LogManager.getLogger(UserInfoController.class);

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/getMaxID")
    public @ResponseBody String getMaxID(@RequestParam("userName") String userName) {
        logger.debug(userName);

        // System.out.println(Charset.defaultCharset());
        // return msgService.dealMsg(bean);
        return String.valueOf(userInfoService.queryMaxID(userName));
    }
}
