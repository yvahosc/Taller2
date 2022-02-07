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
 *
 * @author Yeisson Vahos Cortes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int choice;
        do{
            System.out.println("¿Que misión desea iniciar?, digite el número correspondiente:" + "\n" + "1. Misión no tripulada." + "\n" + "2. Misión tripulada.");
            
            Scanner leer = new Scanner(System.in);
            choice = leer.nextInt();
            if (choice == 1){
                System.out.println("¿Que tipo de nave desea usar?, digite el número correspondiente:" + "\n" + "1. ATV." + "\n" + "2. Pionero XI.");
                choice = leer.nextInt();
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
                        do{
                            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número correspondiente:" + "\n" + "1. Cargar combustible en las naves" + "\n" + "2. Encender las naves" + "\n" + "3. Realizar el lanzamiento.");
                            choice = leer.nextInt();
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
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte");
                    }
                }
                else if (choice == 2){
                    LauncherSpaceShip launcher = launcher();
                    unmannedSpaceShip spaceShip = new unmannedSpaceShip(0.26f, launcher, "Pionero XI.", "E.E.U.U.", 0.26f, 1973, "MMH + NO4");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType + "\n");
                        spaceShip.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = true;
                        do{
                            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número correspondiente:" + "\n" + "1. Cargar combustible en las naves" + "\n" + "2. Encender las naves" + "\n" + "3. Realizar el lanzamiento.");
                            choice = leer.nextInt();
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
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte");
                    }
                }
                else{
                    choice = 1;
                    System.out.println("Por favor digite un número válido.");
                    continue;
                }
            }
            else if (choice == 2){
                System.out.println("¿Que tipo de nave desea usar?, digite el número correspondiente:" + "\n" + "1. Skylab." + "\n" + "2. EEI.");
                choice = leer.nextInt();
                if (choice == 1){
                    LauncherSpaceShip launcher = launcher();
                    MannedSpaceShip spaceShip = new MannedSpaceShip(3, launcher, "Skylab.", "E.E.U.U.", 77, 1973, "Queroseno + H (liq)");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType);
                        spaceShip.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = false;
                        do{
                            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número correspondiente:" + "\n" + "1. Cargar combustible en las naves" + "\n" + "2. Encender las naves" + "\n" + "3. Realizar el abordaje." + "\n" + "4. Realizar el lanzamiento.");
                            choice = leer.nextInt();
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
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte");
                    }
                }
                else if (choice == 2){
                    LauncherSpaceShip launcher = launcher();
                    MannedSpaceShip spaceShip = new MannedSpaceShip(7, launcher, "EEI.", "Coop. Internacional", 420, 1998, "UDMH + N2O4");
                    if (spaceShip.getWeightSpaceShip() < launcher.capacityTransport){
                        System.out.println("Nave: " + spaceShip.name + "\n" + "Origen: " + spaceShip.originCountry + "\n" + "Peso en toneladas: " + spaceShip.getWeightSpaceShip());
                        spaceShip.function();
                        System.out.println("Lanzador: " + launcher.name + "\n" + "Origen: " + launcher.originCountry + "\n" + "Capacidad de transporte en toneladas: " + launcher.capacityTransport + "\n" + "combustible utilizado: " + launcher.fuelType);
                        spaceShip.function();
                        System.out.println("Ya contamos con la nave y el lanzador para iniciar la misión, es tiempo de enviar la misión al espacio...");
                        
                        boolean boardSpaceShip = false;
                        do{
                            System.out.println("\n"+ "¿Qué hacemos ahora?, digite el número correspondiente:" + "\n" + "1. Cargar combustible en las naves" + "\n" + "2. Encender las naves" + "\n" + "3. Realizar el abordaje." + "\n" + "4. Realizar el lanzamiento.");
                            choice = leer.nextInt();
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
                    else{
                        System.out.println("No es posible utilizar el lanzador " + launcher.name + " ya que la nave " + spaceShip.name + " excede su capacidad de transporte");
                    }
                    
                }
                else{
                    choice = 1;
                    System.out.println("Por favor digite un número válido.");
                    
                }
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido.");
            }
            System.out.println("¿Quiere planear otra misión?, digite el número correspondiente:" + "\n" + "1. Sí." + "\n" + "2. No.");
            choice = leer.nextInt();
            if (choice == 1){
                
            }
            else if (choice == 2){
                System.out.println("Misiones terminadas.");
            }
            else{
                choice = 1;
                System.out.println("Por favor digite un número válido.");
            }
        }
        while (choice == 1);
        
        // TODO code application logic here
    }
    
    public static LauncherSpaceShip launcher(){
        System.out.println("¿Qué nave lanzadora desea utilizar?, digite el número correspondiente:" + "\n" + "1. Saturno V." + "\n" + "2. Energia.");
        int choice;
        do{
            Scanner leer = new Scanner(System.in);
            choice = leer.nextInt();
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
                System.out.println("Por favor digite un número válido.");
            }
        }
        while (choice == 1);
        return null;
    }
}
