package com.example.apiinterface;

import com.example.apiclientsdk.client.ApiClient;
import com.example.apiclientsdk.model.userr;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private ApiClient apiClient;

    @Test
    void contextLoads() {
        userr user = new userr();
        user.setName("moxiaofei");
        String result = apiClient.getNameByPost(user);
        System.out.println(result);
    }

}
