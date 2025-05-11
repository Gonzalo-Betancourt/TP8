import java.util.ArrayList;
import java.util.List;

public class Carrito <T extends Producto<?>>{

    private List<T> productos;

    public void agregarProducto(T producto){
        if (productos == null) productos = new ArrayList<>();
        productos.add(producto);
    }

    public void eliminarProducto(T producto){
        if (productos.contains(producto)) productos.remove(producto);
    }

    public double obtenerTotal(){

        double total = 0;

        for (Producto p : productos){
            double precio = p.getPrecio();
            total += precio;
        }

        return total;
    }

    public void mostrarProductos(){
        System.out.println("Productos en el carrito: ");
        for (Producto p : productos){
            System.out.println(p);
        }
    }

}
