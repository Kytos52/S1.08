package Nivell1_fase2;

public class Interface_fase2 {

	@FunctionalInterface
	public interface Operacion{
		public double getPiValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacion op = () -> { //lambda 
			double pi=3.1415;
			return pi;
		};
		System.out.println(op.getPiValue());
	}

}
