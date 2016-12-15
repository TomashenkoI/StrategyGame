package com.interlink.units.buildings;

import com.interlink.Resources;

public class WorkerHouse implements Construction{

    private int neededIron = 150;
    private int neededWood = 150;

    @Override
    public void consumptionResourcesToBuilding() {
        Resources.removeIron(neededIron);
        Resources.removeWood(neededWood);
    }
}
