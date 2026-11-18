
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
    private final int[] cozySold; 
    private final int[] restonicSold;
    private final int[] sealySold;
    
    public Product (int[] cozySold, int[] restonicSold, int[] sealySold, int total, int average, int popular) { // Constructor
        this.cozySold = cozySold;
        this.restonicSold = restonicSold;
        this.sealySold = sealySold;
        this.total = total;
        this.average = average;
        this.popular = popular;
    }
    
    // Getter
    public int[] getCozy() {
        return this.cozySold;
    }
    public int[] getRestonic() {
        return this.restonicSold;
    }
    public int[] getSealy() {
        return this.sealySold;
    }
    
    // Setter
    public int[] setCozy() {
        return this.getCozy();
    }
    public int[] setRestonic() {
        return this.getRestonic();
    }
    public int[] setSealy() {
        return this.getSealy();
    }
    
    // Combine
    @SuppressWarnings("empty-statement")
    public int[][][] array(int[] cozySold, int[] restonicSold, int[] sealySold) {
        int[][][] combined;
        combined = {cozySold, restonicSold, sealySold};
        return combined;
    }
    
    // Methods
    public int totalSold() {
        this.total = Arrays.stream(this.array(cozySold, restonicSold, sealySold)).sum();
        return this.total;
    }
    
    public double averageSold() {
        double[] convertSells = Arrays.stream(this.array(cozySold, restonicSold, sealySold)).asDoubleStream().toArray();
        this.average = Arrays.stream(convertSells).average().orElse(0.0);
        return this.average;
    }
    
    public String mostPopular() {
        this.popular = Arrays.stream(this.array(cozySold, restonicSold, sealySold)).flatMap(Arrays::stream).max()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        return this.popular;
    }
    
    // Interface
    @Override
    public int getTotalProductsSold() {
        return this.totalSold();
    }

    @Override
    public double getAverageProductSold() {
        return this.averageSold();
    }

    @Override
    public String getMostPopularProduct() {
        return this.mostPopular();
    }    
}
