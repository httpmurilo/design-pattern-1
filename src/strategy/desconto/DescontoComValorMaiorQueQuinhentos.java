package strategy.desconto;

import strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().max(new BigDecimal("0.2"));
        }

        return proximo.calcular(orcamento);
    }
}
