package com.cart.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountMasterTest {

	@Test
	public void getDiscountForAmount() {
		DiscountMaster discountMaster = new DiscountMaster();
		assertTrue("Discount rate of 5000 should 0", discountMaster.getDiscountForAmount(5000) == 0);
		assertTrue("Discount rate of 9000 should 10", discountMaster.getDiscountForAmount(9000) == 10);
		assertTrue("Discount rate of 12000 should 20", discountMaster.getDiscountForAmount(12000) == 20);
	}

}
