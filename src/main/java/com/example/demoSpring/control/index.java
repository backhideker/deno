package com.example.demoSpring.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller//发处理器会扫描使用该注解的类的方法，并检测该方法是否使用了@RequestMapping注解。
public class index {
    @RequestMapping("/index")//映射请求，也就是通过它来指定控制器可以处理哪些URL请求
    @ResponseBody//java对象转为json格式,注解之后不会再走视图处理器，而是直接将数据写入到输入流中
    public String index() {
        return "helloword!";
    }
    @ResponseBody
    @RequestMapping("/login")
    public String shit(){
        return "this is shit";
    }
    @RequestMapping("/fuck")
     public Map fuck(){
        Map map=new HashMap<>();
        map.put("sadasdassda","sdasds");
        return map;
}

}
