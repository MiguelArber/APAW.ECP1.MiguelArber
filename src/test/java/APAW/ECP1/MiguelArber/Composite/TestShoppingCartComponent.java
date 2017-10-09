package APAW.ECP1.MiguelArber.Composite;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import APAW.ECP1.MiguelArber.ShoppingCart;
import APAW.ECP1.MiguelArber.Builder.ShoppingCartBuilder;
import APAW.ECP1.MiguelArber.Composite.ShoppingCartComponent;
import APAW.ECP1.MiguelArber.Composite.ShoppingCartComposite;
import APAW.ECP1.MiguelArber.Composite.ShoppingCartLeaf;

public class TestShoppingCartComponent {
	
	private ShoppingCartComposite shoppingCartRoot;
	private ShoppingCartComposite shoppingCartGruop1;
	private ShoppingCartComposite shoppingCartGruop2;
	
	private ShoppingCart cart1;
	private ShoppingCart cart2;
	private ShoppingCart cart3;
	private ShoppingCart cart4;
	
	@Before
	public void before() {
		
		cart1 = new ShoppingCartBuilder().addId(1).addName("Cart1").addUrgent(false).build();
		cart2 = new ShoppingCartBuilder().addId(2).addName("Cart2").addUrgent(false).build();
		cart3 = new ShoppingCartBuilder().addId(3).addName("Cart3").addUrgent(false).build();
		cart4 = new ShoppingCartBuilder().addId(4).addName("Cart4").addUrgent(false).build();
		
		shoppingCartRoot = new ShoppingCartComposite("Root");
		shoppingCartGruop1 = new ShoppingCartComposite("Group1");
		shoppingCartGruop2 = new ShoppingCartComposite("Group2");
		
		shoppingCartRoot.add(new ShoppingCartLeaf(cart1)); //Add a leaf to the root
		shoppingCartRoot.add(shoppingCartGruop1); //Add a group to the root
		shoppingCartGruop1.add(shoppingCartGruop2); //Add a group to the Group1
		shoppingCartGruop1.add(new ShoppingCartLeaf(cart2)); //Add a leaf to the Group1
		shoppingCartGruop2.add(new ShoppingCartLeaf(cart3)); //Add a leaf to the Group2
		shoppingCartGruop2.add(new ShoppingCartLeaf(cart4)); //Add a leaf to the Group2
		
		
		
	}
	
	@Test
	public void viewLeafTest() {
		
		assertEquals("1", shoppingCartRoot.cartComponentList.get(0).view());
	}
	
	@Test
	public void viewCompositeTest() {
		
		assertEquals("Group1", shoppingCartRoot.cartComponentList.get(1).view());
	}
	
	@Test
	public void isCompositeTest() {
		
		assertEquals(true, shoppingCartRoot.cartComponentList.get(1).isComposite());
		assertEquals(false, shoppingCartRoot.cartComponentList.get(0).isComposite());
	}
	
	@Test
	public void removeLeafTest() {
		
		shoppingCartRoot.cartComponentList.remove(0);
		assertEquals("Group1", shoppingCartRoot.cartComponentList.get(0).view());
		
	}
	
	@Test
	public void removeCompositeTest() {
		
		shoppingCartRoot.add(new ShoppingCartLeaf(cart1)); //Add a leaf to the root since we removed it on the last test
		shoppingCartRoot.cartComponentList.remove(1);
		assertEquals("1", shoppingCartRoot.cartComponentList.get(0).view());
		
	}

}