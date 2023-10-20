package strategy.desconto;

import strategy.imposto.Orcamento;

import java.math.BigDecimal;

public class DescontoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().max(new BigDecimal("0.2"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
