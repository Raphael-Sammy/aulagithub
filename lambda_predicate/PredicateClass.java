package lambda_predicate;

import com_expressao.Product;

import java.util.ArrayList;
import java.util.List;

public class PredicateClass {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p ->  p.getPrice() >= min);

        list.forEach(System.out::println);
    }
}