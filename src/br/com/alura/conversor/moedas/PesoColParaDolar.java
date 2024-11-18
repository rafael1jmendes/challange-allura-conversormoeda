package br.com.alura.conversor.moedas;

public class PesoColParaDolar implements Conversao {
    private final double taxaCambio;

    public PesoColParaDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}