package com.interlink.buildings;

import com.interlink.Resources;

public class Barrack implements Construction {

    private int neededIron = 200;
    private int neededStone = 200;
    private int neededWood = 200;

    @Override
    public void consumptionResourcesToBuilding() {
        Resources.removeStone(neededStone);
        Resources.removeWood(neededWood);
        Resources.removeIron(neededIron);
    }
}
