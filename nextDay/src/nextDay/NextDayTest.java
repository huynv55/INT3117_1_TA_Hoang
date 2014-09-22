package nextDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextDayTest {

	@Test
	public void testNextday() {
		NextDay n = new NextDay();
		DATE t = new DATE(31,1,2010);
		DATE check = n.nextday(t);
		assertEquals(1, check.getday());
		assertEquals(2, check.getmonth());
		assertEquals(2010, check.getyear());
		
		
	}

}
