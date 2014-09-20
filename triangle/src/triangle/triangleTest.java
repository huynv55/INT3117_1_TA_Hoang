package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	@Test
	public void testIstriangle() {
		triangle tri = new triangle();
		int kq = tri.Istriangle(3, 4, 5);
		assertEquals(4, kq);
		assertEquals(0, tri.Istriangle(1, 2, 3));
		assertEquals(3, tri.Istriangle(2, 2, 2));
		assertEquals(2, tri.Istriangle(2, 2, 3));
		assertEquals(1, tri.Istriangle(4, 5, 6));
		
	}

}
