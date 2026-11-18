
package com.mycompany.salesreport;

import java.util.Scanner;

public class SalesReport {
// Sales Report Main
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        
        // Objects
        Product product = new Product();
        
        cozyNights = product.setCozy();
        restonicBarbados = product.setRestonic();
        sealyPhuket = product.setSealy();
        
        System.out.print("Enter Cozy Nights: ");
        cozyNights = input.nextInt();
        System.out.print("Enter Restonic Barbados: ");
        restonicBarbados = input.nextInt();
        System.out.print("Enter Sealy Phuket: ");
        sealyPhuket = input.nextInt();
        
        // Output
        System.out.printf("PRODUCT SALES REPORT - 2026\n ****************************************************\n TOTAL PRODUCT SALES: %f\n AVERAGE PRODUCT SALES: %f\n MOST POPULAR PRODUCT: %s\n", 
                product.getTotalProductsSold(), product.getAverageProductSold(), product.getMostPopularProduct());
    }
}
