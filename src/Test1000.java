import static org.junit.Assert.*;

import org.junit.Test;

public class Test1000 {

	@Test
	public void test() {
		ShoppingCart1 obj = new ShoppingCart1();
		assertTrue(obj.getPcount()==0);
		
	}
	
	@Test
	public void test1() {
		ShoppingCart1 obj1 = new ShoppingCart1();
		obj1.AddBook("Java Book", 127, 1);
		assertTrue(obj1.getPcount()==1 && obj1.getPcost()==127);
		
	}
	
	@Test
	public void test2() {
		ShoppingCart1 obj2 = new ShoppingCart1();
		obj2.AddBook("Java Book", 127, 1);
		obj2.AddBook("Web design Book", 100, 1);
		assertTrue(obj2.getPcount()==2 && obj2.getPcost()==227);
		
	}

}
