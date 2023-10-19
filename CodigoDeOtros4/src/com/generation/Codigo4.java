package com.generation;
import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
    	
    	//Importar clase Scanner y agregar el System.in
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        boolean g = false;
        
        //Las cadenas de texto no se pueden comparar con == asi que q se cambia a equals
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = true; // Jugador 1 gana
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = true; // Jugador 1 gana
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = true; // Jugador 1 gana
                    }
                    break;
                default:
                    System.out.println("Ingresa bien tu eleccion: ");
                    return;
            }
            if (g) {
                System.out.println("Gana el jugador 1");
            } else {
                System.out.println("Gana el jugador 2");
            }
        }
    }
}

