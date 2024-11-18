package br.com.alura.conversor.moedas;

public class DolarParaPesoArg  implements Conversao{
    private final double taxaCambio;

    public DolarParaPesoArg(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}