package com.example.controller;

import com.example.forest.ForestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName: indexController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月27日 9:31
 * @Version: 1.0
 **/
@Controller
public class indexController {

    @Resource
    ForestClient client;

    @GetMapping("/getToken")
    @ResponseBody
    String getToken() {
        String appKey="31dfc5c5998a4bacacaed6f2754d7c28";
        String appSecret="f667333cc801ffeae7c059dade423802";
        String token = client.getToken(appKey, appSecret);
        return token;
    }

    @GetMapping("/")
    String index() {
        return "index";
    }
}
