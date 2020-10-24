package com.wipro.sales.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.service.Administrator;

public class SalesApplication {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Main menu");
		System.out.println("1. Insert Stock");
		System.out.println("2. Delete Stock");
		System.out.println("3. Insert Sales");
		System.out.println("4. View Sales Report");
		System.out.print("Enter your choice: ");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Stock stock;
		Administrator admin = new Administrator();
		
		switch(choice) {
		
		case 1:
			Scanner sc1 = new Scanner(System.in);
			stock = new Stock();
			System.out.print("Enter Stock ID: ");
			stock.setStockID(sc1.nextLine());
			
			System.out.print("Enter Stock name: ");
			String str= sc1.nextLine();
			//System.out.print("You have entered: "+str);    
			stock.setStockName(str);
			
			System.out.print("Enter price for each product : ");
			stock.setProductUnitPrice(sc1.nextFloat());
			
			System.out.print("Enter quantities in hand of stock: ");
			stock.setQuantityOnHand(sc1.nextInt());
			
			System.out.print("Enter recorder level: ");
			stock.setRecorderLevel(sc1.nextInt());
			
			sc1.close();
			System.out.println(admin.insertStock(stock));
			break;
		
		case 2:
			System.out.print("Enter Stock ID to delete stock: ");
			System.out.println(admin.deleteStock(sc.next()));
			break;
		
		case 3:
			
			Sales sale = new Sales();
			System.out.print("Enter Sale ID: ");
			sale.setSalesID(sc.next());
			
			System.out.print("Enter Sale Date in format yyyy-MM-dd ");
			sale.setSalesDate(new SimpleDateFormat("yyyy-MM-dd").parse(sc.next()));
			
			System.out.print("Enter product ID : ");
			sale.setProductID(sc.next());
			
			System.out.print("Enter quantities sold: ");
			sale.setQuantitySold(sc.nextInt());
			
			System.out.print("Enter sale price per unit: ");
			sale.setSalesPricePerUnit(sc.nextDouble());
			
			System.out.println(admin.insertSales(sale));
			break;

		case 4:
			
			ArrayList<SalesReport> arr = admin.getSalesReport();
			Iterator<SalesReport> itr = arr.iterator();
			SalesReport report;
			
			//System.out.println();
			System.out.print("ProductID"+"\t");
			System.out.print("ProductName"+"\t");
			System.out.print("UnitPrice"+"\t");
			System.out.print("ProfitAmount"+"\t");
			System.out.print("QuantitySold"+"\t");
			System.out.print("SalesDate "+"\t");
			System.out.print("SalesID "+"\t");
			System.out.println("SalesPricePerUnit");
			
			while(itr.hasNext()) {
				
				report = itr.next();
				///display
				System.out.print(report.getProductID()+"\t\t");
				System.out.print(report.getProductName()+"\t");
				System.out.print(report.getProductUnitPrice()+"\t\t");
				System.out.print(report.getProfitAmount()+"\t\t");
				System.out.print(report.getQuantitySold()+"\t\t");
				System.out.print(report.getSalesDate()+"\t");
				System.out.print(report.getSalesID()+"\t\t");
				System.out.print(report.getSalesPricePerUnit());
				System.out.println();
			}
			
			break;
			
		default:
			System.out.println("Invalid choice");

		}
		
		sc.close();
		
	}

}
