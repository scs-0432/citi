package com.citi.jbpm.business.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 大菠萝
 * @date 2023/02/20 14:52
 **/
@RestController
public class TetsControl {

    @PostMapping(value = "/test/testJBPM")
    String test(){
        return "success";
    }
}