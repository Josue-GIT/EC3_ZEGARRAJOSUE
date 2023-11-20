package pe.edu.idat.appec3_zegarrajosue;

public class Bus {
    private int paradero;
    private int imagen;
    private String info;
    private String pasajeros;

    public Bus(int paradero, int imagen, String info, String pasajeros) {
        this.paradero = paradero;
        this.imagen = imagen;
        this.info = info;
        this.pasajeros = pasajeros;
    }

    public int getParadero() {
        return paradero;
    }

    public void setParadero(int paradero) {
        this.paradero = paradero;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }
}
