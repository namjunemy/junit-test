import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  public void notNull() {
    assertNotNull(calculator);
  }

  @Test
  public void testAdd() {
    double sum = calculator.add(1, 3);

    assertThat(sum, is(4.0));
  }

  @Test
  public void testSub() {
    double result = calculator.sub(6, 2);

    assertEquals((int) result, (int) 4.0);
  }

  @Test
  public void testMul() {
    double result = calculator.mul(7, 5);
    boolean flag = false;
    if (result == 35)
      flag = true;

    assertTrue("Multiply method return true", flag);
  }
}
