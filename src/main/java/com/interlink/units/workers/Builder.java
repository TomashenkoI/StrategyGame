package com.interlink.units.workers;

import com.interlink.units.Person;
import com.interlink.units.buildings.Barrack;
import com.interlink.units.buildings.Construction;
import com.interlink.units.buildings.Warehouse;
import com.interlink.units.buildings.WorkerHouse;

import java.util.Scanner;

public class Builder extends Person implements Worker {

    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        build();
    }

    private void build() {
        Construction construction = selectTheBuild();
        construction.consumptionResourcesToBuilding();
    }

    private Construction selectTheBuild() {

        Construction construction = new Warehouse();

        System.out.println("Select the house: ");

        int number = 0;
        Scanner scanner = new Scanner(System.in);
        String enteredString;

        while(true) {
            System.out.println("1 - Warehouse" +
                    "\n2 - WorkerHouse" +
                    "\n3 - Barrack");

            enteredString = scanner.nextLine();

            if (enteredString.equals("exit")) break;

            try {
                number = Integer.parseInt(enteredString);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number of house: ");
            }

            if (number > 0 && number < 4) {
                break;
            }
        }

        if (number > 0 && number < 4) {
            if (number == 2) {
                construction = new WorkerHouse();
            }else if (number == 3) {
                construction = new Barrack();
            }
        }

        return construction;
    }
}
