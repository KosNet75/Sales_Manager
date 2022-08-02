public class Main {

  public static void main(String[] args) {
    SalesManager arreySales = new SalesManager(new int[]{100, 96, 140, 90, 210, 50});
    System.out.println("Наибольший чек продаж: " + arreySales.max() + " руб.");
    System.out.println("Наименьший чек продаж: " + arreySales.min() + " руб.");
    System.out.println("Средний чек всех продаж: " + arreySales.averageSales() + " руб.");
    System.out.println("Количество продаж: " + arreySales.i + "\nВсего продаж на сумму: " +
        arreySales.averageSales() * arreySales.i + " руб.");

  }


}
