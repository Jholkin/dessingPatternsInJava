package Bridge;

import java.util.List;

public class Abstraccion {
	private Bridge implementacion;
	private List<Producto> productos;
	
	public Abstraccion(int tipo, List<Producto> productos) {
		if (tipo == 1) {
			this.implementacion = new Implementation1();
		}
		if (tipo == 2) {
			this.implementacion = new Implementation2();
		}
		
		this.productos = productos;
	}
	
	public void listarProductos() {
		this.implementacion.listarProductos(this.productos);
	}
	
	public void calcularCostoTotal() {
		this.implementacion.calcularCostoTotal(this.productos);
	}
}
