package modelo;

public class Calculadora {
	//no agregue atributos a la clase por que que nos los vi necesarios ya que la clase no tiene la necesidad de guardarlos
	public Calculadora() {}
	
	public void suma(int numero1, int numero2) {//así que directamente paso los valores al método en vez de agregarlos como atributos a la clase 
		int resultado = numero1 + numero2; //se suman los dos números pasados por parámetros y se guardan el la variable "resultado" 
		System.out.println("El resultado de la suma es: "+ resultado); //se muestra el valor de resultado como pide la actividad
	}
}
