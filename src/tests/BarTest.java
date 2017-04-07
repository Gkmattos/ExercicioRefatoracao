package tests;

import business.*;
import persistence.Cliente;
import persistence.Socio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BarTest {
	private Bar b;

	@Before
	public void setUp() throws Exception {
		b = new Bar();
		Cliente c1 = new Cliente("Ial Jonas", "01531075029", 20, "M");
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 20, "f");
		Cliente c3 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c4 = new Cliente("Maria", "4676900545", 20, "m");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
	}

	@Test
	public void testaSaidaCliente() {
		b.saidaCliente("01531075029");
		assertEquals(3, b.publico());
	}

	@Test
	public void testaPublico() {
		Cliente c5 = new Cliente("Ial Jonas", "01531075029", 20, "M");
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "f");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "m");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(8, b.publico());
	}

	@Test
	public void testaSaidaClienteInvalido() {
		assertEquals(false, b.saidaCliente("123"));
	}

	@Test
	public void testaBuscaCliente() {
		Cliente cb = b.getClientePorCPF("01531075029");
		assertEquals(cb, b.getClientePorCPF("01531075029"));
	}

	@Test
	public void testaBuscaClienteInválido() {
		assertEquals(null, b.getClientePorCPF("54"));
	}

	@Test
	public void testaQuantidadeDeHomens() {
		Cliente c5 = new Cliente("Ial Jonas", "01531075029", 20, "M");
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "M");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "M");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "m");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(6, b.publicoMasculino());
	}

	@Test
	public void testaQuantidadeDeMulheres() {
		Cliente c5 = new Cliente("Ial Jonas", "01531075029", 20, "F");
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "F");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(6, b.publicoFeminino());
	}

	@Test
	public void testaPublicSocio() {
		Cliente c5 = new Socio("Ial Jonas", "01531075029", 20, "F", 212);
		Cliente c6 = new Socio("Maria Lucia", "4676900545", 20, "F", 545);
		Cliente c7 = new Socio("Ial", "01531075029", 20, "F", 365);
		Cliente c8 = new Socio("Maria", "4676900545", 20, "F", 3232);
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(4, b.publicoSocio());
	}

	@Test
	public void testaPublicoNaoSocio() {
		Cliente c5 = new Socio("Ial Jonas", "01531075029", 20, "F", 232);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "F");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(7, b.publicoNormal());
	}

	@Test
	public void testaPercentualDeMulheres() {
		Cliente c5 = new Socio("Ial Jonas", "01531075029", 20, "F", 232);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "F");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(75, b.percentMulheres());
	}

	@Test
	public void testaPercentualDeHomens() {
		Cliente c5 = new Socio("Ial Jonas", "01531075029", 20, "F", 232);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "F");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(25, b.percentHomens());
	}

	@Test
	public void testaPercentualDeSocios() {
		Cliente c5 = new Socio("Ial Jonas", "01531075029", 20, "F", 232);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "F");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(13, b.percentSocios());
	}

	@Test
	public void testaPercentualDeNaoSocios() {
		Cliente c5 = new Socio("Ial Jonas", "01531075029", 20, "F", 232);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 20, "F");
		Cliente c7 = new Cliente("Ial", "01531075029", 20, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(88, b.percentNaoSocios());
	}
	
	@Test
	public void testaToString(){
		String msg=b.toString();
		assertEquals(msg, b.toString());
	}
	
}
