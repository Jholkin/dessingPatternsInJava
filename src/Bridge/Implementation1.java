package Bridge;

import java.util.List;

public class Implementation1 implements Bridge {
	
	public void listarProductos(List<Producto> productos) {
		for (Object producto : productos) {
			System.out.println(producto.toString());
		}
	}
	
	public void calcularCostoTotal(List<Producto> productos) {
		int total = 0;
		int cantidad = 0;
		
		for (Producto producto : productos) {
			total += producto.getCosto();
			cantidad++;
		}
		
		System.out.println("\nCosto total de "+cantidad+" productos es: "+total);
	}
}
