package strategy.imposto;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto imposto) {
        return imposto.calcular(orcamento);
    }
}
