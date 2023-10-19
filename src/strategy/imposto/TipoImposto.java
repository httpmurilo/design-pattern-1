package strategy.imposto;

import strategy.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
