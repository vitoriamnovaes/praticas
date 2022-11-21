package pratica03;

import javax.swing.JOptionPane;

public class MainGit {
	public static void main(String[] args) {
		
		Double[] vet = new Double[3];
		
		for (int i = 0; i < vet.length; i++) {
			
			String num = JOptionPane.showInputDialog("Leia");
			
			Double num2 = Double.valueOf(num);
			 
			vet[i] = num2;
			
		}
		
		Double[] mulVet = multiVetor(vet);
		}
	
	private static Double [] multiVetor(Double[] vet ) {
		
		Double [] nVetor = new Double[vet.length];
		
		for (int i = 0; i< nVetor.length; i++) {
			nVetor[i] = vet[i] * vet[i];
			
		} return nVetor;
		}
	}


