package APAW.ECP1.MiguelArber.Strategy;

import java.lang.Math;

public class EquationCalculator {
	
	private QuadraticEquationStrategy quadraticEquation;
	
	public void quadraticEquationStrategy(float a, float b, float c) {
		
		float delta;
		delta = (float) ((Math.pow(b, 2)) - 4*(a*c));
		System.out.println("Delta = " + delta);
		
		if(delta >= 0) {
			
			quadraticEquation = new RealRoot(a, b, c, delta);
			
		} else {
			
			quadraticEquation = new ImaginaryRoot();
			
		}
		
	}
	
	public int solve() {
		
		return quadraticEquation.solve();
		
	}

}
