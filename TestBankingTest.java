import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankingTest {

	@Test
	public void test() {
		 Savings a=new Savings("ahbv",1,10000);
		 System.out.println("Savings Account: ");
		 a.display();
		 int x=a.display();
		 Current b=new Current("aashbv",2,20000);
		 System.out.println("\nCurrent Account: ");
		 b.display();
		 int y=b.display();
		 assertEquals(10000,x);

		 assertEquals(20000,y);
		 
	
	}

}
