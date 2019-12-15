package com.cart.business;

import java.util.Map;
import java.util.TreeMap;

import com.cart.model.Discount;

/**
 * Master class which will contains all the ranges of discount.<br>
 * This class will help to retrive the rate amount and adding and updated discount range.
 * 
 * @author Jaykishan
 */
public class DiscountMaster {
	
	private static final Map<Integer, Discount> discountRange = new TreeMap<Integer, Discount>();
	
	static {
		initDefaultDiscount();
	}

	/**
	 * Initialize discount ranges to default values
	 * 
	 */
	private static void initDefaultDiscount() {
		discountRange.put(1, new Discount(1, 4999, 0));
		discountRange.put(5000, new Discount(5000, 9999, 10));
		discountRange.put(10000, new Discount(10000, 1000000, 20));
	}
	
	/**
	 * Retrieve relevant discount rate from amount range.
	 * 
	 * @param amount
	 * @return
	 */
	public float getDiscountForAmount(float amount) {
		float rate = 0;
		
		for (Discount dis : discountRange.values()) {
			if(amount > dis.getStartRange() && amount < dis.getEndRange()) {
				return dis.getRate();
			}
		}
		
		return rate;
	}
	

}
