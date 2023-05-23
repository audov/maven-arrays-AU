package ru.netology.stats;

import java.util.stream.IntStream;

public class StatsService {
    public int salesSumCalculate(int[] sales) {
        int salesSum = IntStream.of(sales).sum();
        return salesSum;
    }

    public int salesAverSumCalculate(int[] sales) {
        int salesSumAver = IntStream.of(sales).sum() / sales.length;
        return salesSumAver;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int qtyMonthSalesBelowAver(int[] sales) {
        int salesAverSum = IntStream.of(sales).sum() / sales.length;
        int qtyMonthA = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= salesAverSum) {
                qtyMonthA++;
            }
        }
        return qtyMonthA;
    }

    public int qtyMonthSalesAboveAver(int[] sales) {
        int salesAverSum = IntStream.of(sales).sum() / sales.length;
        int qtyMonthB = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= salesAverSum) {
                qtyMonthB++;
            }
        }
        return qtyMonthB;
    }
}