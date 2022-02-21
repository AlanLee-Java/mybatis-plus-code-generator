package com.alanlee;

/**
 * 计算表后缀
 *
 * @author AlanLee
 * @date 2022-02-10
 */
public class CalculationTableSuffix {

    public static void main(String[] args) {
        String databaseId = "620cc173c37c59555cfed817";
        // 获取hashCode绝对值
        int hashCode = Math.abs(databaseId.hashCode());
        String index = String.valueOf(hashCode % 128);
        System.out.println(index);
        // 计算采样间隔
        System.out.println(20 % 10);
    }

}