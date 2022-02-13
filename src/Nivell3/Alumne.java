package Nivell3;

public class Alumne {

	
		private String nom;
		private int edat;
		private String curso;
		private double nota;
	
		
		public Alumne() {
			
		}


		public Alumne(String nom, int edat, String curso, double nota) {
			
			this.nom = nom;
			this.edat = edat;
			this.curso = curso;
			this.nota = nota;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public int getEdat() {
			return edat;
		}


		public void setEdat(int edat) {
			this.edat = edat;
		}


		public String getCurso() {
			return curso;
		}


		public void setCurso(String curso) {
			this.curso = curso;
		}


		public double getNota() {
			return nota;
		}


		public void setNota(double nota) {
			this.nota = nota;
		}


		@Override
		public String toString() {
			return "Alumne [nom=" + nom + ", edat=" + edat + ", curso=" + curso + ", nota=" + nota + "]";
		}
		
		
		
}
