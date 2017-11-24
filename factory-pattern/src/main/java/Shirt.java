public class Shirt extends Product {

  public Shirt(int purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  @Override
  protected int getRateOfVat() {
    return 8;
  }

  @Override
  protected int getRateOfProfit() {
    return 60;
  }
}
