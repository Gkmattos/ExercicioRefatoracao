
public class App {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ial", "01531075029", 20, "M");
		Cliente c2 = new Socio("Maria Lucia", "4676900545", 20, "F", 454);
		Cliente c3 = new Cliente("Ial", "01531075029", 20, "M");
		Cliente c4 = new Socio("Maria", "4676900545", 20, "F", 454);
		Bar b = new Bar();

		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);

		// System.out.println(b.toString());

		System.out.println("Quantidade de clientes: " + b.publico());

		b.getClientePorCPF("467690");

		b.saidaCliente("01531075029");
		System.out.println("Quantidade de clientes: " + b.publico());

	}
}
