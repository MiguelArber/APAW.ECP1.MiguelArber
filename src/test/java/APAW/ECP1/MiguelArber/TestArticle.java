package APAW.ECP1.MiguelArber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import APAW.ECP1.MiguelArber.Article;

public class TestArticle {
	
	private Article article;
	
	@Before
	public void before() {
		
		article = new Article(1, "ref#123"); //Constructor 1
		
	}
	
	@Test
	public void testID() {
		
		assertEquals(1, article.getID());
		
	}
	
	@Test
	public void testReference() {
		
		assertEquals("ref#123", article.getReference());
		
	}
	
	@Test
	public void testStock() {
		
		assertEquals(0, article.getStock());
		article.setStock(10);
		assertEquals(10, article.getStock());
		
	}
}
