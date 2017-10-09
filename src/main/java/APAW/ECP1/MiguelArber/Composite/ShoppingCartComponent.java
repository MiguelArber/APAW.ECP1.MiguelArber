package APAW.ECP1.MiguelArber.Composite;

public abstract class ShoppingCartComponent {
	
    public abstract boolean isComposite();
    
    public abstract void add(ShoppingCartComponent cartComponent);
    
    public abstract void remove(ShoppingCartComponent cartComponent);
    
    public abstract String view();

}
