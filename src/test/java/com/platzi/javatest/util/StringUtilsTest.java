package com.platzi.javatest.util;

import com.platzi.javatest.util.ejemplos.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    /**
     * test de prueba inicial, cada test debe ir separado en metodos apartes
     * de forma atomica, no todoo dentro de un mismo test
     */
    @Test
    public void testRepeat (){
        String resultado = StringUtils.repeat("hola", 3);

        //prueba de error
        //assertEquals(resultado, "holaholaholaf");

        //prueba correcta, con excepciones
        assertEquals(resultado, "holaholahola");

        //prueba correcta con JUnit
        Assert.assertEquals("holaholahola", resultado);

        //prueba error con JUnit
        //Assert.assertEquals("holaholahofla", resultado);

    }

    @Test
    public void repeatStringOnce(){
        Assert.assertEquals("hola", StringUtils.repeat("hola", 1));
    }

    @Test
    public void repeatZero(){
        Assert.assertEquals("", StringUtils.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeNumber(){
        StringUtils.repeat("hola", -1);
    }

    private static void assertEquals(String actual, String esperado) {
        if (!actual.equals(esperado)){
            throw new RuntimeException(actual + " no es igual a " + esperado);
        }
    }

    @Test
    public void isVoidNull(){
        Assert.assertTrue(StringUtils.isVoid(null));
    }

    @Test
    public void isVoid(){
        Assert.assertTrue(StringUtils.isVoid(""));
    }

    @Test
    public void isVoidSpace(){
        Assert.assertTrue(StringUtils.isVoid(" "));
    }

    @Test
    public void isNotVoid(){
        Assert.assertTrue(!StringUtils.isVoid(" 3 "));
    }

}