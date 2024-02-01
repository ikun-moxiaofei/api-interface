package com.example.apiinterface.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import com.example.apiclientsdk.model.userr;
import com.example.apiclientsdk.utils.SignUtils;


@RestController
@RequestMapping("name")
public class TestController {

    @GetMapping("/get")
    public String getNameByGet(String name){
        return "get "+name;
    }
    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "post "+name;
    }
    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody userr user, HttpServletRequest request) {
        // 从请求头中获取名为 "accessKey" 的值
        // 从请求头中获取参数
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

//        // 判断accessKey是否存在
//        // 从数据库中获取名为 "secretKey" 的值
////        String secretKey = userService.("accessKey");
////        QueryWrapper<User> wrapper =new QueryWrapper<>();
////        wrapper.eq("accessKey",accessKey);
////        User user_= (User) userMapper.selectOne(wrapper);
////        if (user_.getId()==null){
////            throw new RuntimeException("无权限");
////        }
////        String secretKey = user_.getSecretkey();
////        System.out.println(secretKey);
//
//        // 校验随机数，模拟一下，直接判断nonce是否大于10000
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//

//        Long nowtime = System.currentTimeMillis() / 1000;
//        if ((nowtime - new Long(timestamp)) >= 5*60) {
//            throw new RuntimeException("无权限");
//        }

//        String sign_ = SignUtils.genSign(body,"abcdefg");
//
//
//        // 如果 accessKey 不等于 "mxf" 或者 secretKey 不等于 "abcdefg"
//        if (!sign.equals(sign_)) {
//            // 抛出一个运行时异常，表示权限不足
//            throw new RuntimeException("无权限");
//        }
        // 如果权限校验通过，返回 "POST 用户名字是" + 用户名
        return "POST 用户名字是" + user.getName();
    }

}
