package com.cart.model;

public class Discount {

	private int startRange;
	private int endRange;
	private float rate;
	
	public Discount(int startRange, int endRange, float rate) {
		super();
		this.startRange = startRange;
		this.endRange = endRange;
		this.rate = rate;
	}
	
	public int getStartRange() {
		return startRange;
	}
	
	public int getEndRange() {
		return endRange;
	}
	
	public float getRate() {
		return rate;
	}

	@Override
	public String toString() {
		return "Discount [startRange=" + startRange + ", endRange=" + endRange + ", rate=" + rate + "]";
	}
	
}
