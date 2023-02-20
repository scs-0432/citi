package com.citi.arcm.control;

import com.citi.arcm.openfeign.JBPM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 大菠萝
 * @date 2023/02/20 14:31
 **/
@RestController
@RequestMapping("/arcm")
public class Arcmcontrol {
    private JBPM jbpm;

    @Autowired
    public Arcmcontrol(JBPM jbpm) {
        this.jbpm = jbpm;
    }

    @RequestMapping("/test")
    public String testJPBM() {
       return jbpm.test();
    }

    @RequestMapping("/testtt")
    public String get() {
        return "1";
    }



}