package br.edu.ifsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Documento teste = new Documento("No. ,.,N,o, meio do ca;;.!minho tinha uma pedra tinha uma uma pedra é é No meio do caminho");
    	Documento teste2 = new Documento("ola marilene");
    	Documento teste3 = new Documento("ola marilene no. no.");
    	
    	
    	HashSet<String> stopWords = StopWords.listaStopWords();
    	
    	
    	BagOfWords bag = new BagOfWords(stopWords);
    	bag.adicionarDocumento(teste);
    	bag.adicionarDocumento(teste2);
    	bag.adicionarDocumento(teste3);
    	   	
    	
    	System.out.println(bag.getBagOfWords());
		
    	
    	
    	
    	
    }
}
