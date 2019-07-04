package tdd.capitulo4;

public class CalculadoraDeSalario {

	public double calculaSalario(Funcionario desenvolvedor) {
		if(desenvolvedor.getSalario() > 3000.0) return 3200.0;
		return 1350.0;
	}

}
