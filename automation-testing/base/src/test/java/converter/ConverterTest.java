package converter;

import org.converter.Converter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ConverterTest {

    Converter first = new Converter(3.2, 3.6);

    @Test
    public void test1() {
        assertEquals(first.convert("BYN", "USD", 0), 0, "//actual and  results isn't expected equal");
    }

    @Test
    public void test2() {
        assertEquals(first.convert("BYN", "USD", 1), 0.313, "Actual result is not equal expected result");
    }

    @Test
    public void test3() {
        assertEquals(first.convert("BYN", "USD", 1.1), 0.344, "Actual result is not equal expected result");
    }

    @Test
    public void test4() {
        assertEquals(first.convert("BYN", "USD", 10), 3.125, "Actual result is not equal expected result");
    }

    @Test
    public void test5() {
        assertEquals(first.convert("USD", "BYN", 0), 0, "Actual result is not equal expected result");
    }

    @Test
    public void test6() {
        assertEquals(first.convert("USD", "BYN", 1), 3.2, "Actual result is not equal expected result");
    }

    @Test
    public void test7() {
        assertEquals(first.convert("USD", "BYN", 1.1), 3.520, "Actual result is not equal expected result");
    }

    @Test
    public void test8() {
        assertEquals(first.convert("USD", "BYN", 10), 32, "Actual result is not equal expected result");
    }

    @Test
    public void test9() {
        assertEquals(first.convert("BYN", "EUR", 0), 0, "Actual result is not equal expected result");
    }

    @Test
    public void test10() {
        assertEquals(first.convert("BYN", "EUR", 1), 0.278, "Actual result is not equal expected result");
    }

    @Test
    public void test11() {
        assertEquals(first.convert("BYN", "EUR", 1.1), 0.306, "Actual result is not equal expected result");
    }

    @Test
    public void test12() {
        assertEquals(first.convert("BYN", "EUR", 10), 2.778, "Actual result is not equal expected result");
    }

    @Test
    public void test13() {
        assertEquals(first.convert("EUR", "BYN", 0), 0, "Actual result is not equal expected result");
    }

    @Test
    public void test14() {
        assertEquals(first.convert("EUR", "BYN", 1), 3.600, "Actual result is not equal expected result");
    }

    @Test
    public void test15() {
        assertEquals(first.convert("EUR", "BYN", 1.1), 3.960, "Actual result is not equal expected result");
    }

    @Test
    public void test16() {
        assertEquals(first.convert("EUR", "BYN", 10), 36, "Actual result is not equal expected result");
    }

    @Test
    public void test17() {
        assertEquals(first.convert("EUR", "USD", 0), 0, "Actual result is not equal expected result");
    }

    @Test
    public void test18() {
        assertEquals(first.convert("EUR", "USD", 1), 1.125, "Actual result is not equal expected result");
    }

    @Test
    public void test19() {
        assertEquals(first.convert("EUR", "USD", 1.1), 1.238, "Actual result is not equal expected result");
    }

    @Test
    public void test20() {
        assertEquals(first.convert("EUR", "USD", 10), 11.250, "Actual result is not equal expected result");
    }

    @Test
    public void test21() {
        assertEquals(first.convert("USD", "EUR", 0), 0, "Actual result is not equal expected result");
    }

    @Test
    public void test22() {
        assertEquals(first.convert("USD", "EUR", 1), 0.889, "Actual result is not equal expected result");
    }

    @Test
    public void test23() {
        assertEquals(first.convert("USD", "EUR", 1.1), 0.978, "Actual result is not equal expected result");
    }

    @Test
    public void test24() {
        assertEquals(first.convert("USD", "EUR", 10), 8.889, "Actual result is not equal expected result");
    }
}
