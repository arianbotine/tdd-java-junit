package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
	
	BigDecimal taxaReajuste;

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		this.definirTaxa(desempenho);
		BigDecimal reajuste = funcionario.getSalario().multiply(this.taxaReajuste);
		funcionario.reajustarSalario(reajuste);
		
	}
	
	private void definirTaxa(Desempenho desempenho) {
		switch (desempenho) {
		case A_DESEJAR:
			this.taxaReajuste = new BigDecimal("0.03");
			break;
		case BOM:
			this.taxaReajuste = new BigDecimal("0.15");
			break;
		case OTIMO:
			this.taxaReajuste = new BigDecimal("0.20");
			break;
		default:
			this.taxaReajuste = new BigDecimal("0");
			break;
		}
	}

}
