package strategy.desconto;

import strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoComMaisDeCincoItens  extends Desconto{

    public DescontoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().max(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
