package com.company.property;

import com.company.Animal;
import com.company.Plant;

public class Building {
    public Double buildingCapacity ;
    public Double buildingValue;

    Building(Double buildingCapacity, Double buildingValue){
        this.buildingCapacity = buildingCapacity;
        this.buildingValue = buildingValue;
    }
    public static class creatureBuilding extends Building{
        creatureBuilding(Double buildingCapacity, Double buildingValue, Animal animal) {
            super(buildingCapacity, buildingValue);

        }
    }
     public creatureBuilding creatureBuilding1 = new creatureBuilding(300.0, 250000.0, null);
     public creatureBuilding creatureBuilding2 = new creatureBuilding(200.0, 167000.0, null);
     public creatureBuilding creatureBuilding3 = new creatureBuilding(100.0, 83500.0, null);
     public creatureBuilding creatureBuilding4 = new creatureBuilding(150.0, 125000.0, null);
     public creatureBuilding creatureBuilding5 = new creatureBuilding(270.0, 225000.0, null);
     public creatureBuilding creatureBuilding6 = new creatureBuilding(50.0, 41000.0, null);
     public creatureBuilding creatureBuilding7 = new creatureBuilding(500.0, 417000.0, null);
     public creatureBuilding creatureBuilding8 = new creatureBuilding(76.0, 63500.0, null);
     public creatureBuilding creatureBuilding9 = new creatureBuilding(1000.0, 835000.0, null);
     public creatureBuilding creatureBuilding10 = new creatureBuilding(400.0, 334000.0, null);

public static class storageBuilding extends Building{



    storageBuilding(Double buildingCapacity, Double buildingValue, Plant plant) {
        super(buildingCapacity, buildingValue);

    }
}
     public storageBuilding storageBuilding1 = new storageBuilding(100.0, 100000.0, null);
     public storageBuilding storageBuilding2 = new storageBuilding(120.0, 120000.0, null);
     public storageBuilding storageBuilding3 = new storageBuilding(200.0, 200000.0, null);
     public storageBuilding storageBuilding4 = new storageBuilding(230.0, 230000.0, null);
     public storageBuilding storageBuilding5 = new storageBuilding(250.0, 250000.0, null);
     public storageBuilding storageBuilding6 = new storageBuilding(270.0, 270000.0, null);
     public storageBuilding storageBuilding7 = new storageBuilding(320.0, 320000.0, null);
     public storageBuilding storageBuilding8 = new storageBuilding(350.0, 350000.0, null);
     public storageBuilding storageBuilding9 = new storageBuilding(400.0, 400000.0, null);
}
