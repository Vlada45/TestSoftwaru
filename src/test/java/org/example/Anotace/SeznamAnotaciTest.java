package org.example.Anotace;

import org.example.MyMin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeznamAnotaciTest {

    @Test
    public void nejmensiCisloTest() {
        MyMin find = new MyMin();

        Assertions.assertEquals(5, find.myMin(5, 8), "Expected 5 to be the minimum");
        Assertions.assertEquals(3, find.myMin(7, 3), "Expected 3 to be the minimum");
        Assertions.assertEquals(-1, find.myMin(0, -1), "Expected -1 to be the minimum");
        Assertions.assertEquals(0, find.myMin(0, 0), "Expected 0 to be the minimum");
    }
}