package strategy.imposto.Pedido.acao;

import strategy.imposto.Pedido.pedido;

public class EnviarEmail implements AcaoAposGerarPedido {


    @Override
    public void executarAcao(pedido p) {
        System.out.println("Enviando email");
    }
}
