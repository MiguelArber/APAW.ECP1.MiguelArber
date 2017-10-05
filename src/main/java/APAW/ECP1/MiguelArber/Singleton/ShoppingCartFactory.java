package APAW.ECP1.MiguelArber.Singleton;

import java.util.HashMap;
import java.util.Map;

import APAW.ECP1.MiguelArber.ShoppingCart;

public class ShoppingCartFactory {

	private static final ShoppingCartFactory INSTANCE = new ShoppingCartFactory();
	
	private Map<Integer, ShoppingCart> carts;
	private ShoppingCart shoppingCart;
	
	private ShoppingCartFactory() {

		carts = new HashMap<>();
		
	}
	
	public static ShoppingCartFactory getInstance() {
		
		return INSTANCE;
		
	}
	
	public ShoppingCart getShoppingCart(int key) {
		
		ShoppingCart result = this.carts.get(key);
		
		if (shoppingCart == null)
			this.carts.put(key, shoppingCart = new ShoppingCart(key));
		
		result = shoppingCart;
		return result;
		
	}
	
	public ShoppingCart removeShoppingCart(int key)  {
		
		return this.carts.remove(key);
		
	}
	
}
