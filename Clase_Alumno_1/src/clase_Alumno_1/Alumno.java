package clase_Alumno_1;

public class Alumno {
	private int numero;
	private String nombre;
	private int nota1;
	private int nota2;
	Alumno(){};
	Alumno(int numero,String nombre,int nota1, int nota2){
		this.numero = numero;
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	int getNota1() {
		return this.nota1;
	}
	void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	int getNota2() {
		return this.nota2;
	}
	void visualizarDatos() {
		System.out.println("Número.....: "+numero);
		System.out.println("Nombre.....: "+nombre);
		System.out.println("Nota 1.....: "+nota1);
		System.out.println("Nota 2.....: "+nota2);
		System.out.print("Apto.......: ");
		if (apto())
			System.out.println("Apto");
		else
			System.out.println("No apto");
	}
	double media() {
		return (nota1+nota2)/2;
	}
	boolean apto() {
		boolean a = true;
		if (this.nota1 < 5 || this.nota2 < 5)
			a = false;
		return a;
	}
}
