package com.tenis;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== PARTIDO DE TENIS =====");
        Scanner lectura = new Scanner(System.in);

        // Definir nombre de jugadores
        String nombreJ1;
        String nombreJ2;

        System.out.println("Ingrese el nombre del primer jugador: ");
        nombreJ1 = lectura.next();

        System.out.println("Ingrese el nombre del segundo jugador: ");
        nombreJ2 = lectura.next();

        while (Objects.equals(nombreJ1, nombreJ2)) {
            System.out.println("==== LOS NOMBRES SON IGUALES ====");
            System.out.println("Ingrese nuevamente el nombre del primer jugador: ");
            nombreJ1 = lectura.next();

            System.out.println("Ingrese nuevamente el nombre del segundo jugador: ");
            nombreJ2 = lectura.next();
        }

        // Definir nombre del torneo
        System.out.println("Ingrese el nombre del torneo: ");
        String torneo = lectura.next();

        // Definir cantidad de sets
        int cantidadSets;

        System.out.println("Ingrese el numero se sets (Mejor de 3 o 5): ");
        cantidadSets = lectura.nextInt();

        while ( cantidadSets != 3  && cantidadSets != 5) {
            System.out.println("==== EL NUMERO TIENE QUE SER 3 O 5 ====");
            System.out.println("Ingrese el numero se sets (Mejor de 3 o 5): ");
            cantidadSets = lectura.nextInt();
        }

        // Definir probabilidad que gane el J1
        System.out.println("Ingrese probabilidad en porcentaje de que gane el J1: ");
        int probabilidadJ1 = lectura.nextInt();

        // Definir el saque
        Random numAleatorio = new Random();

        // Genera un boolean de forma aleatoria
        boolean moneda = numAleatorio.nextBoolean();

        // Si es verdadero cara y sino cruz
        if (moneda) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }

        // Se muestran en pantalla los datos ingresados
        System.out.println(nombreJ1 + " vs " + nombreJ2 + " | Torneo " + torneo + " Mejor de " + cantidadSets + " sets" + " | Probabilidad que gane " + nombreJ1 + " del " + probabilidadJ1 + "%" + " Saca jugador 1? " + moneda);

        partido(probabilidadJ1, cantidadSets, nombreJ1, nombreJ2);
    }
     public static void partido(int probabilidad, int cantidadSets, String nombrej1, String nombrej2) {
         List<String> setsDeJuegos = new ArrayList<>();

         int setJ1 = 0;
         int setJ2 = 0;
         int setsTotales = 0;

         int juegoJ1 = 0;
         int juegoJ2 = 0;

         int puntoJ1;
         int puntoJ2;

         int marcadorJ1 = 0;
         int marcadorJ2 = 0;

         while (setsTotales != cantidadSets) {
             while (juegoJ1 != 6 && juegoJ2 != 6) {
                 while (marcadorJ1 != 50 && marcadorJ2 != 50) {
                     puntoJ1 = (int) (Math.random() * probabilidad + 1);
                     puntoJ2 = (int) (Math.random() * (100 - probabilidad) + 1);

                     if (puntoJ1 > puntoJ2) {
                         if (marcadorJ1 < 30) {
                             marcadorJ1 += 15;
                             System.out.println("Punto para el J1!");
                         } else {
                             marcadorJ1 += 10;
                             System.out.println("Punto para el J1!");
                         }
                     } else {
                         if (marcadorJ2 < 30) {
                             marcadorJ2 += 15;
                             System.out.println("Punto para el J2!");
                         } else {
                             marcadorJ2 += 10;
                             System.out.println("Punto para el J2!");
                         }
                     }
                     System.out.println("Marcador: " + marcadorJ1 + " - " + marcadorJ2);
                 }
                 if (marcadorJ1 == 50) {
                     System.out.println("==== JUEGO PARA J1 ====");
                     juegoJ1 += 1;

                 } else {
                     System.out.println("==== JUEGO PARA J2 ====");
                     juegoJ2 += 1;
                 }
                 marcadorJ1 = 0;
                 marcadorJ2 = 0;

             }

             if ((juegoJ1 == 6 && juegoJ2 == 5) || (juegoJ2 == 6 && juegoJ1 == 5)) {
                 while (marcadorJ1 != 50 && marcadorJ2 != 50) {
                     puntoJ1 = (int) (Math.random() * probabilidad + 1);
                     puntoJ2 = (int) (Math.random() * 100 + 1);

                     if (puntoJ1 > puntoJ2) {
                         if (marcadorJ1 < 30) {
                             marcadorJ1 += 15;
                             System.out.println("Punto para el J1!");
                         } else {
                             marcadorJ1 += 10;
                             System.out.println("Punto para el J1!");
                         }
                     } else {
                         if (marcadorJ2 < 30) {
                             marcadorJ2 += 15;
                             System.out.println("Punto para el J2!");
                         } else {
                             marcadorJ2 += 10;
                             System.out.println("Punto para el J2!");
                         }
                     }
                     System.out.println("Marcador: " + marcadorJ1 + " - " + marcadorJ2);
                 }
                 if (marcadorJ1 == 50) {
                     System.out.println("==== JUEGO PARA J1 ====");
                     juegoJ1 += 1;

                 } else {
                     System.out.println("==== JUEGO PARA J2 ====");
                     juegoJ2 += 1;
                 }

             }

             if (juegoJ1 > juegoJ2) {
                 setJ1 += 1;
             } else {
                 setJ2 += 1;
             }

             if (juegoJ1 == 6 && juegoJ2 == 6) {
                 // Llamar a la funcion tieBreak
                 String tiebreakString = tieBreak(probabilidad, juegoJ1, juegoJ2, setJ1, setJ2);
                 setsDeJuegos.add(tiebreakString);
             } else {
                 setsDeJuegos.add(juegoJ1 + " - " + juegoJ2);
             }

             marcadorJ1 = 0;
             marcadorJ2 = 0;
             juegoJ1 = 0;
             juegoJ2 = 0;
             setsTotales += 1;
             if (setJ1 > setJ2 && (setJ1 - setJ2) == 3){
                 break;
             }
             if (setJ2 > setJ1 && (setJ2 - setJ1) == 3){
                 break;
             }
         }
         for (String setsDeJuego : setsDeJuegos) {
             System.out.println(setsDeJuego);
         }
         if (setJ1 > setJ2) {
             System.out.println("El ganador es " + nombrej1 + " con: " + setJ1 + " sets ganados");
         } else {
             System.out.println("El ganador es " + nombrej2 + " con: " + setJ2 + " sets ganados");
         }
     }

    public static String tieBreak(int probabilidad, int juegoJ1, int juegoJ2, int setJ1, int setJ2) {
        int puntosJ1 = 0;
        int puntosJ2 = 0;

        int puntoJ1;
        int puntoJ2;

        while (puntosJ1 != 7 && puntosJ2 != 7) {
            puntoJ1 = (int) (Math.random() * probabilidad + 1);
            puntoJ2 = (int) (Math.random() * (100 - probabilidad) + 1);

            if (puntoJ1 > puntoJ2) {
                puntosJ1 += 1;
            } else {
                puntosJ2 += 1;
            }
        }
        if (puntosJ1 > puntosJ2) {
            setJ1 +=1;
            return (juegoJ1 + 1) + " - " + juegoJ2 + " (" + puntosJ2 + ")";
        } else {
            setJ2 += 1;
            return juegoJ1 + " - " + (juegoJ2 + 1) + " (" + puntosJ1 + ")";
        }
    }
}