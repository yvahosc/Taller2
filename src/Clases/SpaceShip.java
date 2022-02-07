/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Yeisson Vahos Cortes
 */
public abstract class SpaceShip {
    public String name;
    public String originCountry;
    private float weightSpaceShip;
    public int yearOfCreation;
    public String fuelType;
    public boolean filledUpTank = false;
    public boolean spaceShipTurnedOn = false;

    public SpaceShip(String name, String originCountry, float weightSpaceShip, int yearOfCreation, String fuelType) {
        this.name = name;
        this.originCountry = originCountry;
        this.weightSpaceShip = weightSpaceShip;
        this.yearOfCreation = yearOfCreation;
        this.fuelType = fuelType;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getWeightSpaceShip() {
        return weightSpaceShip;
    }

    public void setWeightSpaceShip(float weightSpaceShip) {
        this.weightSpaceShip = weightSpaceShip;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public boolean isFilledUpTank() {
        return filledUpTank;
    }

    public void setFilledUpTank(boolean filledUpTank) {
        this.filledUpTank = filledUpTank;
    }

    public boolean isSpaceShipTurnedOn() {
        return spaceShipTurnedOn;
    }

    public void setSpaceShipTurnedOn(boolean spaceShipTurnedOn) {
        this.spaceShipTurnedOn = spaceShipTurnedOn;
    }
        
    public abstract void function();
    
    public abstract void boardSpaceShip() throws InterruptedException;
    
}
