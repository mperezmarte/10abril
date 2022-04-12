package entornos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {

  @BeforeSuite
  public void beforeTest() {
	  System.out.println("Empezando");
  }


  
  @Test(priority=1)
  public void testSuma() {
	  int resultado= Calculadora.suma(2, 3);
		int esperado=5;
		
		assertEquals(esperado, resultado);
  }
  
  @Test(priority=2)
	public void testResta() {
		int resultado= Calculadora.resta(5, 3);
		int esperado=2;
		
		assertEquals(esperado, resultado);
		
	}

	@Test(priority=3)
	public void testMultiplicacion() {
		int resultado= Calculadora.multiplicacion(5, 3);
		int esperado=15;
		
		assertEquals(esperado, resultado);
		
	}

	@Test(priority=4)
	public void testDivision() {
		int resultado= Calculadora.division(3, 5);
		int esperado=0;
		
		assertEquals(esperado, resultado);
		
	}
  
  @AfterSuite
  public void afterTest() {
	  System.out.println("Acabado");
  }

}
