package com.trevore.skynet;

import com.trevore.commands.FireWeaponCommand;

import java.util.Observable;

/**
 * Created by trevor on 2/25/15.
 */
public class Skynet extends Observable {
    public void turnEvil() {
        FireWeaponCommand command = new FireWeaponCommand();
        setChanged();
        notifyObservers(command);
    }
}
