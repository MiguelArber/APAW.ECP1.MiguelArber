package APAW.ECP1.MiguelArber.Strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import APAW.ECP1.MiguelArber.Strategy.EquationCalculator;

public class StrategyTest {
	
	private EquationCalculator equationCalculator;
	
	@Before
	public void before() {
		
		equationCalculator = new EquationCalculator();
		
	}
	
	@Test
	public void testOneRealRootEquation() {
		
		equationCalculator.quadraticEquationStrategy(4, 4, 1);
		assertEquals(1, equationCalculator.solve());
		
	}
	
	@Test
	public void testTwoRealRootEquation() {
		
		equationCalculator.quadraticEquationStrategy(3, 5, 2);
		assertEquals(2, equationCalculator.solve());
		
	}
	
	@Test
	public void testNoRealRootEquation() {
		
		equationCalculator.quadraticEquationStrategy(5, 1, 2);
		assertEquals(0, equationCalculator.solve());
		
	}

}
