
package tarea10_tatianagarcia;

import java.awt.Color;
import java.util.Calendar;

public class Carro {
    private String marca;
    private String modelo;
    private Calendar fecha;
    private Color color;
    private int millas;
    private String tipo;//Camion , pickup, turismo
    private boolean camara;

    public Carro() {
    }

    public Carro(String marca, String modelo, Calendar fecha, Color color, int millas, String tipo, boolean camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.color = color;
        this.millas = millas;
        this.tipo = tipo;
        this.camara = camara;
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", fecha=" + fecha + ", color=" + color + ", millas=" + millas + ", tipo=" + tipo + ", camara=" + camara + '}';
    }
    
}
