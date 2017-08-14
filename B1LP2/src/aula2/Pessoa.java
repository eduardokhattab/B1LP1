package aula2;

public class Pessoa {
	private String nome;
	private String cpf;
	private char sexo;
	
	public Pessoa (String nome, String cpf, char sexo) {
		if (checkCpf(cpf) && checkSexo(sexo)) {
			this.nome = nome;
			this.cpf = cpf;
			this.sexo = sexo;
		}
		else
			System.out.println("Please, check your input\n");
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		if (checkCpf(cpf))
			this.cpf = cpf;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setSexo(char sexo) {
		if (checkSexo(sexo))
			this.sexo = sexo;
	}
	
	public char getSexo() {
		return this.sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + sexo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		//If they are equals: the obj isn't null and they belong to the same Class
		if (getClass() != null && obj != null && getClass() == obj.getClass()) {
			Pessoa other = (Pessoa) obj;
			
			//Check if all the atributes are the same;
			result = this.nome == other.getNome() && 
					this.cpf == other.getCpf() && 
					this.sexo == other.getSexo();
		}
		return result;
	}
	
	public static boolean checkCpf(String cpf) {
		if (cpf.length() == 11 && Number.isNumeric(cpf))
			return true;
		else
			return false;
	}
	
	public static boolean checkSexo(char sexo) {
		if (sexo == 'M' || sexo == 'F')
			return true;
		else
			return false;
	}
	
	public static class Number {
		public static boolean isNumeric(String s) {
			
			boolean result = true;
			
			char[] tmp = s.toCharArray();
				
			for (int i = 0; i < s.length(); i++) {
				if (tmp[0] == '0') {
					result = false;
					break;
				}
				switch(tmp[i]) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					break;
				default:
					result = false;
					break;
				}
			}
			
			return result;
		}
	}
}