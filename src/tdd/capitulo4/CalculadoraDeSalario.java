package tdd.capitulo4;

public class CalculadoraDeSalario {

	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}

}
