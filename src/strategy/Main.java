package strategy;

import strategy.imposto.*;
import strategy.imposto.Pedido.GeraPedido;
import strategy.imposto.Pedido.GeraPedidoHandler;
import strategy.imposto.Pedido.acao.EnviarEmail;
import strategy.imposto.Pedido.acao.SalvarPedido;
import strategy.imposto.Pedido.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

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
        System.out.println("Calculadora de descontos");
        GeraPedido pedido = new GeraPedido("murilo",BigDecimal.valueOf(300),5);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedido(),new EnviarEmail())
        );
        handler.execute(pedido);


    }
}