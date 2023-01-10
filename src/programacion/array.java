/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author A8-PC63
 */
public class array {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int[][] mtz1 = {{2, 4, 6}, {8, 4, 7}, {4, 6, 8}};
        for (int i = 0; i < mtz1.length; i++) {
            for (int j = 0; j < mtz1[i].length; j++) {
                System.out.println(mtz1[i][j]);
            }

        }
    }
}

