package br.edu.ifsp;

import java.util.ArrayList;
import java.util.regex.*;

public class Documento {
	
	private String texto;

	public Documento (String texto){
		this.texto = texto;
	}

	public String getTexto(){
		return this.texto;
	}

	public void setTexto(String texto){
		this.texto = texto;
	}
	
	public ArrayList<String> tokenizar() {
		
		ArrayList<String> bagOfWords = new ArrayList<String>();
		
		for(String palavra : texto.split(" ")) {
			bagOfWords.add(palavra);
		}
		
		return bagOfWords;
	}

}
