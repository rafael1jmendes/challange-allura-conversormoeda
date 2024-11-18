package br.com.alura.conversor.moedas;

public class DolarParaReal implements Conversao {
    private final double taxaCambio;

    public DolarParaReal(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}