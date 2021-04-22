
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertTrue(result == 20);
        assertFalse(result == 19);
    }

    //빼기 테스트 작성
    @Test
    public void subtractTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(20,10);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertTrue(result == 10);
    }

    //곱하기 테스트 작성
    @Test
    public void multiplyTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertTrue(result == 45);
    }

    //나누기 테스트 작성
    @Test
    public void divideTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertTrue(result == 5);
    }
}