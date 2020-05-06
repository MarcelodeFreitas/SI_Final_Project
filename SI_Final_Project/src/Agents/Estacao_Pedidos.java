package Agents;

import jade.core.Agent;

class Estacao_Pedidos implements java.io.Serializable {

	private int x_estacao;
	private int y_estacao;
	private int numero_bicicletas;
	private int numero_docas;
	

	public int getx_estacao() {
		return x_estacao;
	}

	public int gety_estacao() {
		return y_estacao;
	}
	
	public int getnumero_bicicletas() {
		return numero_bicicletas;
	}

	public int getnumero_docas() {
		return numero_docas;
	}
	
	public void sety_estacao(int y_estacao){
		this.y_estacao = y_estacao;
	}
	
	public void setnumero_bicicletas(int numero_bicicletas){
		this.numero_bicicletas = numero_bicicletas;
	}
	
	public void setnumero_docas(int numero_docas){
		this.numero_docas = numero_docas;
	}

	
}