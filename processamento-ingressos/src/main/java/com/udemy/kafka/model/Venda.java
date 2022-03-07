package com.udemy.kafka.model;

import java.math.BigDecimal;

public class Venda {

    private Long operacao;

    private Long cliente;

    private Integer quantidadeIngressos;

    private BigDecimal valorTotal;

    private String status;

    public Long getOperacao() {
        return operacao;
    }

    public void setOperacao(Long operacao) {
        this.operacao = operacao;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public Integer getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public void setQuantidadeIngressos(Integer quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda [cliente=" + cliente + ", operacao=" + operacao + ", quantidadeIngressos=" + quantidadeIngressos
                + ", status=" + status + ", valorTotal=" + valorTotal + "]";
    }

    public Venda(Long operacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal, String status) {
        this.operacao = operacao;
        this.cliente = cliente;
        this.quantidadeIngressos = quantidadeIngressos;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Venda(Long operacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal ) {
        this.operacao = operacao;
        this.cliente = cliente;
        this.quantidadeIngressos = quantidadeIngressos;
        this.valorTotal = valorTotal;
        
    }

    public Venda() {
    }


    
    
    
}
