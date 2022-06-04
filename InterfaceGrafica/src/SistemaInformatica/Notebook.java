package SistemaInformatica;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Notebook extends Computadores {
	private double carregador;
	private double pasta;
	DecimalFormat DF = new DecimalFormat("0.00");
	
	//Construtor vazio
	public Notebook() {
	
	}
	//Construtor 
	public Notebook(double placaMae, double hd, double memoria, double processador, double placaVideo, int garantia,double carregador, double pasta,
			int volumes, String configuracao) {
		super(placaMae, hd, memoria, processador, placaVideo, garantia, volumes, configuracao);
		this.carregador = carregador;
		this.pasta = pasta;
		
	}
	
	//Setters e Getters 
	public double getCarregador() {
		return carregador;
	}
	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}
	public double getPasta() {
		return pasta;
	}
	public void setPasta(double pasta) {
		this.pasta = pasta;
	}
	

	public double calculaPreco() {
		return this.getPlacaMae() + this.getHd() + this.getMemoria() + this.getProcessador() + this.getPlacaVideo() + this.getCarregador() + this.getPasta();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "DADOS DO NOTEBOOK ESCOLHIDO\n\n"
				+ this.getConfiguracao()+ "\nVALOR TOTAL: "+ DF.format(calculaPreco())+ "R$");
	}
	
	public void imprimeGarantia() {
		JOptionPane.showMessageDialog(null, "DADOS DO NOTEBOOK ESCOLHIDO\n\n"
				+ this.getConfiguracao()+ "\nVALOR TOTAL: "+ DF.format(calculaPreco()* 1.12)+ "R$");
	}
}
	
	

