package strategy;

import strategy.imposto.*;
import strategy.imposto.Pedido.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

        System.out.println("---------------");
        System.out.println("Teste de pedidos");
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 5);
        String cliente = "murilo";
        LocalDateTime data = LocalDateTime.now();

        pedido p = new pedido(cliente, data, orcamento1);
    }
}