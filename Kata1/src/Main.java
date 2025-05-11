import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Kata 1

        System.out.println("\nKata 1");

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto<>(12, "Remera", 24));
        productos.add(new Producto<>("A331", "Celular", 2000));

        for (Producto p : productos){
            System.out.println(p);
        }

        // Kata 2

        System.out.println("\nKata 2");

        Carrito carrito = new Carrito<>();

        carrito.agregarProducto(new Producto<>(12, "Remera", 24));
        carrito.agregarProducto(new Producto<>("A331", "Celular", 2000));

        carrito.mostrarProductos();
        System.out.println("Total de la compra: $" + carrito.obtenerTotal());

        // Kata 3

        System.out.println("\nKata 3");

        Pedido pedido1 = new Pedido(1, LocalDate.now());
        pedido1.agregarProducto(new Producto<>(12, "Remera", 24));
        pedido1.agregarProducto(new Producto<>("aaa", "Remera Deportiva", 29));
        pedido1.agregarProducto(new Producto<>(10, "Jean", 60));

        Pedido pedido2 = new Pedido(2, LocalDate.now());
        pedido2.agregarProducto(new Producto<>(32, "Pantalón", 34));

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        System.out.println("Pedidos oredenados por total: ");
        Collections.sort(pedidos);
        System.out.println(pedidos);

        System.out.println("Pedidos ordenados por fecha: ");
        pedidos.stream().sorted(new ComparadorPedidosPorFecha()).forEach(System.out::println);

        // kata 4

        System.out.println("\nKata 4");

        Buscador buscador = new Buscador();

        System.out.println("Buscando pedido de id 1: " + buscador.buscar(pedidos,1));
        System.out.println("Buscando pedido de id 4: " + buscador.buscar(pedidos,4));




    }
}