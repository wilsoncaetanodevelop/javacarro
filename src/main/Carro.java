package main;

public class Carro {

    private String marca;
    private String modelo;
    private double valor;

    public Carro() {

        this.marca = "nenhuma";
        this.modelo = "nao especificado";
        this.valor = 0.0;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", valor=" + valor + '}';
    }

}
