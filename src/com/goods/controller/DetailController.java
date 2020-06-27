package com.goods.controller;

import com.alibaba.fastjson.JSON;
import com.goods.bean.Detail;
import com.goods.service.detail.DetailServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("detail")
public class DetailController {
//    public DetailController(){
//        System.out.println("创建了controller实例");
//    }

    @Autowired
    private DetailServiceIn ds;

    @RequestMapping("selectDetail")
    public@ResponseBody
    String selectDetail(){
        List<Detail> list = ds.selectDetail();
        return JSON.toJSONString(list);
    }

    @RequestMapping("selectDetailById")
    public@ResponseBody String selectDetailById(int id){
        Detail detail = ds.selectDetailById(id);
        return JSON.toJSONString(detail);
    }

    @RequestMapping("test")
    public void test(){
        List<Detail> list =ds.selectDetail();
        for (Detail detail : list){
            System.out.println(detail.toString());
        }
    }
}
