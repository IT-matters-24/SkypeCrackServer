package com.skype.web;

import com.skype.domain.MessageBean;
import com.skype.service.MsgService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/8/7.
 */
@Controller
public class MsgController {

    private static final Logger logger = LogManager.getLogger(MsgController.class);

    @Autowired
    private MsgService msgService;

    @RequestMapping(value = "/dealMsg2")
    public ModelAndView  dealMsg(@ModelAttribute MessageBean bean) {

        logger.debug("id111: " + bean.getId());
        logger.debug("body_xml: " + bean.getBody_xml());
        //System.out.println();
        // return msgService.dealMsg(bean);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("connect");
        mav.addObject("bean",bean);
        return mav;
        //XmlWebApplicationContext
    }

    @RequestMapping(value = "/insertMsg")
    public @ResponseBody String insertMsg(@RequestBody MessageBean bean) {
        logger.debug("id: " + bean.getId());
        logger.debug("body_xml: " + bean.getBody_xml());
       // System.out.println(Charset.defaultCharset());
        // return msgService.dealMsg(bean);

        return "OK";
    }



}
