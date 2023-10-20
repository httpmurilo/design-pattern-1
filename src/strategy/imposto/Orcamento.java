package strategy.imposto;

import strategy.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra =  BigDecimal.ZERO;

        if(situacao.equals("EM ANALISE")) {

        } else if (situacao.equals("APROVADO")) {
            valorDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao = "APROVADO";
    }



    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
