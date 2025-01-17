package com.garbagemule.MobArena.steps;

import org.bukkit.entity.Player;

abstract class PlayerStep implements Step {
    protected Player player;

    protected PlayerStep(Player player) {
        this.player = player;
    }

    @Override
    public void remap(Player newPlayer) {
        this.player = newPlayer;
    }

    @Override
    public String toString() {
        String step = getClass().getSimpleName();
        String target = player.getName();
        return step + "(" + target + ")";
    }
}
