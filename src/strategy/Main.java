package strategy;

import strategy.imposto.CalculadoraImposto;
import strategy.imposto.ICMS;
import strategy.imposto.ISS;
import strategy.imposto.TipoImposto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamento, new ISS()));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS()));
    }
}