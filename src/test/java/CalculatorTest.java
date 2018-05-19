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
    int sum = calculator.add(1, 3);

    assertThat(sum, is(4));
  }

  @Test
  public void testSub() {
    int result = calculator.sub(6, 2);

    assertEquals(result, 4);
  }

  @Test
  public void testMul() {
    int result = calculator.mul(7, 5);
    boolean flag = false;
    if (result == 35)
      flag = true;

    assertTrue("Multiply method return true", flag);
  }
}
