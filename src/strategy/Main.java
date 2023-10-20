package strategy;

import strategy.imposto.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamento, new ISS()));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS()));

        System.out.println("---------------");
        System.out.println("Calculadora de descontos");
        CalculadoraDeDesconto deDesconto= new CalculadoraDeDesconto();
        System.out.println(deDesconto.calcular(orcamento));
    }
}