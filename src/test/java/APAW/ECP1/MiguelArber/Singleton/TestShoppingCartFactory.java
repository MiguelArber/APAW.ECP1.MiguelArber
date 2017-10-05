package APAW.ECP1.MiguelArber.Singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestShoppingCartFactory {
	
    @Test
    public void testIsSingleton() {
        assertSame(ShoppingCartFactory.getInstance(), ShoppingCartFactory.getInstance());
    }
    
    @Test
    public void testIsNotNull() {
        assertNotNull(ShoppingCartFactory.getInstance());
    }
    
    @Test
    public void testGetShoppingCart() {
    	
    	assertNotNull(ShoppingCartFactory.getInstance().getShoppingCart(1));
    	assertEquals(1, ShoppingCartFactory.getInstance().getShoppingCart(1).getID());
    }
    
    @Test
    public void testRemoveShoppingCart() {
    	
    	assertNotNull(ShoppingCartFactory.getInstance().getShoppingCart(1));
    	assertEquals(ShoppingCartFactory.getInstance().getShoppingCart(1), ShoppingCartFactory.getInstance().removeShoppingCart(1));
    }

}
