package tdd.capitulo4;

import tdd.capitulo7.DezOuVintePorCento;
import tdd.capitulo7.QuinzeOuVinteCincoPorCento;
import tdd.capitulo7.RegraDeCalculo;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteCincoPorCento()),
	TESTADOR(new QuinzeOuVinteCincoPorCento());
	
	private final RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
