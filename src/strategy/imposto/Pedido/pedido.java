package strategy.imposto.Pedido;

import strategy.imposto.Orcamento;

import java.time.LocalDateTime;

public class pedido {

    private String cliente;
    private LocalDateTime dataHora;
    private Orcamento orcamento;

    public pedido(String cliente, LocalDateTime dataHora, Orcamento orcamento) {
        this.cliente = cliente;
        this.dataHora = dataHora;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
