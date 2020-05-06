package Agents;

import jade.core.Agent;

public class Estacao extends Agent{
	int x_estacao, y_estacao, id_bicicleta, numero_bicicletas, numero_docas, ape;
	String id_estacao;
	
	//Criar o agente
	protected void setup() {
		System.out.println("Estação criada");
	//Informar localizacao estacao
		Estacao_Pedidos loc = new Estacao_Pedido();
		loc.setx_estacao();
		
	}
	
	
	//Informar numero bikes
	//Informar ape
	//Sugerir incentivos
	//Informar docas disponiveis
	//Remover bicicletas
}
