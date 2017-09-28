import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class CounterTest {

  @Test
  public void shouldReturnTheSameInstance() {
    final Counter counter1 = Counter.getInstance();
    final Counter counter2 = Counter.getInstance();

    assertEquals(counter1, counter2);
  }

  @Test
  public void shouldUseTheSameInstance() {
    final Counter counter = Counter.getInstance();

    Random random = new Random();

    for (int i = 0; i < 50; i++) {
      boolean increase = random.nextBoolean();

      if (increase) {
        counter.increase();
      } else {
        counter.decrease();
      }
    }

    final Counter counter2 = Counter.getInstance();

    assertEquals(counter.getCount(), counter2.getCount());
  }

}