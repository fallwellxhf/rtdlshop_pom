package com.hf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hf.entity.Goods;
import com.hf.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
   @Reference
   private IGoodsService goodsService;


    /**
     *商品列表
     * @return
     */
    @RequestMapping("/list")
    public String goodsList(Model model){
        List<Goods> goods = goodsService.queryAll();
        System.out.println("调用商品服务获得商品列表："+goods);
        Goods goods1 = new Goods();
        model.addAttribute("goods1", goods);
        return "goodslist";
    }





}
