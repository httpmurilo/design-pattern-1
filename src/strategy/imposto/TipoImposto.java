package strategy.imposto;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
