package com.company.property;

import com.company.Animal;
import com.company.Plant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Building {
    public Double buildingCapacity ;
    public Double buildingValue;

    Building(Double buildingCapacity, Double buildingValue){
        this.buildingCapacity = buildingCapacity;
        this.buildingValue = buildingValue;
    }



    public static class creatureBuilding extends Building{
        creatureBuilding(Double buildingCapacity, Double buildingValue) {
            super(buildingCapacity, buildingValue);

        }
    }


      creatureBuilding creatureBuilding1 = new creatureBuilding(300.0, 250000.0);
      creatureBuilding creatureBuilding2 = new creatureBuilding(200.0, 167000.0);
      creatureBuilding creatureBuilding3 = new creatureBuilding(100.0, 83500.0);
      creatureBuilding creatureBuilding4 = new creatureBuilding(150.0, 125000.0);
      creatureBuilding creatureBuilding5 = new creatureBuilding(270.0, 225000.0);
      creatureBuilding creatureBuilding6 = new creatureBuilding(50.0, 41000.0);
      creatureBuilding creatureBuilding7 = new creatureBuilding(500.0, 417000.0);
      creatureBuilding creatureBuilding8 = new creatureBuilding(76.0, 63500.0);
      creatureBuilding creatureBuilding9 = new creatureBuilding(1000.0, 835000.0);
      creatureBuilding creatureBuilding10 = new creatureBuilding(400.0, 334000.0);



public static class storageBuilding extends Building{

    storageBuilding(Double buildingCapacity, Double buildingValue) {
        super(buildingCapacity, buildingValue);

    }
}
      storageBuilding storageBuilding1 = new storageBuilding(100.0, 100000.0);
      storageBuilding storageBuilding2 = new storageBuilding(120.0, 120000.0);
      storageBuilding storageBuilding3 = new storageBuilding(200.0, 200000.0);
      storageBuilding storageBuilding4 = new storageBuilding(230.0, 230000.0);
      storageBuilding storageBuilding5 = new storageBuilding(250.0, 250000.0);
      storageBuilding storageBuilding6 = new storageBuilding(270.0, 270000.0);
      storageBuilding storageBuilding7 = new storageBuilding(320.0, 320000.0);
      storageBuilding storageBuilding8 = new storageBuilding(350.0, 350000.0);
      storageBuilding storageBuilding9 = new storageBuilding(400.0, 400000.0);


    public void main(String[] args) {
        ArrayList<Object> cB =new ArrayList<>(10);
        ArrayList<Object> sB =new ArrayList<>(9);
        cB.add(creatureBuilding1);
        cB.add(creatureBuilding2);
        cB.add(creatureBuilding3);
        cB.add(creatureBuilding4);
        cB.add(creatureBuilding5);
        cB.add(creatureBuilding6);
        cB.add(creatureBuilding7);
        cB.add(creatureBuilding8);
        cB.add(creatureBuilding9);
        cB.add(creatureBuilding10);

    }
//    public creatureBuilding getCreatureBuilding() {
//        return creatureBuilding1;
//    }
//
//    public void setCreatureBuilding(creatureBuilding creatureBuilding1) {
//        this.creatureBuilding1 = creatureBuilding1;
//    }



}
