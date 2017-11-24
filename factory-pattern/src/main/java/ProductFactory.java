public class ProductFactory {

  public static Product getProduct(String type, int purchasePrice) {
    switch (type) {
      case "notebook":
        return new Notebook(purchasePrice);
      case "shirt":
        return new Shirt(purchasePrice);
      default:
        return null;
    }
  }
}
