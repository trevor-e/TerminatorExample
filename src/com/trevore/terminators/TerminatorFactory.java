package com.trevore.terminators;

import com.trevore.targeting.HumanTargeter;
import com.trevore.weapons.MachineGun;

/**
 * Created by trevor on 2/19/15.
 */
public class TerminatorFactory {

    public static Terminator getEvilTerminator() {
        return new Terminator(new HumanTargeter(), new MachineGun());
    }
}
