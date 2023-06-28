package com.platzi.javatest.util.ejemplos;

public class StringUtils {

    public static String repeat (String str, int times){

        if (times<0){
            throw new IllegalArgumentException("argumento no soportado");
        }

        String resultado = "";
        for (int i = 0; i < times; i++) {
            resultado += str;
        }

        return resultado;
    }

    public static boolean isVoid(String str){
        return str == null || str.trim().equals("");
    }
}
