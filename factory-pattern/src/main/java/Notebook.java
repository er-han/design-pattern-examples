public class Notebook extends Product {

  public Notebook(int purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  @Override
  protected int getRateOfVat() {
    return 18;
  }

  @Override
  protected int getRateOfProfit() {
    return 40;
  }
}
