package strategy.situacao;

import strategy.imposto.Orcamento;

import java.math.BigDecimal;

public class Aprovado {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento) {
        throw new IllegalArgumentException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}
