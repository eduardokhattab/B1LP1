package br.edu.ifsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BagOfWords {
	
	HashSet<String> stopWords;
	HashMap <String, Integer> bagOfWords = new HashMap<String, Integer>();
	
	public BagOfWords(HashSet<String> stopWords) {
		
		this.stopWords = new HashSet<String>();
		
		for (String word : stopWords) {
			this.stopWords.add(word.toLowerCase());
		}
	}
	
	public void adicionarDocumento(Documento texto) {
		
		for (String word : texto.tokenizar()) {
							
				String palavra = word.toLowerCase();
				
				if (! stopWords.contains(palavra)) {
					
					if (palavra.matches(".*\\W.*"))
						palavra = palavra.replaceAll("\\W", "");						
					
					if (bagOfWords.containsKey(palavra)) {
						bagOfWords.put(palavra, (bagOfWords.get(palavra) + 1));
//						Integer valor = bagOfWords.get(palavra);
//						valor++;
//						bagOfWords.put(palavra, valor);
					}
					else {
						bagOfWords.put(palavra, 1);
					}
				}
		}
	}
	
	public HashMap<String,Integer> getBagOfWords(){
		return bagOfWords;
	}
	
}
