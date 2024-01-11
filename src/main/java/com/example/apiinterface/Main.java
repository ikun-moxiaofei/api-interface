package com.example.apiinterface;

import com.example.apiinterface.client.TestClient;
import com.example.apiinterface.model.User;

public class Main {
    public static void main(String[] args) {
        TestClient testClient = new TestClient();
        String str1 = testClient.getNameByGet("get");
        String str2 = testClient.getNameByPost("Post");
        User user = new User();
        user.UserName = "PostPost";
        String str3 = testClient.getNameByPosts(user);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
