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

	
}