package br.edu.ifsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StopWords {
	
	public static HashSet<String> stopWords = new HashSet<String>();
	
	public static HashSet<String> listaStopWords(){
		
		stopWords.add("se");
		stopWords.add("a");
		stopWords.add("e");
		stopWords.add("i");
		stopWords.add("o");
		stopWords.add("u");
		stopWords.add("um");
		stopWords.add("uma");
		stopWords.add("Do");
		stopWords.add("da");
		stopWords.add("de");
		stopWords.add("que");
		stopWords.add("para");
		stopWords.add("é");
		stopWords.add("mas");
		stopWords.add("foi");
		stopWords.add("dos");
		stopWords.add("como");
		stopWords.add("ser");
		stopWords.add("há");
		stopWords.add("já");
		stopWords.add("está");
		stopWords.add("mais");
		stopWords.add("as");
		stopWords.add("os");
		stopWords.add("nos");
		stopWords.add("seu");
		stopWords.add("à");
		
		return stopWords;
	}
	
	
}
