package Oop_a3.lecture10;
import java.lang.reflect.Field;

@ClassPreamble(
		author = "John Doe",
		date = "2002-03-07",
		currentRevision = 6,
		lastModified = "2004-04-12",
		lastModifiedBy = "Jane Doe",
		reviewers = {"Alice", "Bill", "Cindy" }
)
public class MyClass {

	private int counter;
	
	/**
	 * 
	 * @return the current value of the counter
	 */
	public int getCounter() {
		return counter;
	}
	
	public void incCounter() {
		counter++;
		if(counter < 0) throw new IllegalStateException("Counter negative!");
	}

	public void setCounter(int val) {
		this.counter = val;
	}
	
	@Test
	public void testCounter() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// setCounter(Integer.MAX_VALUE);
		Field f = this.getClass().getDeclaredField("counter");
		f.setAccessible(true);
		f.set(this, Integer.MAX_VALUE);
		incCounter();
	}

	
}
