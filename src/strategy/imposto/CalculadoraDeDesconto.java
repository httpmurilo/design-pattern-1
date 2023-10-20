package strategy.imposto;

import strategy.desconto.Desconto;
import strategy.desconto.DescontoComMaisDeCincoItens;
import strategy.desconto.DescontoComValorMaiorQueQuinhentos;
import strategy.desconto.SemDesconto;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoComMaisDeCincoItens(
                new DescontoComValorMaiorQueQuinhentos(
                        new DescontoComValorMaiorQueQuinhentos(
                                new SemDesconto()
                        )
                ));

        return desconto.calcular(orcamento);
    }
}
