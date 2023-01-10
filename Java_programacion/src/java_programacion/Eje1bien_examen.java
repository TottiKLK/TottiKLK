package java_programacion;

import java.util.Arrays;
import java.util.Scanner;

public class Eje1bien_examen {

    public static void main(String[] args) {
        int sumarFila = 0;
        int sumarColumna = 0;
        int mtz1[][] = new int[3][3];
        Scanner consola = new Scanner(System.in);
        for (int x = 0; x < mtz1.length; x++) {
            for (int y = 0; y < mtz1[x].length; y++) {
                System.out.println("Introduzca el numero de [" + x + "," + y + "]=");
                mtz1[x][y] = consola.nextInt();
            }
        }
        for (int x = 0; x < mtz1.length; x++) {
            for (int y = 0; y < mtz1[x].length; y++) {
                System.out.print("[" + x + "," + y + "] = " + mtz1[x][y]);
                sumarFila += mtz1[x][y];
                sumarColumna += mtz1[x][y];
            }
            System.out.println(" La suma de la fila es :" + sumarFila);
            sumarFila = 0;
        }
    }
}
