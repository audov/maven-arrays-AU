package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testOptions() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualA = service.salesSumCalculate(sales);
        int actualB = service.salesAverSumCalculate(sales);
        int actualC = service.minSales(sales);
        int actualD = service.maxSales(sales);
        int actualE = service.qtyMonthSalesBelowAver(sales);
        int actualF = service.qtyMonthSalesAboveAver(sales);
        System.out.println(actualA);
        System.out.println(actualB);
        System.out.println(actualC);
        System.out.println(actualD);
        System.out.println(actualE);
        System.out.println(actualF);
    }
}
