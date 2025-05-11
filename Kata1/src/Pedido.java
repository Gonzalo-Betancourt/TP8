import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {

    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void agregarProducto(Producto<?> producto){
        if (productos == null) productos = new ArrayList<>();
        productos.add(producto);
    }

    public double obtenerTotal(){

        double total = 0;

        if(productos != null){
            for (Producto p : productos){
                double precio = p.getPrecio();
                total += precio;
            }
        }


        return total;
    }

    @Override
    public int compareTo(Pedido otro) {
        return (int) (this.obtenerTotal() - otro.obtenerTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", productos=" + productos +
                ", fecha=" + fecha +
                '}';
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }

}
