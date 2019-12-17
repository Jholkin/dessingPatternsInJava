package Bridge;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<>();
		
		productos.add(new Producto("M001", 120));
		productos.add(new Producto("M002", 450));
		productos.add(new Producto("B001", 180));
		productos.add(new Producto("C001", 530));
		productos.add(new Producto("C002", 420));
		
		Abstraccion abs = new Abstraccion(2, productos);
		
		abs.listarProductos();
		abs.calcularCostoTotal();
	}
}
