package com.interlink.units.buildings;

import com.interlink.Resources;

public class Warehouse implements Construction {

    private int neededStone = 100;
    private int neededWood = 100;

    @Override
    public void consumptionResourcesToBuilding() {
        Resources.removeStone(neededStone);
        Resources.removeWood(neededWood);
    }
}
