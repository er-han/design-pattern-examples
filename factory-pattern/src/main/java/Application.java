import java.util.Arrays;
import java.util.List;

public class Application {

  public static void main(String... args) {

    Product product1 = ProductFactory.getProduct("notebook", 100);
    Product product2 = ProductFactory.getProduct("shirt", 100);

    List<Product> chart = Arrays.asList(product1, product2);

    for (Product item :
        chart) {
      System.out.println(item.toString());
    }
  }
}
