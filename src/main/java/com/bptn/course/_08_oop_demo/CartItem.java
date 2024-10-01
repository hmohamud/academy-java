package com.bptn.course._08_oop_demo;

class CartItem {
	
	private Product product;
	private int cartQuantity;
	
	public CartItem(Product product, int cartQuantity) {
		if(cartQuantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient stock!");
		}
		
		this.product = product;
		this.cartQuantity = cartQuantity;
	}
	
	//Getters/Accessors
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getCartQuantity() {
		return this.cartQuantity;
	}
	
	public double getTotalPrice() {
		return this.product.getProductPrice() * this.cartQuantity;
	}
	

}
