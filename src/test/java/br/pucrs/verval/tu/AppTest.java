package br.pucrs.verval.tu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.pucrs.verval.tu.returnResult.App;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        
        String expected = "Intervalo (25,50]";
        String actual = App.solve(25.01);
        assertEquals(actual, expected);

    }
}
