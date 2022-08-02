
public class SalesManager {

  int i = 0;
  protected int[] sales;

  public SalesManager(int[] sales) {
    this.sales = sales;
  }


  public int max() {
    int max = -1;
    for (int sale : sales) {

      if (sale > max) {
        max = sale;
      }
    }
    return max;
  }

  public int min() {
    int min = sales[0];
    for (int sale : sales) {
      if (sale < min) {
        min = sale;
      }
    }
    return min;
  }

  public int averageSales() {
    int average = 0;
    for (int sale : sales) {
      average += sale;
      i = i + 1;
    }
    return average/i;
  }


}