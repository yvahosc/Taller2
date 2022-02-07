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
public class unmannedSpaceShip extends SpaceShip implements ISpaceShip{
    public float push;
    public LauncherSpaceShip launcherSpaceShip;

    public unmannedSpaceShip(float push, LauncherSpaceShip launcherSpaceShip, String name, String originCountry, float weightSpaceShip, int yearOfCreation, String fuelType) {
        super(name, originCountry, weightSpaceShip, yearOfCreation, fuelType);
        this.push = push;
        this.launcherSpaceShip = launcherSpaceShip;
    }

    @Override
    public void function() {
        System.out.println("La función principal de un vehículo no tripulado es estudiar otros cuerpos celestes." + "\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String reFuelSpaceShip() {
        super.filledUpTank = true;
        System.out.println("La nave no tripulada ha sido cargada con combustible.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public String turnOnSpaceShip() {
        if (super.filledUpTank == false){
            System.out.println("Es necesario poner combustible a la nave no tripulada antes de encenderla.");
        } else{
            super.spaceShipTurnedOn = true;
            System.out.println("Nave no tripulada encendida.");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    public float getPush() {
        return push;
    }

    public void setPush(float push) {
        this.push = push;
    }

    @Override
    public void boardSpaceShip() {
        System.out.println("Vehículo aereo no tripulado, no se requiere abordaje.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
