package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Turtle;
import com.codedifferently.circus.animals.Zebra;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){
        this.animals = new ArrayList<>();
    }

    public void startTheShow(){
        logger.warn("Let's get this PARTY STARTED!!! WOOT WOOT");

        Bear bearReference = new Bear("Smokey Da Bear");
        bearReference.doTrick();
        animals.add(bearReference);

        Turtle turtleReference = new Turtle("Bowser");
        turtleReference.doTrick();
        animals.add(turtleReference);

        Zebra zebraReference = new Zebra("Marty", 35);
        zebraReference.doTrick();
        animals.add(zebraReference);

        for(int index = 0; index < animals.size(); index++){
            AbstractAnimal temp = animals.get(index);
            temp.doTrick();
        }
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
