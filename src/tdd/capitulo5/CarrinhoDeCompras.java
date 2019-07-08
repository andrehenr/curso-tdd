package tdd.capitulo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}

	public void adiciona(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public double maiorValor() {

		if (itens.isEmpty()) {
			return 0;
		}
		double maior = itens.get(0).getValorUnitario();
		for (Item item : itens) {
			if (item.getValorUnitario() > maior) {
				maior = item.getValorUnitario();
			}
		}
		return maior;
	}

}
