import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTest {

	@Test
	void PickOptionA() {
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		assertEquals("A", adapter.chooseFirstSelection()); 
		

	}
	
	@Test
	void PickOptionB() {
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		assertEquals("B", adapter.chooseSecondSelection()); 

	}
}
