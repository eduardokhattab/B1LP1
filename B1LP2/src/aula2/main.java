package aula2;

public class main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Eduardo", "12345678911", 'M');
		
		//Ask him how to avoid the Pessoa initialize on 
		//the cases that don't match with requirements 
		System.out.println(p1);
		
		Pessoa p2 = null;
		try{
			p2 = new Pessoa("Joao", "1432423", 'M');
		
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
