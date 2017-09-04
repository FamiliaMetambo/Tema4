/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import Exercicio2.*;
import static Exercicio3.Test.vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Novela Mussane
 */
public class Test {
    
     public static Vector getVector() {
        return vector;
    }

    static Vector vector;
    
    
    
    
    public static void main(String[] args) {
    //Instancia a classe utilitária

            Estatistica e = new Estatistica();
      
          double array[] = {1,2,3,5,8,6,5,8,6,7,1,3,6,9,7,7,1,6,3,4,5};
              
              
           
         e.setArray(array);

          double t1 = System.currentTimeMillis();

            System.out.print("\n mediana: "+ e.getMediana());

            System.out.print("\n Media Aritmética: "+e.getMediaAritmetica());

            System.out.print("\n Moda: "+e.getModa());


            //marca o fim do processamento

            double t2 = System.currentTimeMillis();

            //exibe o tempo em segundos

            System.out.print("\n Tempo Total: "+ (t2-t1)/Double.valueOf(1000)+ " segundos");

            
    
}

}