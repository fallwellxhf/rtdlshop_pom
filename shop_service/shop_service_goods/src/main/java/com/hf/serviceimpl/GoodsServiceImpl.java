package com.hf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hf.dao.GoodsMapper;
import com.hf.entity.Goods;
import com.hf.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> queryAll() {
        return goodsMapper.selectList(null);
    }

    @Override
    public int insert(Goods goods) {
        return goodsMapper.insert(goods);
    }

    @Override
    public Goods queryById(int gid) {
        return goodsMapper.selectById(gid);
    }
}
