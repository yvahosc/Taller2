/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.ISpaceShip;

/**
 *
 * @author Yeisson Vahos Cortes
 */
public class MannedSpaceShip extends SpaceShip implements ISpaceShip {
    public int capacity;
    public LauncherSpaceShip launcherSpaceShip;

    public MannedSpaceShip(int capacity, LauncherSpaceShip launcherSpaceShip, String name, String originCountry, float weightSpaceShip, int yearOfCreation, String fuelType) {
        super(name, originCountry, weightSpaceShip, yearOfCreation, fuelType);
        this.capacity = capacity;
        this.launcherSpaceShip = launcherSpaceShip;
    }

    @Override
    public void function() {
        System.out.println("La función principal de un vehículo tripulado es mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación, en misiones donde se precisa de la destreza y de la toma de decisiones de personas, en detrimento de las máquinas."+ "\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reFuelSpaceShip() {
        super.filledUpTank = true;
        System.out.println("La nave tripulada ha sido cargada con combustible.");
    }

    @Override
    public void turnOnSpaceShip() {
        if (super.filledUpTank == false){
            System.out.println("Es necesario poner combustible a la nave tripulada antes de encenderla.");
        } else{
            super.spaceShipTurnedOn = true;
            System.out.println("Nave tripulada encendida.");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }    

    @Override
    public void boardSpaceShip() throws InterruptedException{
        System.out.println("Tripulación abordando...");
        for (int i = 0;i < this.capacity; i++){
            Thread.sleep(1000);
            System.out.println("Abordando tripulante " + (i + 1) + " ...");
        }
        System.out.println("Abordaje exitoso.");
    }
}
