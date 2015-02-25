package com.trevore.terminators;

import com.trevore.commands.TerminatorCommand;
import com.trevore.targeting.TargetingSystem;
import com.trevore.weapons.WeaponSystem;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by trevor on 2/19/15.
 */
public class Terminator implements Observer {

    private TargetingSystem targetingSystem;
    private WeaponSystem weaponSystem;

    public Terminator(TargetingSystem targetingSystem, WeaponSystem weaponSystem) {
        this.targetingSystem = targetingSystem;
        this.weaponSystem = weaponSystem;
    }

    public TargetingSystem getTargetingSystem() {
        return targetingSystem;
    }

    public WeaponSystem getWeaponSystem() {
        return weaponSystem;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof TerminatorCommand) {
            ((TerminatorCommand) arg).execute(this);
        }
    }
}
