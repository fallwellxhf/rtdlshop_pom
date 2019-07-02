package com.hf.service;

import com.hf.entity.Goods;

import java.util.List;

public interface IGoodsService {


    List<Goods> queryAll();

    int insert(Goods goods);

    Goods queryById(int gid);

}
