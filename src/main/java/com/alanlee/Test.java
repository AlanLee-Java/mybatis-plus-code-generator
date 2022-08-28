package com.alanlee;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // 测试生成核销码
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            Long verificationCode = Long.valueOf(System.currentTimeMillis() + RandomUtil.randomNumbers(3));
            System.out.println(verificationCode);
        }
        System.out.println(System.currentTimeMillis() - startTime);

        // 测试商品价格排序
        Goods goods1 = new Goods();
        goods1.setPrice(new BigDecimal("100"));
        Goods goods2 = new Goods();
        goods2.setPrice(new BigDecimal("300"));
        Goods goods3 = new Goods();
        goods3.setPrice(new BigDecimal("200"));
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        List<Goods> sortGoodsList = ListUtil.sortByProperty(goodsList, "price");
        for (Goods goods : sortGoodsList) {
            System.out.println(goods.getPrice());
        }
    }

}