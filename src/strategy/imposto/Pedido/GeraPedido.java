package strategy.imposto.Pedido;

import strategy.imposto.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        System.out.println("---------------");
        System.out.println("Teste de pedidos");
        Orcamento orcamento1 = new Orcamento(this.valorOrcamento, this.quantidadeItens);


        pedido p = new pedido(cliente, LocalDateTime.now(), orcamento1);




    }
}
