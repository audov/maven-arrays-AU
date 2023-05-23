package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int salesSum = service.salesSumCalculate(sales);
        int salesSumAver = service.salesAverSumCalculate(sales);
        int minMonth = service.minSales(sales);
        int maxMonth = service.maxSales(sales);
        int qtyMonthA = service.qtyMonthSalesBelowAver(sales);
        int qtyMonthB = service.qtyMonthSalesAboveAver(sales);
        System.out.println(salesSum);
        System.out.println(salesSumAver);
        System.out.println(minMonth);
        System.out.println(maxMonth);
        System.out.println(qtyMonthA);
        System.out.println(qtyMonthB);
    }
}
