public abstract class Product {
  protected int purchasePrice;

  public int getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(int purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public int getSalePrice() {
    int price = purchasePrice + (purchasePrice * getRateOfVat()) / 100;
    price = price + (price * getRateOfProfit()) / 100;
    return price;
  }

  protected abstract int getRateOfVat();

  protected abstract int getRateOfProfit();

  @Override
  public String toString() {
    return "Purchase Price: " + getPurchasePrice() + ", Sale Price: " + getSalePrice();
  }
}
