package com.alanlee;

/**
 * 计算表后缀
 *
 * @author AlanLee
 * @date 2022-02-10
 */
public class CalculationTableSuffix {

    public static void main(String[] args) {
        String databaseId = "61f102dcae9b012e346f064e";
        // 获取hashCode绝对值
        int hashCode = Math.abs(databaseId.hashCode());
        String index = String.valueOf(hashCode % 128);
        System.out.println(index);
    }

}