/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.LauncherSpaceShip;
import Clases.MannedSpaceShip;
import Clases.unmannedSpaceShip;
import java.util.Scanner;

/**
 * Representa la clase principal del código en la que se instancian dos naves espaciales lanzadoras, dos naves espaciales no tripuladas y dos naves espaciales tripuladas, 
 * se crea un programa en el que de manera interactiva el usuario crea y lanza misiones al espacio, definiendo las naves a utilizar
 * y realizando los procedimientos de cargue de combustible, encendido, abordaje y lanzamiento de las naves al espacio.
 * @author Yeisson Vahos Cortes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String input;
        int choice;
        
        /**
         * Ciclo hacer - mientras, que utilizando información suministrada por el usuario le permite crear misiones al espacio, elegir las naves que utilizará (tripuladas o no) con su respectiva nave lanzadora
         * y realizar el proceso de lanzamiento cargando el combustible a las naves, encendiéndolas, abordándolas si es necesario y realizando el despegue.
         */
        do{
            System.out.println("¿Que misión desea iniciar?, digite el número correspondiente:" + "\n" + "1. Misión no tripulada." + "\n" + "2. Misión tripulada.");
            
            Scanner leer = new Scanner(System.in);
            input = leer.next();
            choice = consoleInputVerification(input);
            
            if (choice == 1){
                System.out.println("¿Que tipo de nave desea usar?, digite el número correspondiente:" + "\n" + "1. ATV." + "\n" + "2. Pionero XI.");
                input = leer.next();
                choice = consoleInputVerification(input);
                if (choice == 1){
                    LauncherSpaceShip launcher = launcher();
                    unmannedSpaceShip spaceShip = new unmannedSpaceShip(0.2f, launcher, "ATV.", "Europa.", 20, 2008, "MMH + NO");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType);
                        launcher.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = true;
                        startUnmannedSpaceShip(boardSpaceShip, spaceShip, launcher);
                        
                    }
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte.");
                    }
                }
                else if (choice == 2){
                    LauncherSpaceShip launcher = launcher();
                    unmannedSpaceShip spaceShip = new unmannedSpaceShip(0.26f, launcher, "Pionero XI.", "E.E.U.U.", 0.26f, 1973, "MMH + NO4");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType);
                        spaceShip.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = true;
                        startUnmannedSpaceShip(boardSpaceShip, spaceShip, launcher);                    
                    }
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte.");
                    }
                }
                else{
                    choice = 1;
                    System.out.println("Por favor digite un número válido." + "\n");
                    continue;   
                }
            }
            else if (choice == 2){
                System.out.println("¿Que tipo de nave desea usar?, digite el número correspondiente:" + "\n" + "1. Skylab." + "\n" + "2. EEI.");
                input = leer.next();
                choice = consoleInputVerification(input);
                if (choice == 1){
                    LauncherSpaceShip launcher = launcher();
                    MannedSpaceShip spaceShip = new MannedSpaceShip(3, launcher, "Skylab.", "E.E.U.U.", 77, 1973, "Queroseno + H (liq)");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType);
                        launcher.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = false;
                        startMannedSpaceShip(boardSpaceShip, spaceShip, launcher);
                    }
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte.");
                    }
                }
                else if (choice == 2){
                    LauncherSpaceShip launcher = launcher();
                    MannedSpaceShip spaceShip = new MannedSpaceShip(7, launcher, "EEI.", "Coop. Internacional", 420, 1998, "UDMH + N2O4");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType);
                        launcher.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = false;
                        startMannedSpaceShip(boardSpaceShip, spaceShip, launcher);
                    }
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte.");
                    }
                    
                }
                else{
                    choice = 1;
                    System.out.println("Por favor digite un número válido." + "\n");
                    continue;
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido." + "\n");
                continue;
            }
            System.out.println("¿Quiere planear otra misión?, digite el número correspondiente:" + "\n" + "1. Sí." + "\n" + "2. No.");
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
            }
            else if (choice == 2){
                System.out.println("Misiones terminadas.");
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido." + "\n");
            }
        }
        while (choice == 1);
        
        // TODO code application logic here
    }
    
    /**
     * Método que a partir de la información proporcionada por el usuario crea un objeto de la clase nave espacial lanzadora que se va a utilizar en la misión al espacio.
     * @return un objeto de la clase nave espacial lanzadora con toda su información.
     */
    public static LauncherSpaceShip launcher(){
        System.out.println("¿Qué nave lanzadora desea utilizar?, digite el número correspondiente:" + "\n" + "1. Saturno V." + "\n" + "2. Energia.");
        String input;
        int choice;
        do{
            System.out.println("¿Qué nave lanzadora desea utilizar?, digite el número correspondiente:" + "\n" + "1. Saturno V." + "\n" + "2. Energia.");
            Scanner leer = new Scanner(System.in);
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
                LauncherSpaceShip launcherSpaceShip = new LauncherSpaceShip(118, 3500, "Saturno V.", "E.E.U.U.", 2900, 1967, "H (liq) + O (liq).");
                return launcherSpaceShip;
            }
            else if (choice == 2){
                LauncherSpaceShip launcherSpaceShip = new LauncherSpaceShip(100, 3060, "Energia.", "Rusia.", 2400, 1987, "Petroleo + O (liq).");
                return launcherSpaceShip;
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido." + "\n");
                
            }
        }
        while (choice == 1);
        return null;
    }
    
    /**
     * Método que realiza el proceso de lanzamiento de la misión al espacio, verificando que antes se haga el cargue de combustible y se encienda la nave espacial.
     * @param boardSpaceShip Verifica que estado del proceso de abordar la nave de la misión.
     * @param spaceShip Objeto de la clase nave espacial no tripulada que almacena la información de la nave utilizada para la misión.
     * @param launcher Objeto de la clase nave espacial lanzadora que almacena la información de la nave de tipo lanzadora utilizada para la misión.
     * @throws InterruptedException Control de posible excepción por el uso del método thread.sleep
     */
    public static void startUnmannedSpaceShip (boolean boardSpaceShip, unmannedSpaceShip spaceShip, LauncherSpaceShip launcher) throws InterruptedException{
        Scanner leer = new Scanner(System.in);
        String input;
        int choice;
        do{
            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número correspondiente:" + "\n" + "1. Cargar combustible en las naves" + "\n" + "2. Encender las naves" + "\n" + "3. Realizar el lanzamiento.");
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
                spaceShip.reFuelSpaceShip();
                launcher.reFuelSpaceShip();
            }
            else if (choice == 2){
                spaceShip.turnOnSpaceShip();
                launcher.turnOnSpaceShip();
                choice = 1;
            }

            else if (choice == 3){
                boolean successfulLaunch;
                successfulLaunch = launcher.startSpaceShip(boardSpaceShip);
                if (successfulLaunch == false) {
                    choice = 1;
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido.");
            }
        }
        while (choice == 1);
    }
    
    /**
     * Método que realiza el proceso de lanzamiento de la misión al espacio, verificando que antes se haga el cargue de combustible, se encienda y se aborde la nave espacial.
     * @param boardSpaceShip Verifica que estado del proceso de abordar la nave de la misión.
     * @param spaceShip Objeto de la clase nave espacial tripulada que almacena la información de la nave utilizada para la misión.
     * @param launcher Objeto de la clase nave espacial lanzadora que almacena la información de la nave de tipo lanzadora utilizada para la misión.
     * @throws InterruptedException Control de posible excepción por el uso del método thread.sleep
     */
    public static void startMannedSpaceShip (boolean boardSpaceShip, MannedSpaceShip spaceShip, LauncherSpaceShip launcher) throws InterruptedException{
        Scanner leer = new Scanner(System.in);
        String input;
        int choice;
        do{
            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número correspondiente:" + "\n" + "1. Cargar combustible en las naves" + "\n" + "2. Encender las naves" + "\n" + "3. Realizar el abordaje." + "\n" + "4. Realizar el lanzamiento.");
            input = leer.next();
            choice = consoleInputVerification(input);
            if (choice == 1){
                spaceShip.reFuelSpaceShip();
                launcher.reFuelSpaceShip();
            }
            else if (choice == 2){
                spaceShip.turnOnSpaceShip();
                launcher.turnOnSpaceShip();
                choice = 1;
            }
            else if (choice == 3){
                spaceShip.boardSpaceShip();
                boardSpaceShip = true;
                choice = 1;
            }
            else if (choice == 4){
                boolean successfulLaunch;
                successfulLaunch = launcher.startSpaceShip(boardSpaceShip);

                if (successfulLaunch == false) {
                    choice = 1;
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido.");
            }
        }
        while (choice == 1);
    }
    
    /**
     * Método que recibe un string (ingresado por el usuario) y evalua si este puede ser convertido a entero y si no es posible captura la excepción.
     * @param input Valor que se recibe por consola por parte del usuario para la construcción y lanzamiento de misiones al espacio.
     * @return Un número entero el cual puede manejarse dentro del método principal para la interacción con el usuario en la construcción y lanzamiento de misiones al espacio.
     */
    public static int consoleInputVerification (String input){
        try{
            int choice;
            choice = Integer.parseInt(input);
            return choice;
        }
        catch (Exception e){
            return 0;
        }
    }
}
