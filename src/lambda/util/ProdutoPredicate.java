package lambda.util;

import java.util.function.Predicate;

import lambda.entity.Product;

public class ProdutoPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPreco() >= 100.0; //vai me retornar true se o preço maior igual a 100
	}

}
