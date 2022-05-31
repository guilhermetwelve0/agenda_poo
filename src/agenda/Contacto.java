package agenda;

//// Adicionar contato
////   Listar contatos
////  encontrar contato
////      verificar se há um contato
////       excluir contato
////       contatos disponíveis
////   Agenda completa
////          Sair

public class Contacto {

	// Creamos los atributos del contacto
	private String nombre;
	private int telefono;
	private int cpf;
	private String endereco;
	private int idade;

	public Contacto(String nombre, int telefono, int cpf, String endereco, int idade) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = 0;
		this.cpf = 0;
		this.idade = 0;
		this.endereco = endereco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public boolean equals(Contacto contacto) {
		if (nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nNome : " + nombre + "\nTelefone : " + telefono + "\nCpf : " + cpf + "\nEndereco : " + endereco
				+ "\nIdade : " + idade;
	}

}