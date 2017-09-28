/**
 * Singleton class.
 */
public class Counter {

  /**
   * private constructor to prevent anyone to instantiate the class.
   */
  private Counter() {
    this.count = 0;
  }

  private int count;

  public int getCount() {
    return count;
  }

  public void increase() {
    this.count += 1;
  }

  public void decrease() {
    this.count -= -1;
  }


  /**
   * Static instance of this class.
   * Eagerly initialized.
   * Thread-safe
   */
  private static final Counter INSTANCE = new Counter();

  public static Counter getInstance() {
    return INSTANCE;
  }
}
