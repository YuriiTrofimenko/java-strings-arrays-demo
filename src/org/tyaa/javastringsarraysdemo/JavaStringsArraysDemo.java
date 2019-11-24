/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javastringsarraysdemo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaStringsArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println("Hello Java!");
        // Test comment
        // Test comment 2
        
        // Alt + Enter for import
        /* Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a number then press Enter: ");
        int x = sc.nextInt();
        System.out.println("Input the second number then press Enter: ");
        int y = sc.nextInt();
        System.out.println("Choose an option: ");
        System.out.println("1 - concatination");
        System.out.println("2 - plus");
        int action = sc.nextInt();
        if (action == 1) {
            System.out.println(String.valueOf(x) + String.valueOf(y));
        } else if (action == 2) {
            System.out.println(x + y);
        } else {
            System.out.println("Incorrect input data!");
        } */
        
        /* int x = 10;
        for (int i = 0; i < 10; i++) {
            // System.out.println(x++);
            // System.out.println(++x);
            x = x + 1;
            System.out.println(x);
        } */
        
        // double x = ((12d * 5d) / 11d) - 14d + 100d;
        // System.out.println(x);
        /*System.out.println("Input your name: ");
        Scanner sc = new Scanner(System.in);
        
        String s1 = new String("Hello");
        // s1 = "Java";
        s1 = sc.nextLine();
        
        String s2 = "Hi " + s1 + "!";
        System.out.println(s2);*/
        
        /* int[] intArray = new int[10];
        intArray[0] = 500;
        // System.out.println(intArray[0]);
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray[0] + i;
        }
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        } */
        
        /*for (int i : intArray) {
            System.out.println(i);
        }*/
        
        /* char[] charArray = new char[10];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char)('A' + i);
        }
        for (char c : charArray) {
            System.out.println(c);
        } */
        
        // Step 1
        /* for (int i = 0; i < 11; i++) {
            System.out.println(i);
        } */
        
        // Step 2
        /* for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("i = " + i + "; j = " + j + "    ");
            }
            System.out.println();
        } */
        
        // Step 3
        /* for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        } */
        
        // Step 4
        /* for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    System.out.print(j);
                } else if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(i * j);
                }
            }
            System.out.println();
        } */
        
        // Step 5
        /* for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    System.out.printf("%4d", j);
                } else if (j == 0) {
                    System.out.printf("%4d", i);
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            System.out.println();
        } */
        
        // Step 6
        /* int[][] table = new int[11][];
        
        for (int i = 0; i < 11; i++) {
            table[i] = new int[11];
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    table[i][j] = j;
                } else if (j == 0) {
                    table[i][j] = i;
                } else {
                    table[i][j] = i * j;
                }
            }
            System.out.println();
        }
        
        // ...
        
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        } */
        
        char x1 = 'A';
        char x2 = 'B';
        char x3 = 'C';
        //System.out.println(x1);
        
        // int[] y;
        // int[] y = new int[5];
       //  char[] y1;
       
       
        // char[] y1 = new char[5];
        //ex1
        /*y1[0] = x1;
        y1[3] = 'D';
        y1[1] = x2;
        y1[2] = x3;
        y1[4] = 'E';
        
        System.out.println(y1[0]);
        System.out.println("y[1] = " + y1[1]);*/
        
        //ex2
        /* for (int i = 0; i < 5; i++) {
            // System.out.println("Hello");
            
            //System.out.println("Hello " + i);
            
            y1[i] = 'A';
        }
        
        for (int i = 0; i < y1.length; i++) {
            System.out.println(y1[i]);
        } */
        
        //ex3
        // Fill the array
        /* for (int i = 0; i < 6; i++) {
            
            y1[i] = (char)('A' + i);
        }
        
        // Print the array
        for (int i = 0; i < y1.length; i++) {
            System.out.println(y1[i]);
        } */
        
        //ex4
        /*Character[] y1 = new Character[5];
        
        for (int i = 0; i < 5; i++) {
            
            y1[i] = (char)('A' + i);
        }
        
        Object[][] y2 = new Object[2][];
        y2[0] = y1;
        y2[1] = new Object[]{1, 10, -16, 0};
        
        for (int i = 0; i < y2.length; i++)
        {
            System.out.println(y2[i]);  
        }*/
        
        //ex5
        /*Character[] y1 = new Character[5];
        
        for (int i = 0; i < 5; i++) {
            
            y1[i] = (char)('A' + i);
        }
        
        Object[][] y2 = new Object[3][];
        y2[0] = y1;
        y2[1] = new Object[]{1, 10, -16, 0};
        
        for (int i = 0; i < y2.length; i++)
        {
            // System.out.println(y2[i]);
            for (int j = 0; j < y2[i].length; j++) {
                System.out.print(y2[i][j] + " ");
            }
            System.out.println();
        }*/
        // double d1 = 15.0;
        double d1 = 15d;
        double d2;
        double[] doubleArray = {12.99, -5.0, 900, 1000};
        double[] doubleArray2 = new double[4];
        
        boolean[] booleanArray = {true , false , true , false , true , false} ;
        char [] charArray = new char [3];
        
        d1 = 20d;
        doubleArray[1] = -15d;
        
        int [] i1 = new int [5];
        
        /*for (int i = 0; i < i1.length; i++) {
            i1 [i] = i+1;
        }*/
        
        /*for (int i = 1; i < i1.length + 1; i++) {
            i1 [i-1] = i;
        }*/
        
        /*for (int i = 0; i < i1.length; i++) {
            System.out.print(i1 [i] + " ");
        }*/
        
        
        /* System.out.println(doubleArray[0]);
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[2]); */
        // System.out.print(doubleArray[0] + " " + doubleArray[1] + " " + doubleArray[2]);
        
        // Цикл, выполняющий действие внутри фигурных скобок,
        // пока i < doubleArray.length
        // i - переменная-счетчик
        // i < doubleArray.length - условие выполнения цикла
        // i++ - приращение значения счетчика
        /*for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }*/
        /*for (int i = 0; i < doubleArray.length; i = i + 2) {
            System.out.print(doubleArray[i] + " ");
        }*/
        /*for (int i = 0; i < doubleArray.length; i += 2) {
            System.out.print(doubleArray[i] + " ");
        }*/
        /*for (int i = 1; i < doubleArray.length; i += 2) {
            System.out.print(doubleArray[i] + " ");
        }*/
        
        //System.out.println("");
        /*booleanArray[1] = true ;
        System.out.println(booleanArray[1]);*/
        
        /*for (int i = 0; i < booleanArray.length; i += 2) {
            System.out.print(booleanArray[i] + " ");
        }*/
        
        /* TODO сделать массив y2 размерностью 3 вместо 2
        и в последнюю его позицию добавить подмассив из букв X, Y, Z
        */
    }
    
}
