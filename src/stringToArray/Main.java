package stringToArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
        - Enunciado: Crea un método que convierta una cadena de texto (String) en un Array de enteros (Integer).
        El método recibirá como parámetro la cadena y devolverá un ArrayList de tipo Integer.
        Debes lanzar una excepción en los siguientes casos:
        1) El array no está bien formado (es decir, no tiene [] o , para separar los elementos.
        2) El elemento a convertir no es un entero.
        - Consideraciones: Crea una Clase llamada Util para meter este método y otros que puedan resultar de utilidad.
         No se debe instanciar la clase Util, se debe poder invocar directamente al método a través de Util.stringToArray()

*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese una cadena del tipo \"[1,2,3]\"");
        String str1 = reader.readLine();
        System.out.println(Util.callToAction(str1));
    }
}
