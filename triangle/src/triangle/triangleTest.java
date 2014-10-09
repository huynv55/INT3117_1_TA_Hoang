package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	@Test
	public void testIstriangle() {
		triangle tri = new triangle();
		String kq = tri.Istriangle(3, 4, 5);
		assertEquals("right triangle", kq);
		assertEquals("isosceless", tri.Istriangle(100, 100, 1));
		assertEquals("isosceless", tri.Istriangle(100, 100, 2));
		assertEquals("equilateral", tri.Istriangle(100, 100, 100));
		assertEquals("isosceless", tri.Istriangle(100, 100, 199));
		assertEquals("not a triangle", tri.Istriangle(100, 100, 200));
		assertEquals("isosceless", tri.Istriangle(100, 1, 100));
		assertEquals("isosceless", tri.Istriangle(100, 2, 100));
		assertEquals("isosceless", tri.Istriangle(100, 199, 100));
		assertEquals("not a triangle", tri.Istriangle(100, 200, 100));
		assertEquals("isosceless", tri.Istriangle(1, 100, 100));
		assertEquals("isosceless", tri.Istriangle(2, 100, 100));
		assertEquals("not a triangle", tri.Istriangle(200, 100, 100));
		
	}

}
