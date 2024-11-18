package br.com.alura.conversor.moedas;

public class RealParaDolar implements Conversao {
    private final double taxaCambio;

    public RealParaDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}