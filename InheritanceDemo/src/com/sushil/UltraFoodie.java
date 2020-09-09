package com.sushil;

public class UltraFoodie extends SuperFoodie {
	
	public int rewardPoints;
	public UltraFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount) {
		super(foodieId, foodieName, city, mobileNo, discount);
	}
	
	public void calculateTotalPriceWithRewardPoints(Pizza[] pizzaList) {
		this.calculateTotalPriceWithDiscount(pizzaList);
		rewardPoints = (int)(totalPrice/10);
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
    
	//respective getter and setter functions
	
}
