package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lambda.entity.Product;
import lambda.util.PriceUpdate;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*
		A função "map" (não confunda com a estrutura de dados Map) é uma 
		função que aplica uma função a todos elementos de uma stream.
		
		stream é uma sequencia de dados
		
		List para stream: .stream()
		Stream para List: .collect(Collectors.toList())
		
		map recebe como argumento um Function
		
		Function recebe um objeto do tipo T e recebe o tipo R
		*/
		
		List<String> nomesMaiusculo = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nomesMaiusculo.forEach(System.out::println);

	}
}