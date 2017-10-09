package APAW.ECP1.MiguelArber.Strategy;

public class ImaginaryRoot extends QuadraticEquationStrategy {

	
	public ImaginaryRoot() {
		
	}
	
	public ImaginaryRoot(float a, float b, float c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	@Override
	public int solve() {
		
		System.out.println("This equation has no real roots!");
		
		return 0; //For testing purposes, returns the number of real roots
	}

}
