package strategy.imposto.Pedido;

import strategy.imposto.Orcamento;
import strategy.imposto.Pedido.acao.AcaoAposGerarPedido;
import strategy.imposto.Pedido.acao.EnviarEmail;
import strategy.imposto.Pedido.acao.SalvarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //repository,service,etc


    public GeraPedidoHandler(List<AcaoAposGerarPedido> acaoAposGerarPedidoList) {
        this.acaoAposGerarPedidoList = acaoAposGerarPedidoList;
    }

    private List<AcaoAposGerarPedido> acaoAposGerarPedidoList;

    public void execute(GeraPedido pedido) {
        EnviarEmail enviarEmail = new EnviarEmail();
        SalvarPedido salvarPedido = new SalvarPedido();

        Orcamento orcamento1 = new Orcamento(pedido.getValorOrcamento(), pedido.getQuantidadeItens());


        pedido p = new pedido("nome", LocalDateTime.now(), orcamento1);
        acaoAposGerarPedidoList.forEach(a -> a.executarAcao(p));



    }

}
