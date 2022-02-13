package Nivell3;

import java.util.ArrayList;
import java.util.List;

public class GestionAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public Alumne(String nom, int edat, String curso, double nota)
		List<Alumne> listado = new ArrayList<>();
		listado.add( new Alumne("ZAlumne1", 12, "Java",0.9));
		listado.add( new Alumne("AAlumne2", 13, "Java",1.9));
		listado.add( new Alumne("BAlumne3", 24, "Java",2.9));
		listado.add( new Alumne("RAlumne4", 25, "Java",3.9));
		listado.add( new Alumne("Alumne5", 26, "Java",4.9));
		listado.add( new Alumne("DAlumne6", 27, "Matematicas",5.9));
		listado.add( new Alumne("FAlumne7", 28, "Linux",6.9));
		listado.add( new Alumne("FAlumne8", 29, "PHP",7.9));
		listado.add( new Alumne("Alumne9", 30, "PHP",8.9));
		listado.add( new Alumne("XAlumne10", 6, "Java",9.9));
		
		System.out.println("\nNombre y edad de cada alumno");
		listado.stream().forEach(alumno -> System.out.println(alumno.getNom()+" "+alumno.getEdat()));
		
		System.out.println("\nNombre y edad de cada alumno que el nombre empieza por A");
		listado.stream().filter(alumno -> alumno.getNom().charAt(0)=='A').forEach(alumno -> System.out.println(alumno.getNom()+" "+alumno.getEdat()));
		
		System.out.println("\nNombre cada alumno cuya nota es mayor que 5");
		listado.stream().filter(alumno -> alumno.getNota() >= 5).forEach(alumno -> System.out.println(alumno.getNom()+" "+alumno.getCurso()+" "+alumno.getNota()));
		
		System.out.println("\nNombre cada alumno cuya nota es mayor que 5 y no sean de PHP");
		listado.stream().filter(alumno -> alumno.getNota() >= 5 && alumno.getCurso() != "PHP").forEach(alumno -> System.out.println(alumno.getNom()+" "+alumno.getCurso()+" "+alumno.getNota()));
		
		System.out.println("\nNombre cada alumno mayor de edad que hagan Java");
		listado.stream().filter(alumno -> alumno.getEdat() >= 18 && alumno.getCurso() == "Java").forEach(alumno -> System.out.println(alumno.getNom()+" "+alumno.getCurso()+" "+alumno.getEdat()));
		
	}

}
