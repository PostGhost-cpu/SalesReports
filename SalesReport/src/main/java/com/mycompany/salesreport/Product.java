
package com.mycompany.salesreport;
// Imports
import java.util.Arrays;

public class Product implements IProducts {
// Sales Report Class
    /*
     * Include Methods
     * totalSold() Total Products Sold
     * averageSold() Average Product Sold
     * mostPopular() Most Popular Product
     *
     * Implement Interface IProducts
     *
     *
     */
    
    // Private
    private int[] sells;
    private int total, average, popular;
    
    public Product (int[][][] sells, int total, int average, int popular) { // Constructor
        this.sells = sells;
        this.total = total;
        this.average = average;
        this.popular = popular;
    }
    
    // Setter
    public void setSells(int[] sells) {
        this.sells = sells;
    }
    
    // Getter
    public int[] getSells() {
        return this.sells;
    }
    
    // Methods
    public int totalSold(int[] sells) {
        this.total = Arrays.stream(sells).sum();
        return this.total;
    }
    
    public double averageSold(int[] sells) {
        double[] convertSells = Arrays.stream(sells).asDoubleStream().toArray();
        this.average = Arrays.stream(convertSells).average().orElse(0.0);
        return this.average;
    }
    
    public String mostPopular(int[] sells) {
        this.popular = Arrays.stream(sells).flatMap(Arrays::stream).max()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        return this.popular;
    }
    
    // Interface
    @Override
    public int getTotalProductsSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getAverageProductSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getMostPopularProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
