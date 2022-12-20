package com.pokedex.pokedex.model;

public class Ability {

    private AbilityAb ability;
    private boolean is_hidden;
    private int slot;

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public AbilityAb getAbility() {
        return ability;
    }

    public void setAbility(AbilityAb ability) {
        this.ability = ability;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public class  AbilityAb{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
