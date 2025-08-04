package com.example.tight;

import com.example.loose.CoffeeMachine;

public class CoffeeMaker {
	
	//private EspressoMachine espressoMachine;
	private DripCoffeeMachine dripCoffeeMachine;
	
	public void setCoffeeMaker(CoffeeMachine coffeeMachine) {
		
		//this.espressoMachine = new EspressoMachine();
		this.dripCoffeeMachine = new DripCoffeeMachine();
	}
	
	public void makeCoffee() {
		//System.out.println(espressoMachine.brew());
		System.out.println(dripCoffeeMachine.brew());
	}
}
