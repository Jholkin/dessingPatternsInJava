package Bridge;

import java.util.List;

public interface Bridge {
	
	public void listarProductos(List<Producto> products);
	public void calcularCostoTotal(List<Producto> products);
}
