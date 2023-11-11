package com.ddcode.jenkins.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 15810
 */
@Slf4j
@RestController
public class ApiController {

    @RequestMapping("/jenkins/start")
    public String start(){
        log.info("hello jenkins");
        return "hello jenkins";
    }
}
