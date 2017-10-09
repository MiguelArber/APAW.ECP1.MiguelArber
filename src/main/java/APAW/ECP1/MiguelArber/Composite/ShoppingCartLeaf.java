package APAW.ECP1.MiguelArber.Composite;

import APAW.ECP1.MiguelArber.ShoppingCart;

public class ShoppingCartLeaf extends ShoppingCartComponent {
	
	private ShoppingCart cart;
	
	public ShoppingCartLeaf(ShoppingCart cart) {
		
		this.cart = cart;
		
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public void add(ShoppingCartComponent cartComponent) {
		// Do nothing, it is a leaf
		
	}

	@Override
	public void remove(ShoppingCartComponent cartComponent) {
		// Do nothing, it is a leaf
		
	}

	@Override
	public String view() {
		
		return Integer.toString(cart.getID());
	}
	
	public ShoppingCart getShoppingCart() {
		
		return cart;
	}

}
