/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

/**
 *
 * @author luis
 */
public class palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String cadenaInput;
        //1
        cadenaInput="oso";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
        
        //2
        cadenaInput="x";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
       
        //3
        cadenaInput="12345*54321";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
         //4
        cadenaInput="";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
        //5 
        cadenaInput="ab";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
       //6
        cadenaInput="abde edba";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
        //7
        cadenaInput="engañar"
                + "rañagne";
        System.out.println("Probando {"+cadenaInput + "} - Resultado {"+evaluate(cadenaInput));
        
        //8
        cadenaInput="beba abeb";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
        //9
        
        cadenaInput="lili a ilil";
        System.out.println("Probando "+cadenaInput + " - Resultado "+evaluate(cadenaInput));
        
         //10
        cadenaInput= null;
        try{
            evaluate(cadenaInput);
        }
        catch(IllegalArgumentException a){
            System.out.println("Probando "+cadenaInput + " - Resultado "+a);
        }
        
    }
    
    
    public static boolean evaluate(String word) {
    if (word == null) {
      throw new IllegalArgumentException("You can't pass a null String as input.");
    }
    boolean result = true;
    int length = word.length();
    for (int i = 0; i < length / 2; i++) {
      if (word.charAt(i) != word.charAt(length - 1 - i)) {
        result = false;
        break;
      }
    }
    return result;
}
    
    
}
