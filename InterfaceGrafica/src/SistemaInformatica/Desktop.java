package SistemaInformatica;

import javax.swing.JOptionPane;

public class Desktop extends Computadores {
	private double estabilizador;
	private double teclado;
	
	//Construtor vazio
	public Desktop() {
		
		
	}
	//Construtor vazio
	public Desktop(double placaMae, double hd, double memoria, double processador, double placaVideo, int garantia,double estabilizador, double teclado,
			int volumes, String configuracao) {
		super(placaMae, hd, memoria, processador, placaVideo, garantia, volumes, configuracao);
		this.estabilizador = estabilizador;
		this.teclado = teclado;
		
	}
	
	//Getters e Setters
	public double getEstabilizador() {
		return estabilizador;
	}
	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}
	public double getTeclado() {
		return teclado;
	}
	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}
	
	//Métodos 
	public double calculaPreco() {
		return this.getPlacaMae()+ this.getHd() + this.getMemoria() + this.getProcessador() + this.getPlacaVideo()+ this.getEstabilizador() + this.getTeclado();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "DADOS DO DESKTOP ESCOLHIDO\n\n"
				+ this.getConfiguracao()+ "\nVALOR TOTAL: "+ calculaPreco()+ "R$");
	}
	
	public void imprimeGarantia() {
		JOptionPane.showMessageDialog(null, "DADOS DO DESKTOP ESCOLHIDO\n\n"
				+ this.getConfiguracao()+ "\nVALOR TOTAL: "+ (calculaPreco()* 1.10)+ "R$");
	}
		
	
	
	
	

}
