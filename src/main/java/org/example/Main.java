package org.example;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static double[][] lecturasSismicas = new double[7][24];
    private static DecimalFormat formatoDecimal = new DecimalFormat("#.##");


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar sismo de mayor magnitud");
            System.out.println("3. Contar sismos mayores o iguales a 5.0");
            System.out.println("4. Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarDatos();
                    break;
                case 2:
                    System.out.println("Sismo de mayor magnitud: " + buscarMayorSismo(lecturasSismicas));
                    break;
                case 3:
                    System.out.println("Cantidad de sismos mayores o iguales a 5.0: " + contarSismos(lecturasSismicas));
                    break;
                case 4:
                    System.out.println("Mensajes de alerta:\n" + enviarSMS(lecturasSismicas));
                    break;
                case 5:
                    salir = salir();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        }
    }

    public static void ingresarDatos() {
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                lecturasSismicas[i][j] = random.nextDouble() * 9.9;
            }
        }

        System.out.println("Datos ingresados correctamente.");
    }
    public static String buscarMayorSismo(double[][] sismos) {
        double mayorSismo = 0.0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                if (sismos[i][j] > mayorSismo) {
                    mayorSismo = sismos[i][j];
                }
            }
        }
        return formatoDecimal.format(mayorSismo);
    }
    public static int contarSismos(double[][] sismos){
        int contador = 0;
        for (int i = 0; i < 7; i++)   {
            for (int j = 0; j < 24; j++) {
                if (sismos[i][j] >= 5.0){
                    contador++;
                }
            }
        }
        return contador;
    }
    public static String enviarSMS(double[][] sismos) {
        StringBuilder mensajes = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                if (sismos[i][j] >= 7.0) {
                    mensajes.append("Alerta!!! Se debe evacuar zona costera!")
                            .append("\n");
                }
            }
        }
        return mensajes.toString();
    }
    public static boolean salir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea salir del programa? (S/N)");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("s");
    }
}