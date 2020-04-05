/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas: ");
        int filas = datos.nextInt();
        System.out.print("\nIngresa el numero de columnas: ");
        int columnas = datos.nextInt();

        char[][] mat = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == 0 || i == columnas - 1 || i == 0 || j == filas - 1) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }

            }
        }
        System.out.println("\n\nPrimera Matriz: \n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println("");

        }

        System.out.println("\nSegunda Matriz: \n");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i <= filas || j <= filas || i <= filas || j <= filas) {
                    mat[i][j] = '0';
                    {
                        if (i <= j) {
                            mat[i][j] = '1';
                            {
                                if (i >= j) {
                                    mat[i][j] = ' ';
                                } else {
                                }
                            }
                        }
                    }
                } else {
                    mat[j][i] = ' ';
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\nTercera Matriz: \n");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((i == j) || (i + j == (columnas - 1))) {
                    mat[i][j] = ' ';
                } else {
                    mat[i][j] = '1';
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println(" ");
        }

    }
}
