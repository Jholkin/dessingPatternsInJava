package Bridge;

public class Producto {
	private int costo;
	private String nombre;
	
	public Producto(String nombre, int costo) {
		this.setNombre(nombre);
		this.setCosto(costo);
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [costo=" + costo + ", nombre=" + nombre + "]";
	}
	
}
