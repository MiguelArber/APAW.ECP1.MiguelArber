package APAW.ECP1.MiguelArber.Strategy;

import java.lang.Math;

public class RealRoot extends QuadraticEquationStrategy {
	
	private float delta;

	public RealRoot(float a, float b, float c, float delta) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.delta = delta;
	}
	
	@Override
	public int solve() {
		
		if(delta == 0) {
			
			float root;
			root = (b*(-1))/2*a;
			
			System.out.println("This equation has a single real root: " + root);
			
			return 1; //For testing purposes, returns the number of real roots
			
		} else {
			
			float root1;
			float root2;
			
			root1 = (float) ((b*(-1)) + Math.sqrt(delta)/2*a);
			root2 = (float) ((b*(-1)) - Math.sqrt(delta)/2*a);
			
			System.out.println("This equation has two real roots: " + "\n" + "\t root1: " + root1 + "\n" + "\t root2: " + root2);
			
			return 2; //For testing purposes, returns the number of real roots
			
		}
		
		
	}

}
