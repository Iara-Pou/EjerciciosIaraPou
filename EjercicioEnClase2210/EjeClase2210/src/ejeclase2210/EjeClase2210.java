/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeclase2210;

/*Se necesita crear un vector estático  de tipo double que tenga como resultado 
útiles escolares.
Imprimiendo en pantalla:
Litado de precios de los Útiles escolares
Lapicera  $ 40.5
Cuaderno  $ 139.99
Cartuchera  $ 560.5
Mochila  $ 1399.99
 */
public class EjeClase2210 {
    public static void main(String[] args) {
    
//creo vectores        
    String [] utiles = {"Lapicera", "Cuaderno", "Cartuchera", "Mochila"};
    double [] precios = {40.5, 139.99, 560.5, 1399.99};

//muestro precios
    for (int i= 0; i<4; i++){
    System.out.println(utiles [i]+ ": $"+ precios[i]);
    
    }


    }
    
}
