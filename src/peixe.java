
public class peixe extends Animal{
	
	private String nome;
	private String porte;
	private boolean veneno;
	private String especie;
	private String alimentacao;
	
	public String pular() {
		return"O peixe saltou da agua";
	}
	public String bolhas() {
		return"Glub glub";
	}
	public String mortalidade() {
		if(!this.veneno) {
			return "Perigoso...";
		}
		return "Peixe inofensivo";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public boolean isVeneno() {
		return veneno;
	}
	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public peixe(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
	}
}
