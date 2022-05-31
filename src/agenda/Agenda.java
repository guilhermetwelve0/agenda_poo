package agenda;

public class Agenda {

	private Contacto contactos[];

	public Agenda() {
		contactos = new Contacto[15];
	}

	public Agenda(int tamanho) {
		contactos = new Contacto[tamanho];
	}

	public void adirContacto(Contacto contacto) {
		if (comprobarSiExisteContacto(contacto)) {
			System.out.println("\nJa existe um contato com esse nome , por favor digite outro nome");
		} else if (comprobarSiLaAgendaEstaLlena()) {
			System.out.println("\na agenda esta vazia");
		} else {
			boolean registrado = false;
			for (int i = 0; i < contactos.length && !registrado; i++) {
				if (contactos[i] == null) {
					contactos[i] = contacto;
					registrado = true;
				}
			}

			if (registrado == true) {
				System.out.println("\nO contato foi registrado com exito !!");
			} else {
				System.out.println("\nNao pode registrar o contato");
			}
		}
	}

	public boolean comprobarSiExisteContacto(Contacto contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].equals(contacto)) {
				return true;
			}
		}
		return false;
	}

	public boolean comprobarSiLaAgendaEstaLlena() {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				return false;
			}
		}
		return true;
	}

	public void listarContactos() {
		if (comprobarSiHayHuecosLibres() == contactos.length) {
			System.out.println("\nNao ha contatos para listar");
		} else {
			for (int i = 0; i < contactos.length; i++) {

				System.out.println("Nome : " + contactos[i].getNombre());
				System.out.println("Telefone : " + contactos[i].getTelefono());
				System.out.println("Cpf : " + contactos[i].getCpf());
				System.out.println("Endereco : " + contactos[i].getEndereco());
				System.out.println("Idade : " + contactos[i].getIdade());
				System.out.println("YTESTE --- >: " + contactos.length);

			}
		}
	}

	public int comprobarSiHayHuecosLibres() {
		int contadorVacios = 0;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contadorVacios++;
			}
		}
		return contadorVacios;
	}

	public void buscarContacto(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				System.out.println("\nContato encontrado , seu telefono e : " + contactos[i].getTelefono()
						+ "\nSeu endereco : " + contactos[i].getEndereco() + "\nSua idade : " + contactos[i].getIdade()
						+ "\nSeu nome : " + contactos[i].getNombre());
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("\nNao foi encontrado seu contato");
		}
	}

	public void eliminarContacto(Contacto contacto) {
		boolean eliminado = false;
		for (int i = 0; i < contactos.length && !eliminado; i++) {
			if (contactos[i] != null && contactos[i].equals(contacto)) {
				contactos[i] = null;
				eliminado = true;
				System.out.println("\nContato elimidado com sucesso!");
			}
		}

		if (eliminado == true) {
			System.out.println("\nO contato foi eliminado");
		} else {
			System.out.println("\nO contato nao foi eliminado");
		}
	}
}