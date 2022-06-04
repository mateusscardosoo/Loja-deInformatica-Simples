package SistemaInformatica;

/*1 - Implemente uma classe computador (4 atributos).
a) Crie a classe notebook, e a classe desktop que herda características da classe
computador;
b) Para calcular o valor do computador é necessário levar em conta se é notebook
(carregador, pasta, etc.) ou desktop (estabilizador, teclado, etc), para isso implemente
métodos que ajudem na impressão da
Nota fiscal como:
Volumes: (Notebook) 1, (Desktop) 4;
Garantia: (Notebook) 1 ano, (Desktop) 2 anos; - Caso o cliente solicitar garantia estendida
acrescentar 1 ano;
Valor: O cliente pode escolher por uma placa de vídeo (off-board) ou não, caso opte pelo
modelo 1 acrescentar, 200,00 ao valor, modelo 2 acrescentar 400,00 e modelo 3 acrescentar
600,00. (Caso o cliente solicite garantia estendida acrescentar 12% ao valor se for notebook
e 10% se for desktop);
c) Ao final da configuração, imprimir as características do produto adquirido e valor total
do computador*/
public class Computadores {
	//Atributos da maquina
	private double placaMae;
	private double hd;
	private double memoria;
	private double processador;
	private double placaVideo;
	private int garantia;
	private int volumes;
	private String configuracao;
	
	
	//Construtor vazio
	public Computadores() {
		
	}

	//Construtor com parametros
	public Computadores(double placaMae, double hd, double memoria, double processador, double placaVideo, int garantia,
			int volumes, String configuracao) {
		super();
		this.placaMae = placaMae;
		this.hd = hd;
		this.memoria = memoria;
		this.processador = processador;
		this.placaVideo = placaVideo;
		this.garantia = garantia;
		this.volumes = volumes;
		this.configuracao = configuracao;
	}

	
	//Setters e Getters
	public double getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(double placaVideo) {
		this.placaVideo = placaVideo;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	
	public double calcularPreco() {
		return 0;
	}
	
	
	public void imprime() {
		
	}
	public void imprimeGarantia() {
		
	}
	
	
	
	
	

}
