package com.platzi.javatest.util;

import com.platzi.javatest.util.ejemplos.PasswordUtils;
import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilsTest {

    @Test
    public void testweak(){
        Assert.assertEquals(PasswordUtils.assessPassword("123"), PasswordUtils.SecurityLevel.WEAK);
    }

    @Test
    public void testweak2(){
        Assert.assertEquals(PasswordUtils.assessPassword("asasfdaAFZAwer"), PasswordUtils.SecurityLevel.WEAK);
    }

}