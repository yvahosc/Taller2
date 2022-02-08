/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.ISpaceShip;

/**
 * Representa la clase nave espacial no tripulada que extiende de la clase abstracta nave espacial e implementa la interface nave espacial, sus atributos y sus métodos.
 * @author Yeisson Vahos Cortes
 */
public class unmannedSpaceShip extends SpaceShip implements ISpaceShip{
    /**
     * Representa el empuje que tiene la nave espacial.
     */
    public float push;
    
    /**
     * Representa la nave espacial lanzadora que utiliza la nave espacial para hacer el despegue.
     */
    public LauncherSpaceShip launcherSpaceShip;
    
    /**
     * 
     * @param push Representa el empuje que tiene la nave espacial.
     * @param launcherSpaceShip Representa la nave espacial lanzadora que utiliza la nave espacial para hacer el despegue.
     * @param name Representa el nombre de la nave espacial.
     * @param originCountry Representa el país de origen de la nave espacial.
     * @param weightSpaceShip Representa el peso de la nave espacial.
     * @param yearOfCreation Representa el año de creación de la nave espacial.
     * @param fuelType Representa el tipo de combustible utilizado por la nave espacial.
     */
    public unmannedSpaceShip(float push, LauncherSpaceShip launcherSpaceShip, String name, String originCountry, float weightSpaceShip, int yearOfCreation, String fuelType) {
        super(name, originCountry, weightSpaceShip, yearOfCreation, fuelType);
        this.push = push;
        this.launcherSpaceShip = launcherSpaceShip;
    }

    /**
     * Representa la implementación del método abstracto para conocer la función de la nave espacial.
     */
    @Override
    public void function() {
        System.out.println("La función principal de un vehículo no tripulado es estudiar otros cuerpos celestes." + "\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Representa la implementación del método abstracto para cargar combustible a la nave espacial.
     */
    @Override
    public void reFuelSpaceShip() {
        super.filledUpTank = true;
        System.out.println("La nave no tripulada ha sido cargada con combustible.");
    }

    /**
     * Representa la implementación del método abstracto para encender la nave espacial.
     */
    @Override
    public void turnOnSpaceShip() {
        if (super.filledUpTank == false){
            System.out.println("Es necesario poner combustible a la nave no tripulada antes de encenderla.");
        } else{
            super.spaceShipTurnedOn = true;
            System.out.println("Nave no tripulada encendida.");
        }
    }

    /**
     * Representa el metodo para obtener el empuje que tiene la nave espacial.
     * @return El valor correspondiente al empuje que tiene la nave espacial.
     */
    public float getPush() {
        return push;
    }

    /**
     * Representa el metodo para modificar el empuje que tiene la nave espacial.
     * @param push El valor que se quiere asignar al atributo correspondiente al empuje que tiene la nave espacial.
     */
    public void setPush(float push) {
        this.push = push;
    }

    /**
     * Representa el metodo para obtener la nave espacial lanzadora que utiliza la nave espacial para hacer el despegue.
     * @return El valor correspondiente a la nave espacial lanzadora que utiliza la nave espacial para hacer el despegue.
     */
    public LauncherSpaceShip getLauncherSpaceShip() {
        return launcherSpaceShip;
    }

    /**
     * Representa el metodo para modificar la nave espacial lanzadora que utiliza la nave espacial para hacer el despegue.
     * @param launcherSpaceShip El valor que se quiere asignar al atributo correspondiente a la nave espacial lanzadora que utiliza la nave espacial para hacer el despegue.
     */
    public void setLauncherSpaceShip(LauncherSpaceShip launcherSpaceShip) {
        this.launcherSpaceShip = launcherSpaceShip;
    }

    /**
     * Representa la implementación del método abstracto para abordar la nave espacial.
     */
    @Override
    public void boardSpaceShip() {
        System.out.println("Vehículo aereo no tripulado, no se requiere abordaje.");
    }
}
