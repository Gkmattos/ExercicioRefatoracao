import java.util.ArrayList;

public class Bar {
	private ArrayList<Cliente> clientes;

	public Bar() {
		clientes = new ArrayList<>();
	}

	public boolean entrada(Cliente cl) {
		return clientes.add(cl);
	}

	public boolean saidaCliente(String cpf) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpf)) {
				clientes.remove(i);
				return true;
			}
		}
		return false;

	}

	public Cliente getClientePorCPF(String cpf) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cpf)) {
				return clientes.get(i);
			}
		}
		return null;
	}

	public int publico() {
		return clientes.size();
	}

	@Override
	public String toString() {
		String saida = "";
		for (int i = 0; i < clientes.size(); i++) {
			saida = clientes.toString() + "\n";
		}

		return "Bar:" + saida;
	}

}
