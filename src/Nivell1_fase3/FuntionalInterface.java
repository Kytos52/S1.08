package Nivell1_fase3;

public class FuntionalInterface {

	@FunctionalInterface
	public interface Operacion{
		public String reverse(String texto);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacion op = (texto) -> { //lambda 
			String respuesta="";
			for(int i = texto.length()-1; i>=0; i--) {
				respuesta += texto.charAt(i);
			}return respuesta;
		};
		System.out.println(op.reverse("hola"));
	}
	
	

}
