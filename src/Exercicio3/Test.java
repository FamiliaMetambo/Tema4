/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import static Exercicio3.Test.vector;
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
    
    public static double[] array(String str){
        double array[] = new double[1000]; int i = 0;
        
        do {
                String lido = JOptionPane.showInputDialog(str);
                if(lido.equalsIgnoreCase("C"))
                    break;
                array[i++] = Double.parseDouble(lido);                
       } while(true);
        return array;
    }
    
    
    
    public static void main(String[] args) {
    //Instancia a classe utilitária

            Estatistica e = new Estatistica();
            String str = "Digite um numero: \nPara terminar digite: c";
                                            
            e.setArray(array(str));

//            System.exit(0);
            
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