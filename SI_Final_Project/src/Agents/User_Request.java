package src.Agents;

import java.io.Serializable;

public class User_Request implements Serializable{
	private int x_localizacao;
	private int x_destino;
	private int y_localizacao;
	private int y_destino;
	
	public int getX_localizacao(){
		return x_localizacao;
	}
	
	public int getX_destino(){
		return x_destino;
	}
	
	public int getY_localizacao(){
		return y_localizacao;
	}
	
	public int getY_destino(){
		return y_destino;
	}
	
	public void setX_localizacao(int x_localizacao){
		this.x_localizacao = x_localizacao;
	}
	
	public void setX_destino(int x_destino){
		this.x_destino = x_destino;
	}
	
	public void setY_localizacao(int y_localizacao){
		this.y_localizacao = y_localizacao;
	}
	
	public void setY_destino(int Y_destino){
		this.y_destino = y_destino;
	}
}
