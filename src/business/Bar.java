package business;

import java.util.ArrayList;

import persistence.*;

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

	public int publicoMasculino() {
		int numHomens = 0;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getGenero().equalsIgnoreCase("M")) {
				numHomens++;
			}
		}
		return numHomens;
	}

	public int publicoFeminino() {
		int numMulheres = 0;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getGenero().equalsIgnoreCase("F")) {
				numMulheres++;
			}
		}
		return numMulheres;
	}

	public int publicoSocio() {
		int numSocios = 0;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i) instanceof Socio) {
				numSocios++;
			}
		}
		return numSocios;
	}

	public int publicoNormal() {
		int numNormal = 0;
		numNormal = clientes.size() - publicoSocio();
		return numNormal;
	}

	public int percentMulheres() {
		int pmulheres = Math.round(((float) publicoFeminino() / (float) publico()) * 100);
		return pmulheres;
	}

	public int percentHomens() {
		int phomens = Math.round(((float) publicoMasculino() / (float) publico()) * 100);
		return phomens;
	}

	public int percentSocios() {
		int pSocios = Math.round(((float) publicoSocio() / (float) publico()) * 100);
		return pSocios;
	}

	public int percentNaoSocios() {
		int pNaoSocios = Math.round(((float) publicoNormal() / (float) publico()) * 100);
		return pNaoSocios;
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
