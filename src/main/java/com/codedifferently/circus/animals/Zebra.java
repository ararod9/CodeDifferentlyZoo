package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Zebra extends AbstractAnimal{

	protected int speed;

	public Zebra (String name, int speed){
		super(name);
		this.speed = speed;
	}

	@Override
	public void doTrick(){
		AnimalTricks trick = AnimalTricks.RUN;
		String msg = String.format("Let's %s %d MPH fast", trick,speed);
		logger.info(msg);
	}
}
