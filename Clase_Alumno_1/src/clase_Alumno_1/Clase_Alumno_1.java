package clase_Alumno_1;
import java.util.Scanner;
public class Clase_Alumno_1 {
	public static void main(String args[]) {
		Scanner e = new Scanner(System.in);
		int numero = 0,nota1 = 0, nota2 = 0;
		String nombre = null;
		Alumno a1 = new Alumno(1,"Abelardo",8,2);
		Alumno a2 = new Alumno();
		Alumno a3 = new Alumno();
		Alumno a4 = new Alumno();
		System.out.println("Alumno 1:");
		a1.visualizarDatos();
		System.out.print("Número de alumno 2? ");
		numero = e.nextInt();
		e.nextLine();
		System.out.print("Nombre del alumno 2? ");
		nombre = e.nextLine();
		System.out.print("Nota 1 del alumno 2? ");
		nota1 = e.nextInt();
		System.out.print("Nota 2 del alumno 2? ");
		nota2 = e.nextInt();
		a2 = new Alumno(numero,nombre,nota1,nota2);
		System.out.println("Alumno 2:");
		a2.visualizarDatos();
		System.out.print("Número de alumno 3? ");
		numero = e.nextInt();
		a3.setNumero(numero);
		e.nextLine();
		System.out.print("Nombre del alumno 3? ");
		nombre = e.nextLine();
		a3.setNombre(nombre);
		System.out.print("Nota 1 del alumno 3? ");
		nota1 = e.nextInt();
		a3.setNota1(nota1);
		System.out.print("Nota 2 del alumno 3? ");
		nota2 = e.nextInt();
		a3.setNota2(nota2);
		System.out.println("Alumno 3:");
		a3.visualizarDatos();
		System.out.print("Número de alumno 4? ");
		a4.setNumero(e.nextInt());
		e.nextLine();
		System.out.print("Nombre del alumno 4? ");
		a4.setNombre(e.nextLine());
		System.out.print("Nota 1 del alumno 4? ");
		a4.setNota1(e.nextInt());
		System.out.print("Nota 2 del alumno 4? ");
		a4.setNota2(e.nextInt());
		System.out.println("Alumno 4:");
		a4.visualizarDatos();
		a2 = a1;
		e.nextLine();
		System.out.println("Datos de a1:");
		a1.visualizarDatos();
		System.out.println("Datos de a2:");
		a2.visualizarDatos();
		System.out.println("Nombre? ");
		a2.setNombre(e.nextLine());
		System.out.println("Datos de a1:");
		a1.visualizarDatos();
		System.out.println("Datos de a2:");
		a2.visualizarDatos();
		e.close();
	}
}