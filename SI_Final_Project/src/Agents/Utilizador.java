package Agents;

import jade.core.Agent;
//
//import java.io.IOException;
//import java.util.Calendar;
//import java.util.Random;
//
//import jade.core.AID;
//import jade.core.behaviours.CyclicBehaviour;
//import jade.core.behaviours.SimpleBehaviour;
//import jade.lang.acl.ACLMessage;

public class Utilizador extends Agent{
	private long start, end;

	@Override
	protected void setup() {
		super.setup();
		start = (Calendar.getInstance()).getTimeInMillis();
		System.out.println("Começando Utilizador");
		this.addBehaviour(new Request());
		this.addBehaviour(new Reply());
	}

	private class Reply extends CyclicBehaviour {

		@Override
		public void action() {
			ACLMessage msg = receive();
			if (msg != null) {
				if (msg.getPerformative() == ACLMessage.CONFIRM) {
					System.out.println("Bicicleta para alugar!");
					myAgent.doDelete();
				}
			} else {
				block();
			}
		}
	}

	private class Request extends SimpleBehaviour {

		@Override
		public void action() {
			Random rand = new Random();			
			User_Request userr = new User_Request();
			userr.setX_localizacao(rand.nextInt(100));
			userr.setY_localizacao(rand.nextInt(100));
			userr.setX_destino(rand.nextInt(100));
			userr.setY_destino(rand.nextInt(100));
				
			//System.out.println("Requesting taxi from (" + xOrigin + "," + yOrigin + ") to (" + xDestination + ","
			//		+ yDestination + ")");

			AID receiver = new AID();
			receiver.setLocalName("Manager");

			ACLMessage mensagem = new ACLMessage(ACLMessage.REQUEST);
			//mensagem.setContent("" + xOrigin + "," + yOrigin + "," + xDestination + "," + yDestination);
			mensagem.addReceiver(receiver);
			
			try {
				mensagem.setContentObject(costumerr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			myAgent.send(mensagem);
			// Now to get our reply!
		}

		@Override
		public boolean done() {
			return true;
		}
	}

	@Override
	protected void takeDown() {
		super.takeDown();
		System.out.println("A terminar utilizador");
		end = (Calendar.getInstance()).getTimeInMillis();
		start = end - start;
		System.out.println("Tempo de execução do utilizador:" + start);
	}

}
