package uinterface;
import business.Bar;
import persistence.Cliente;
import persistence.Socio;

public class App {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ial Jonas", "01531075029", 20, "M");
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 20, "f");
		Cliente c3 = new Socio("Ial", "01531075029", 20, "F", 123);
		Cliente c4 = new Socio("Jonas", "01531075029", 20, "F", 1543);
		Cliente c5 = new Cliente("Lucia", "4676900545", 20, "m");
		Cliente c6 = new Cliente("Jonas Ial", "4676900545", 20, "m");
		Cliente c7 = new Socio("Lucia Maria", "01531075029", 20, "F", 989);
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "m");
		Bar b = new Bar();

		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);

		System.out.println("Quantidade de clientes: " + b.publico());

		b.getClientePorCPF("467690");

		System.out.println("Quantidade de clientes: " + b.publico());
		System.out.println(b.publicoFeminino());
		System.out.println(b.publicoSocio());
		System.out.println(b.publicoNormal());
		System.out.println("***********************");
		System.out.println(b.percentHomens());
		System.out.println(b.percentMulheres());
		System.out.println(b.percentNaoSocios());
		System.out.println(b.percentSocios());
		
		System.out.println("***************************************");
		
		System.out.println(b.toString());
		

	}
}
