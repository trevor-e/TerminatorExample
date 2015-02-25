package com.trevore;

import com.trevore.skynet.Skynet;
import com.trevore.terminators.*;

/**
 * Created by trevor on 2/19/15.
 */
public class Main {

    public static void main(String[] args) {
        Terminator terminator1 = TerminatorFactory.getEvilTerminator();
        Terminator terminator2 = TerminatorFactory.getEvilTerminator();
        Terminator terminator3 = TerminatorFactory.getEvilTerminator();

        Skynet skynet = new Skynet();
        skynet.addObserver(terminator1);
        skynet.addObserver(terminator2);
        skynet.addObserver(terminator3);
        skynet.turnEvil();
    }
}
