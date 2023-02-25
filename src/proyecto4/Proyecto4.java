package proyecto4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Proyecto4 {
    /* 4. Crear un programa que añada números a una lista hasta que introducimos un 
    número negativo. A continuación, debe crear una nueva lista igual que la anterior,
    pero eliminando los números duplicados. Muestra esta segunda lista para 
    comprobar que hemos eliminados los duplicados.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Integer> listaNumeros = new ArrayList<Integer>();
        
        int numero;
        System.out.println("Ingrese los numeros");
        
        do {            
            numero = sc.nextInt();
            listaNumeros.add(numero);        
            
        } while (0<numero);
        
        System.out.println();
        for (int numeros: listaNumeros) {
            System.out.print(numeros+" ");
        }
        
        Set miConjunto = new HashSet<>(listaNumeros);
        listaNumeros.clear();
        listaNumeros.addAll(miConjunto);
        System.out.println();
        for (int numerosNoDupicados: listaNumeros) {
            System.out.print(numerosNoDupicados+" ");
        }
        
    } 
}
