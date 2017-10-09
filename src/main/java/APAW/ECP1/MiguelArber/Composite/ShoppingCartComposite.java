package APAW.ECP1.MiguelArber.Composite;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartComposite extends ShoppingCartComponent {
	
	List<ShoppingCartComponent> cartComponentList;
	private String name;
	
	public ShoppingCartComposite (String name) {
		
		this.name = name;
		cartComponentList = new ArrayList<>();
		
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public void add(ShoppingCartComponent cartComponent) {
		cartComponentList.add(cartComponent);
		
	}

	@Override
	public void remove(ShoppingCartComponent cartComponent) {
		cartComponentList.remove(cartComponent);
		
	}

	@Override
	public String view() {
		
		return name;
		
	}

}
