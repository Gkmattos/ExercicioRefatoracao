package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import persistence.*;

public class SocioTest {

	private Socio soc;

	@Before
	public void setUp() throws Exception {
		soc = new Socio("Ial Jonas", "01531075029", 27, "M", 3655);
	}

	@Test
	public void testaGetNome() {
		String nome = soc.getNome();
		assertEquals(nome, soc.getNome());
	}

	@Test
	public void testaSetNome() {
		soc.setNome("Jonas");
		String nome = soc.getNome();
		assertEquals(nome, soc.getNome());
	}

	@Test
	public void testaGetCPF() {
		String cpf = soc.getCpf();
		assertEquals(cpf, soc.getCpf());
	}

	@Test
	public void testaSetCPF() {
		soc.setCpf("12345");
		String cpf = soc.getCpf();
		assertEquals(cpf, soc.getCpf());
	}

	@Test
	public void testaGetIdade() {
		int idade = soc.getIdade();
		assertEquals(idade, soc.getIdade());
	}

	@Test
	public void testaSetIdade() {
		soc.setIdade(35);
		int idade = soc.getIdade();
		assertEquals(idade, soc.getIdade());
	}

	@Test
	public void testaGetGenero() {
		String genero = soc.getGenero();
		assertEquals(genero, soc.getGenero());
	}

	@Test
	public void testaSetGenero() {
		soc.setGenero("F");
		String genero = soc.getGenero();
		assertEquals(genero, soc.getGenero());
	}

	@Test
	public void testaGetCodSocio() {
		int cod = soc.getCodSocio();
		assertEquals(cod, soc.getCodSocio());
	}

	@Test
	public void testaSetCodSocio() {
		soc.setCodSocio(172);
		int cod = soc.getCodSocio();
		assertEquals(cod, soc.getCodSocio());
	}

	@Test
	public void testaToString() {
		String msg = soc.toString();
		assertEquals(msg, soc.toString());
	}

}
