package br.com.alura.conversor.moedas;

public class DolarParaPesoCol implements Conversao {
    private final double taxaCambio;

    public DolarParaPesoCol(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}