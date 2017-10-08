package APAW.ECP1.MiguelArber.Builder;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import APAW.ECP1.MiguelArber.Article;
import APAW.ECP1.MiguelArber.ShoppingCart;

public class TestShoppingCartBuilder {
	
	private Calendar date;  //Just for testing purposes
	
	@Before
	public void before() {
		date = Calendar.getInstance();
	}
	
	@Test
	public void testShoppingCartIntStringBooleanArticlesCalendar() {
		
		ShoppingCart cart = new ShoppingCartBuilder().addId(1).addName("Cart").addUrgent(true).addArticles(new ArrayList<Article>()).build();
		
		assertEquals(1, cart.getID());
		assertEquals(false, cart.getDate().before(date));
		assertEquals("Cart", cart.getName());
		assertEquals(true, cart.isUrgent());
		assertEquals(null, cart.getArticle(1));
		
	}
	
	@Test
	public void testShoppingCartStringBooleanArticlesCalendar() {
		
		ShoppingCart cart = new ShoppingCartBuilder(1).addName("Cart").addUrgent(true).addArticles(new ArrayList<Article>()).addDate(Calendar.getInstance()).build();
		
		assertEquals(1, cart.getID());
		assertEquals(false, cart.getDate().before(date));
		assertEquals("Cart", cart.getName());
		assertEquals(true, cart.isUrgent());
		assertEquals(null, cart.getArticle(1));
		
	}
	
	
}
