package model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;
    private BigDecimal descontOrcamento;

    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.descontOrcamento = descontOrcamento;
    }

    public BigDecimal getValorOrcamento() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return descontOrcamento;
    }
}
