package tdd.capitulo7;

import tdd.capitulo4.Funcionario;

public class DezOuVintePorCento extends RegraDeCalculo {

	@Override
	protected int limite() {
		return 3000;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.8;
	}

	@Override
	protected double porcentagemBase() {
		return 0.9;
	}

//	@Override
//	public double calcula(Funcionario funcionario) {
//		if (funcionario.getSalario() > 3000) {
//			return funcionario.getSalario() * 0.8;
//		}
//		return funcionario.getSalario() * 0.9;
//	}

}
