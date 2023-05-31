package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void salesSum() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualA = service.salesSumCalculate(sales);
        System.out.println(actualA);
    }

    @Test
    public void salesAverSum() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualB = service.salesAverSumCalculate(sales);
        System.out.println(actualB);
    }

    @Test
    public void minSales() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualC = service.minSales(sales);
        System.out.println(actualC);
    }

    @Test
    public void maxSales() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualD = service.maxSales(sales);
        System.out.println(actualD);
    }

    @Test
    public void tyMonthSalesBelowAver() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualE = service.qtyMonthSalesBelowAver(sales);
        System.out.println(actualE);
    }

    @Test
    public void qtyMonthSalesAboveAver() {
        int[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        StatsService service = new StatsService();
        int actualF = service.qtyMonthSalesAboveAver(sales);
        System.out.println(actualF);
    }
}
