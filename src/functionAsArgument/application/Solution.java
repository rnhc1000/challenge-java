package functionAsArgument.application;
import functionAsArgument.entities.Products;
import functionAsArgument.services.ProductsService;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List<Products> list = new ArrayList<>();

    list.add(new Products("Tv", 900.00));
    list.add(new Products("Mouse", 50.00));
    list.add(new Products("Tablet", 350.50));
    list.add(new Products("HD Case", 80.90));
    list.add(new Products("Tv LED", 1900.00));
    list.add(new Products("Mechanical Mouse", 50.00));
    list.add(new Products("Ipad Tablet", 350.50));
    list.add(new Products("Monitor", 80.90));

    double sum = new ProductsService().filteredSum(list, p->p.getName().charAt(0)=='M');

    System.out.printf("Sum: %.2f",sum);



  }
}
