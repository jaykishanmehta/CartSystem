package com.cart.catalog;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountHelperTest {

	@Test
	public void test() {
		assertTrue("Discounted amount of 5000 should 5000 ", DiscountHelper.getDiscountedPrice(5000) == 5000);
		assertTrue("Discounted amount of 10000 should 9500 ", DiscountHelper.getDiscountedPrice(10000) == 9500);
		assertTrue("Discounted amount of 15000 should 13500 ", DiscountHelper.getDiscountedPrice(15000) == 13500);
	}

}
