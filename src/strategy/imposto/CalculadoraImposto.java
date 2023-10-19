package strategy.imposto;

import strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto imposto) {
        return imposto.calcular(orcamento);
    }
}
