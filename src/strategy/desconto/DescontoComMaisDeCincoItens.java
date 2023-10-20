package strategy.desconto;

import strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoComMaisDeCincoItens  extends Desconto{

    public DescontoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().max(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
