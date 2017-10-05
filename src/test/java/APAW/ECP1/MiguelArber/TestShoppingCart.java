package APAW.ECP1.MiguelArber;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import APAW.ECP1.MiguelArber.ShoppingCart;

public class TestShoppingCart {
	
	private ShoppingCart cart;
	private ShoppingCart cart2;
	
	@Before
	public void before() {
		
		cart = new ShoppingCart(1, "Carrito", false); //Constructor 1
		cart2 = new ShoppingCart(1, Calendar.getInstance(), "Carrito2", false, new ArrayList<Article>()); //Constructor 2
		
	}
	
	@Test
	public void testID() {
		
		assertEquals(1, cart.getID());
		
	}
	
	@Test
	public void testName() {
		
		assertEquals("Carrito", cart.getName());
		cart.setName("Cart");
		assertEquals("Cart", cart.getName());
		
	}
	
	@Test
	public void testUrgent() {
		
		assertEquals(false, cart.isUrgent());
		
	}

	@Test
	public void testDate() {
		
		Calendar date = Calendar.getInstance();
		assertEquals(true, cart.getDate().before(date));
		
	}
	
	@Test
	public void testArticles() {
		
		assertEquals(null, cart.getArticle(1));
		Article a = new Article(1, "ref#123");
		cart.addArticle(a);
		assertEquals(a, cart.getArticle(1));
		cart.removeArticle(1);
		assertEquals(null, cart.getArticle(1));
	}
	
}