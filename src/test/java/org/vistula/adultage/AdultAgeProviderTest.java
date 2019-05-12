package org.vistula.adultage;

import org.junit.Test;

public class AdultAgeProviderTest {
    @Test
    public void shouldReturnCorrectAgeUSA() {
        assert AdultAgeProvider.getAdultAge("USA") == 21;
    }
    @Test
    public void shouldReturnCorrectAgeUnitedStates() {
        assert AdultAgeProvider.getAdultAge("United States") == 21;
    }
    @Test
    public void shouldReturnCorrectAgePoland() {

        for (int i = 0; i< 10; i++) {

        }

        assert AdultAgeProvider.getAdultAge("Poland") == 18;
    }
    @Test(expected = RuntimeException.class)
    public void shouldReturnCorrectAgeEmpty() {
        assert AdultAgeProvider.getAdultAge("") == 18;
    }
}

