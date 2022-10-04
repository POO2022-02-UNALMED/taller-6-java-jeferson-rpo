package vehiculos;

public class Vehiculo {
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,String traccion, Fabricante fabricante) {
		cantidadVehiculos++;
	}
	protected static int cantidadAutomoviles;
	protected static int cantidadCamionetas;
	protected static int cantidadCamiones;
	protected static int cantidadVehiculos;
	
	private int puertas;
	private int velocidadMaxima;
	private int precio;
	private int peso;
	
	private String nombre;
	private String placa;
	private String traccion;
	
	private Fabricante fabricante;
	
	
	public static String vehiculosPorTipo() {
		return ("Automoviles: "+cantidadAutomoviles+"\nCamionetas: "+cantidadCamionetas+"\nCamiones: "+cantidadCamiones);
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String plaquita) {
		this.placa=plaquita;
	}
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puerta1) {
		this.puertas=puerta1;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima( int velox) {
		this.velocidadMaxima=velox;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int pesitos) {
		this.precio=pesitos;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int usd) {
		this.peso=usd;
	}
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String tr) {
		this.traccion=tr;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante señor) {
		this.fabricante=señor;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	static public void setCantidadVehiculos(int cd) {
		Vehiculo.cantidadVehiculos=cd;
	}	
}
