package Nivell1_fase1;

import java.util.ArrayList;
import java.util.List;

public class GestionMetodosLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomsPropis = new ArrayList<>();
		nomsPropis.add("Mario");
		nomsPropis.add("Marta");
		nomsPropis.add("Juan");
		nomsPropis.add("Antonio");
		nomsPropis.add("Luis");
		nomsPropis.add("Ana");
		nomsPropis.add("Alberto");
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(25);
		numeros.add(36);
		numeros.add(1);
		numeros.add(2);
		
		List<String> meses = new ArrayList<>();
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");
		
		
		//Apartado 1
		System.out.println("\n **** Listar nombres que empiezan por A y tienen 3 letras");
		nomsPropis.stream().filter(c -> c.charAt(0) == 'A' && c.length() == 3).forEach(c -> System.out.println(c)); 
		//Apartado 2
		System.out.println("\n **** Lista de numeros pares e=pares  o=impares");
		numeros.stream().filter(c -> c.intValue()%2 ==0).forEach(c -> System.out.println("e"+c));
		numeros.stream().filter(c -> c.intValue()%2 !=0).forEach(c -> System.out.println("e"+c));
		//Apartado 3
		System.out.println("\n **** Crear lista nombres que contienen una 'o' y mostar lista****");
		List<String> nomsConLetra_o = new ArrayList<>();
		nomsPropis.stream().filter(c -> c.contains("o")).forEach(c -> nomsConLetra_o.add(c));
		nomsConLetra_o.stream().forEach(c -> System.out.println(c));
		//Apartado 4
		System.out.println("\n **** Crear lista nombres que contienen una 'o', tengan mas de 5 letras y mostar lista****");
		List<String> nomsConLetra_o_mas5 = new ArrayList<>();
		nomsPropis.stream().filter(c -> c.contains("o") && c.length() > 5).forEach(c -> nomsConLetra_o_mas5.add(c));
		nomsConLetra_o_mas5.stream().forEach(c -> System.out.println(c));
		//Apartado 5
		System.out.println("\n **** Crear lista con los meses del año y mostar todos los elementos ****");
		meses.stream().forEach(a ->System.out.println(a));
		//Apartado 6
		System.out.println("\n **** Crear lista con los meses del año y mostar todos los elementos con method reference ****");
		meses.forEach(System.out::println);
	}	
}


















































		/*
		System.out.println("\n **** Listar nombres ****");
		nomsPropis.stream().forEach(a ->System.out.println(a));
		//Otra forma
		System.out.println("\n **** Listar nombres ****");
		nomsPropis.stream().filter(a -> true).forEach(a -> System.out.println(a));
		
		System.out.println("\n **** Listar nombres que empiezan por M ****");
		nomsPropis.stream().filter(c -> c.charAt(0) == 'M').forEach(c -> System.out.println(c)); 
		
		System.out.println("\n **** Numero de nombres de la lista ****");
		System.out.println(nomsPropis.stream().count());
		
		System.out.println("\n **** Nombres que primera letra una M  o segunda una o ****");
		nomsPropis.stream().filter(j -> j.charAt(0) == 'M' || j.charAt(1) == 'u').forEach(j -> System.out.println(j)); 
		
		System.out.println("\n *** imprimir los 2 primeros elementos de la lsita con el metodo limit(numero_elementos)");
		nomsPropis.stream().limit(2).forEach(a -> System.out.println(a));
		
*/		
		
		
		
		

