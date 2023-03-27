package com.example.forest;

import com.dtflys.forest.annotation.*;

/**
 * @ClassName: client
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月27日 9:48
 * @Version: 1.0
 **/
public interface ForestClient {
    @Post(url="https://open.ys7.com/api/lapp/token/get",sslProtocol = "Tls",contentType = "application/x-www-form-urlencoded")
    String getToken(@Body("appKey") String appKey, @Body("appSecret")String appSecret);
}
