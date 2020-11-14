package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Bear extends AbstractAnimal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void doTrick(){
        AnimalTricks tricks = AnimalTricks.DANCE;
        String msg = String.format("My name is %s and I am happy to %s", name, tricks.toString() );
        logger.info(msg);
    }
}
