package stringToArray;

import java.util.ArrayList;

public class Util {
    public static ArrayList<Integer> callToAction(String str) throws NumberFormatException{
        ArrayList<Integer> result = new ArrayList<>();

        if(!str.startsWith("[") || !str.endsWith("]") || !str.contains(",")){
            throw new NumberFormatException("Error de formato");
        }

        String strClean = str.substring(1, str.length() - 1);
        String[] strCleanSplit = strClean.split(",");

        for (String letra : strCleanSplit){
            if(isInt(letra)){
                result.add(Integer.parseInt(letra));
            }else {
               throw new NumberFormatException ("La cadena ingresada posee caracteres que NO son nuemros enteros.");
            }
        }
        return result;
    }

    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}

