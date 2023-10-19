package strategy.imposto;

import strategy.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0,6"));
    }
}
