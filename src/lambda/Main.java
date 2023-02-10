package lambda;

import java.util.ArrayList;
import java.util.List;

import lambda.entity.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Double min = 100.0;
		

		//função anonima que recebe como argumento um (p -> produto que retorna) que 
		//(-> p.getPreco() >= min; retorna o booleano de preço maio ou igual a 100)
		list.removeIf( p -> p.getPreco() >= min );
		for (Product p : list) {
			System.out.println(p);
		}
		

	}
}