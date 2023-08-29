
public class Sapo extends Animal {
	
	public String pula;
	public boolean veneno;
	public String nome;
	
	public String pula () {
		return "Pulei rebit";
	}
	
	public String veneno() {
		if(!this.veneno){
			return "Perigoso";
		}
		return "Inofensivo";
	}
	public String nome() {
		return "Sapo";
	}

	public String getPula() {
		return pula;
	}

	public void setPula(String pula) {
		this.pula = pula;
	}

	public boolean isVeneno() {
		return veneno;
	}

	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sapo(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
	}

}
