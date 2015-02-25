package com.trevore.targeting;

/**
 * Created by trevor on 2/19/15.
 */
public class HumanTargeter implements TargetingSystem {

    @Override
    public boolean shouldTarget(Target target) {
        return target == Target.HUMAN;
    }
}
