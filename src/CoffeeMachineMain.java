
public class CoffeeMachineMain {
	public static void main(String[] args) {
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}
}
