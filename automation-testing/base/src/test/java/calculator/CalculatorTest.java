package calculator;

import org.calculator.Calculator;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void calculatorSum1Test() {
        Calculator calculator = new Calculator();
        if (calculator.sum(2, 3) != 5) {
            throw new Error("Calculator sum methods work incorrectly ");
        }
    }

    @Test
    public void calculatorSum2Test() {
        Calculator calculator = new Calculator();
        if (calculator.sum(2, 3) != 6) {
            throw new Error("Calculator sum methods work incorrectly ");
        }
    }
}
