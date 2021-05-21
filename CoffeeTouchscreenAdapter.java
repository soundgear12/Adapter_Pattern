package week6;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{

	OldCoffeeMachine coffeemachine;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine newcoffeemachine) {
		coffeemachine = newcoffeemachine;
	}
	
	@Override
	public void chooseFirstSelection() {
		coffeemachine.selectA();
		
	}

	@Override
	public void chooseSecondSelection() {
		coffeemachine.selectB();
		
		
	}
	
}
