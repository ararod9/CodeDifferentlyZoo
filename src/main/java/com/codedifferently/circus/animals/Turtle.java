package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Turtle extends AbstractAnimal{

	public Turtle(String name){
		 super(name);
	}

	@Override
	public void doTrick(){
		AnimalTricks trick = AnimalTricks.BREATHEFIRE;
		String msg = String.format("Take this.... %s ", trick.toString());
		logger.info(msg);

	}


}
