/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * Representa la clase abstracta nave espacial, sus atributos y sus métodos.
 * @author Yeisson Vahos Cortes
 */
public abstract class SpaceShip {
    /**
     * Representa el nombre de la nave espacial.
     */
    public String name;
    
    /**
     * Representa el país de origen de la nave espacial.
     */
    public String originCountry;
    
    /**
     * Representa el peso de la nave espacial.
     */
    private float weightSpaceShip;
    
    /**
     * Representa el año de creación de la nave espacial.
     */
    public int yearOfCreation;
    
    /**
     * Representa el tipo de combustible utilizado por la nave espacial.
     */
    public String fuelType;
    
    /**
     * Representa el estado del tanque de combustible de la nave espacial (tanque lleno o no), inicialmente vacío.
     */
    public boolean filledUpTank = false;
    
    /**
     * Representa el estado de la nave espacial (encendida o apagada), inicialmente apagada.
     */
    public boolean spaceShipTurnedOn = false;

    /**
     * Representa la estructura que debe llevar la creación de un objeto que extienda la clase nave espacial.
     * @param name Representa el nombre de la nave espacial.
     * @param originCountry Representa el país de origen de la nave espacial.
     * @param weightSpaceShip Representa el peso de la nave espacial.
     * @param yearOfCreation Representa el año de creación de la nave espacial.
     * @param fuelType Representa el tipo de combustible utilizado por la nave espacial.
     */
    public SpaceShip(String name, String originCountry, float weightSpaceShip, int yearOfCreation, String fuelType) {
        this.name = name;
        this.originCountry = originCountry;
        this.weightSpaceShip = weightSpaceShip;
        this.yearOfCreation = yearOfCreation;
        this.fuelType = fuelType;
    }   

    /**
     * Representa el metodo para obtener el nombre de la nave espacial.
     * @return El valor correspondiente al nombre de la nave espacial.
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el metodo para modificar el nombre de la nave espacial.
     * @param name El valor que se quiere asignar al atributo correspondiente al nombre de la nave espacial.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa el metodo para obtener el país de origen de la nave espacial.
     * @return El valor correspondiente al país de origen de la nave espacial.
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Representa el metodo para modificar el país de origen de la nave espacial.
     * @param originCountry El valor que se quiere asignar al atributo correspondiente al país de origen de la nave espacial.
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * Representa el metodo para obtener el tipo de combustible utilizado por la nave espacial.
     * @return El valor correspondiente al tipo de combustible utilizado por la nave espacial.
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Representa el metodo para modificar el tipo de combustible utilizado por la nave espacial.
     * @param fuelType El valor que se quiere asignar al atributo correspondiente al tipo de combustible utilizado por la nave espacial.
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Representa el metodo para obtener el peso de la nave espacial.
     * @return El valor correspondiente al peso de la nave espacial.
     */
    public float getWeightSpaceShip() {
        return weightSpaceShip;
    }

    /**
     * Representa el metodo para modificar el peso de la nave espacial.
     * @param weightSpaceShip El valor que se quiere asignar al atributo correspondiente al peso de la nave espacial.
     */
    public void setWeightSpaceShip(float weightSpaceShip) {
        this.weightSpaceShip = weightSpaceShip;
    }

    /**
     * Representa el metodo para obtener el año de creación de la nave espacial.
     * @return El valor correspondiente al año de creación de la nave espacial.
     */
    public int getYearOfCreation() {
        return yearOfCreation;
    }

    /**
     * Representa el metodo para modificar el año de creación de la nave espacial.
     * @param yearOfCreation El valor que se quiere asignar al atributo correspondiente al año de creación de la nave espacial.
     */
    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    /**
     * Representa el metodo para obtener el estado del tanque de combustible de la nave espacial (tanque lleno o no).
     * @return El valor correspondiente al estado del tanque de combustible de la nave espacial (tanque lleno o no).
     */
    public boolean isFilledUpTank() {
        return filledUpTank;
    }

    /**
     * Representa el metodo para modificar el estado del tanque de combustible de la nave espacial (tanque lleno o no).
     * @param filledUpTank El valor que se quiere asignar al atributo correspondiente al estado del tanque de combustible de la nave espacial (tanque lleno o no).
     */
    public void setFilledUpTank(boolean filledUpTank) {
        this.filledUpTank = filledUpTank;
    }

    /**
     * Representa el metodo para obtener el estado de la nave espacial (encendida o apagada).
     * @return El valor correspondiente al estado de la nave espacial (encendida o apagada).
     */
    public boolean isSpaceShipTurnedOn() {
        return spaceShipTurnedOn;
    }

    /**
     * Representa el metodo para modificar el estado de la nave espacial (encendida o apagada).
     * @param spaceShipTurnedOn El valor que se quiere asignar al atributo correspondiente al estado de la nave espacial (encendida o apagada).
     */
    public void setSpaceShipTurnedOn(boolean spaceShipTurnedOn) {
        this.spaceShipTurnedOn = spaceShipTurnedOn;
    }
        
   /**
    * Representa la declaración del método abstracto para conocer la función de una nave espacial.
    */
    public abstract void function();
    
    /**
     * Representa la declaración del método abstracto para abordar las naves espaciales.
     * @throws InterruptedException Control de posible excepción por el uso del método thread.sleep
     */
    public abstract void boardSpaceShip() throws InterruptedException; 
}
