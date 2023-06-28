package com.platzi.javatest.util;

import com.platzi.javatest.util.ejemplos.Dice;
import com.platzi.javatest.util.ejemplos.Player;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Test de ejemlo con MOckito, no se puede hacer mock de metodos estaticos de cualquier clase
 */
public class PlayerTest {

    @Test
    public void playTestLose(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 4);
        assertEquals(false, player.play());
    }

    @Test
    public void playTestWin(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);

        Player player = new Player(dice, 4);
        assertEquals(true, player.play());
    }

}