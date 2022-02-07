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
public class LauncherSpaceShip extends SpaceShip implements ISpaceShip{
    
    public int capacityTransport;
    public int push;

    public LauncherSpaceShip(int capacityTransport, int push, String name, String originCountry, float weightSpaceShip, int yearOfCreation, String fuelType) {
        super(name, originCountry, weightSpaceShip, yearOfCreation, fuelType);
        this.capacityTransport = capacityTransport;
        this.push = push;
    }
    
    @Override
    public void function() {
        System.out.println("La función de un vehículo lanzadera es lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda o una nave tripulada." + "\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String reFuelSpaceShip() {
        super.filledUpTank = true;
        System.out.println("La nave lanzadora ha sido cargada con combustible.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public String turnOnSpaceShip() {
        if (super.filledUpTank == false){
            System.out.println("Es necesario poner combustible a la nave lanzadora antes de encenderla.");
        } else{
            super.spaceShipTurnedOn = true;
            System.out.println("Nave lanzadora encendida.");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
    public boolean startSpaceShip(boolean boardSpaceShip) throws InterruptedException{
        if (super.filledUpTank == true){
            if (boardSpaceShip == true){
                if (super.spaceShipTurnedOn == true){
                    System.out.println("Lanzamiento iniciado...");
                    for (int i = 0;i < 11; i++){
                        Thread.sleep(1000);
                        System.out.println((10 - i) + " segundos...");
                    }
                    System.out.println("Lanzamiento exitoso." + "\n");
                    return true;
                } else{
                    System.out.println("Es necesario encender las naves primero.");
                    return false;
                } 
            } else{
                System.out.println("Es necesario abordar la nave primero.");
                return false;
            }       
        } else {
            System.out.println("Es necesario poner combustible a las naves primero.");
            return false;
        }
    }

    public int getCapacityTransport() {
        return capacityTransport;
    }

    public void setCapacityTransport(int capacityTransport) {
        this.capacityTransport = capacityTransport;
    }

    public int getPush() {
        return push;
    }

    public void setPush(int push) {
        this.push = push;
    }

    @Override
    public void boardSpaceShip() {
        System.out.println("Vehículo aereo no tripulado, no se requiere abordaje.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
