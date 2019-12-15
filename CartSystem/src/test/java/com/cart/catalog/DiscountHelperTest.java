package com.cart.catalog;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountHelperTest {

	@Test
	public void test() {
		DiscountHelper discountHelper = new DiscountHelper();
		assertTrue("Discounted amount of 5000 should 5000 ", discountHelper.getDiscountedPrice(5000) == 5000);
		assertTrue("Discounted amount of 10000 should 9500 ", discountHelper.getDiscountedPrice(10000) == 9500);
		assertTrue("Discounted amount of 15000 should 13500 ", discountHelper.getDiscountedPrice(15000) == 13500);
	}

}
