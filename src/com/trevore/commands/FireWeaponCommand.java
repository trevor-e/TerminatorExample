package com.trevore.commands;

import com.trevore.terminators.*;

/**
 * Created by trevor on 2/25/15.
 */
public class FireWeaponCommand implements TerminatorCommand {

    @Override
    public void execute(Terminator terminator) {
        terminator.getWeaponSystem().shoot();
    }
}
