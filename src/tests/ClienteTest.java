package tests;

import business.*;
import persistence.Cliente;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	private Cliente cl;

	@Before
	public void setUp() throws Exception {
		cl = new Cliente("Ial Jonas", "01531075029", 27, "M");
	}

	@Test
	public void testaSaidaCliente() {
		String nome = cl.getNome();
		assertEquals(nome, cl.getNome());
	}

}
