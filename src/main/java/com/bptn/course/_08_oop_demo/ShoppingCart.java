package com.bptn.course._08_oop_demo;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		this.items = new CartItem[5];
		this.itemCount = 0;
	}
	
	public void addProductToCart(Product product, int quantity) {
		if(itemCount <= 4) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceProduct(quantity);
		}
		else {
			throw new IllegalArgumentException("Insufficient stock!");
		}
	}
	
	//showProductInCart
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		for(int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}

}

