package Bridge;

import java.util.List;

public class Implementation2 implements Bridge {

	public void listarProductos(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}
	
	public void calcularCostoTotal(List<Producto> productos) {
		int total = 0;
		int totalm = 0;
		int totalb = 0;
		int totalc = 0;
		int cantidad = 0;
		
		for (Producto producto : productos) {
			if (producto.getNombre().charAt(0) == 'M') {
				totalm += producto.getCosto();
			}
			if (producto.getNombre().charAt(0) == 'B') {
				totalb += producto.getCosto();
			}
			if (producto.getNombre().charAt(0) == 'C') {
				totalc += producto.getCosto();
			}
			total += producto.getCosto();
			cantidad++;
		}
		
		System.out.println("\nCosto total del producto con inicial M es: "+totalm);
		System.out.println("\nCosto total del producto con inicial B es: "+totalb);
		System.out.println("\nCosto total del producto con inicial C es: "+totalc);
		System.out.println("\nCosto total de "+cantidad+" productos es: "+total);
	}
}
