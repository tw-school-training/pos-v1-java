package com.thoughtworks.pos;

public class Printer {
    public String print(String[] items) {

        //请删除下面直接返回字符串, 重新做逻辑实现
        return "***<没钱赚商店>收据***\n" +
          "----------------------\n" +
          "名称：可乐，数量：5瓶，单价：3.00(元)，小计：15.00(元)\n" +
          "名称：羽毛球，数量：2个，单价：1.00(元)，小计：2.00(元)\n" +
          "名称：苹果，数量：3斤，单价：5.50(元)，小计：16.50(元)\n" +
          "名称：香蕉，数量：3.4斤，单价：4.00(元)，小计：13.60(元)\n" +
          "----------------------\n" +
          "买二赠一免费商品：\n" +
          "名称：可乐，数量：1瓶，价值：3.00(元)\n" +
          "----------------------\n" +
          "总计：44.10(元)\n" +
          "节省：3.00(元)\n" +
          "**********************\n";
    }
}

