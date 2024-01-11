package com.example.apiinterface.client;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.example.apiinterface.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

// 客户端代码
public class TestClient {

    public String getNameByGet(String name){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", "123");

        String result3= HttpUtil.get("http://localhost:8123/api/name/", paramMap);
        System.out.println(result3);

        return result3;
    }

    public String getNameByPost(@RequestParam String name){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", "123");

        String result= HttpUtil.post("http://localhost:8123/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPosts(@RequestBody User user){
        String json = JSONUtil.toJsonStr(user);
        String result2 = HttpRequest.post("http://localhost:8123/api/name/User/")
                .body(json)
                .execute().body();
        System.out.println(result2);
        return result2;
    }
}
