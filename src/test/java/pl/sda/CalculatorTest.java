package pl.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before // runs before each test
    public void getSet() {
        calculator = new Calculator();
    }


    @Test
    public void shouldReturn14For5And9() {
        //given
        final int arg1 = 5;
        final int arg2 = 9;
        final int expectedResult = 14;

        //when
        int result = calculator.add(arg1, arg2);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn0ForMinus5And5() {
        //given
        final int arg1 = -5;
        final int arg2 = 5;
        final int expectedResult = 0;

        //when
        int result = calculator.add(arg1, arg2);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        //given
        final float arg1 = 10;
        final float arg2 = 0;

        //when
        try {
            calculator.divide(arg1, arg2);
            Assert.fail("Wyjątek nie został wyrzucony"); // in case when tests pass even if they shouldn't
        } catch (DividedByZeroException e) {
            //then
            Assert.assertTrue(e instanceof DividedByZeroException); //instanceof - checking if e is type DividedByZeroException
            Assert.assertTrue(e instanceof RuntimeException);
        }

    }
}
