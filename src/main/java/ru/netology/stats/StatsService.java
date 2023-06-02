package ru.netology.stats;

public class StatsService {
    public int salesSumCalculate(int[] sales) {
        int salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 0) {
                salesSum = salesSum + sales[i];
            }
        }
        return salesSum;
    }

    public int salesAverSumCalculate(int[] sales) {
        int salesSum = salesSumCalculate(sales);
        int salesSumAver;
        salesSumAver = salesSum / sales.length;
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
        int salesAverSum = salesAverSumCalculate(sales);
        int qtyMonthA = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= salesAverSum) {
                qtyMonthA++;
            }
        }
        return qtyMonthA;
    }

    public int qtyMonthSalesAboveAver(int[] sales) {
        int salesAverSum = salesAverSumCalculate(sales);
        int qtyMonthB = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= salesAverSum) {
                qtyMonthB++;
            }
        }
        return qtyMonthB;
    }
}
