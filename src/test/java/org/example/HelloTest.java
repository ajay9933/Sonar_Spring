package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class HelloTest {

    @Test
    public void testSum() {

        int result = Hello.sum(2, 3);
        assertEquals(5, result);

        result = Hello.sum(-1, 1);
        assertEquals(0, result);

        result = Hello.sum(0, 0);
        assertEquals(0, result);

        result = Hello.sum(-5, -3);
        assertEquals(-8, result);
    }
}
