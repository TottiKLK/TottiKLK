package java_programacion;

import java.util.Scanner;

public class Maquina_golosinas {

    public static void main(String[] args) {
        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}};

        double[][] precio = {
            {1.1, +0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}};

        int[][] cantidad = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5}};

        Scanner sn = new Scanner(System.in);

        int opcion; //Guardamos la informacion que pone el usuario aqui.

        System.out.println("1. Escoger una golosina :");
        System.out.println("2. Mostrar golosinas :");
        System.out.println("3. Rellenar golosinas :");
        System.out.println("4. Apagar maquina! ");

        System.out.println("Escribe una de las opciones = ");
        opcion = sn.nextInt();
        int dinero = 0;
        switch (opcion) {

            case 1:
                System.out.println("Has seleccionado la opcion 1");
                String[] salida = pedirgolosina(nombresGolosinas, precio, cantidad);
                printeararray(salida);
                
                if (dinero == 0) {
                    System.out.println("no tienes mas dinero");
                }
                break;

            case 2:
                System.out.println("Has seleccionado la opcion 2");
                
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
            case 4:

                break;
            default:
                System.out.println("Solo números entre 1 y 4");

        }
    }

    public static String[] pedirgolosina(String[][] a, double[][] b, int[][] c) {
        String[] iRet = new String[125];
        int posicionarray = 0;
        int fil;
        int column;

        do {
            Scanner filas1 = new Scanner(System.in);
            System.out.println("Introduce fila");
            fil = filas1.nextInt();
            System.out.println("Introduce columna");
            column = filas1.nextInt();
            iRet[posicionarray] = a[fil][column] + " " + b[fil][column] + "$";
            c[fil][column]--;
            posicionarray++;
        } while (c[fil][column] > 0);

        return iRet;
    }

    
    public static void printeararray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                i = a.length;
            } else {
                System.out.println(a[i]);

            }
        }
    }

    public static void printeagolosinas(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
