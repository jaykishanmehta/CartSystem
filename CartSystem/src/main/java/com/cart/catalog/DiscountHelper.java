package com.cart.catalog;

import java.util.Scanner;

import com.cart.business.DiscountMaster;

public class DiscountHelper {

	public static void main(String[] args) {
		
		System.out.println(" -- Discount Helper -- ");

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter bill amount: ");
			System.out.println("Final Bill amount: " + getDiscountedPrice(sc.nextFloat()));
		}
		
	}

	public static float getDiscountedPrice(float amount) {
		
		DiscountMaster discountMaster = new DiscountMaster();
		
		amount -= amount* discountMaster.getDiscountForAmount(amount) /100;
		
		return amount;
	}
}
