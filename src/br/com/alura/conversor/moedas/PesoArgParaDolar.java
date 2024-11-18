package br.com.alura.conversor.moedas;

public class PesoArgParaDolar  implements Conversao {
    private final double taxaCambio;

    public PesoArgParaDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}