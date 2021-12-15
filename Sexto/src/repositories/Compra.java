package repositories;

public class Compra {

    private Cesta cesta = new Cesta();
    private Usuarios usuario = new Usuarios();

    public void crearCompra(Cesta cesta, Usuarios usuarios){
        this.cesta=cesta;
        this.usuario=usuarios;
    }

    public Cesta getCesta() {
        return cesta;
    }

    public void setCesta(Cesta cesta) {
        this.cesta = cesta;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "cesta=" + cesta +
                ", usuario=" + usuario +
                '}';
    }
}
