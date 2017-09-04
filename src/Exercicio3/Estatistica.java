/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import Exercicio2.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author Novela Mussane
 */
public class Estatistica {
    
     private double array[];

      // Coeficiente de Variação de Pearson


      public double getMediaAritmetica() {

            double total = 0;

            for (int counter = 0; counter < array.length; counter++)

                  total += array[counter];

            return total / array.length;

      }

 

      public double getSomaDosElementos() {
            double total = 0;
            for (int counter = 0; counter < array.length; counter++)
                  total += array[counter];
            return total;
      }

   

      public double getMediaAritmetica(double array[]) {
            double total = 0;
            for (int counter = 0; counter < array.length; counter++)
                  total += array[counter];
            return total / array.length;
      }

   

      public void ordenar() {
            Arrays.sort(array);
      }

      public void imprimeArray() {
            System.out.print("\nElementos do Array: ");
            for (int count = 0; count < array.length; count++)
                  System.out.print(array[count] + " ");
      }

      // Array não pode conter valores duplicados

      public int buscaPor(int value) {
            return Arrays.binarySearch(array, value);
      }

  
      public double getMediana() {
            this.ordenar();
            int tipo = array.length % 2;
            if (tipo == 1) {
                  return array[((array.length + 1) / 2) - 1];
            } else {
                  int m = array.length / 2;
                  return (array[m - 1] + array[m]) / 2;
            }
      }

      public double getModa() {
            HashMap map = new HashMap();
            Integer i;
            Double moda = 0.0;
            Integer numAtual, numMaior = 0;
            for (int count = 0; count < array.length; count++) {
                  i = (Integer) map.get(new Double(array[count]));
                  if (i == null) {
                        map.put(new Double(array[count]), new Integer(1));
                  } else {
                        map.put(new Double(array[count]), new Integer(i.intValue() + 1));
                        numAtual = i.intValue() + 1;
                        if (numAtual > numMaior) {
                             numMaior = numAtual;
                             moda = new Double(array[count]);
                        }
                  }
            }
            // System.out.print("\n Eis o mapa: "+map.toString());
            return moda;
      }
   
      public double[] getArray() {
            return array;
      }
      public void setArray(double[] array) {
            this.array = array;
      }

    void setArray(Vector vector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
