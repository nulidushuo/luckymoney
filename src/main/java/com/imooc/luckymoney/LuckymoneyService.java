package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @program: luckymoney
 * @description:
 * @author: JIANG Ziyang
 * @create: 2019-08-06 15:10
 **/
@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    /**
     * 指数据库事务
     * eg：扣库存-创建订单
     * mysql引擎用Inodb
     */
    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setMoney(new BigDecimal("520"));
        luckymoney1.setProducer("jzy");
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setMoney(new BigDecimal("1314"));
        luckymoney2.setProducer("jzy");
        repository.save(luckymoney2);
    }
}
