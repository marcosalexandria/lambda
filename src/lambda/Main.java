package lambda;

import java.util.ArrayList;
import java.util.List;

import lambda.entity.Product;
import lambda.util.PriceUpdate;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double aumento = 1.1;
//forEach de uma coleção recebe um consumer, ele é void, apenas execulta um comando
//cada produto (p) vai receber (->) o seu preço mais 10% do seu preço
		list.forEach(p -> p.setPreco(p.getPreco() * aumento));
		
		 list.forEach(System.out::println);

	}
}