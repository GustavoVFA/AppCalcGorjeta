package br.com.etecia.empresa;

public class Gorjeta {

    private double valorDaConta;

    public double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    /**
     * Retorna um valor de 10%
     * @return
     */
    public double excelente() {
        return this.valorDaConta * 1.10;
    }

    /**
     * Retorna um valor de 8%
     * @return
     */
    public double otimo() {
        return this.valorDaConta * 1.08;
    }

    /**
     * Retorna o valor de 5%
     * @return
     */
    public double bom() {
        return this.valorDaConta * 1.05;
    }

    /**
     * Retorna o valor de 2%
     * @return
     */
    public double ruim() {
        return this.valorDaConta * 1.02;
    }
}
