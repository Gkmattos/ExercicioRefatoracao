package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Bar;
import persistence.Cliente;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Bar b = new Bar();
		Cliente cl = new Cliente("Ial", "12345", 21, "M");
		b.entrada(cl);
		//System.out.println(b.publico());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JApp frame = new JApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEntradaDeClientes = new JButton("Entrada de Clientes");
		btnEntradaDeClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEntradaDeClientes.setBounds(10, 11, 159, 23);
		contentPane.add(btnEntradaDeClientes);

		JButton btnSaidaDeClientes = new JButton("Saida de Clientes");
		btnSaidaDeClientes.setBounds(10, 51, 159, 23);
		contentPane.add(btnSaidaDeClientes);

		JButton btnPublicoMasculino = new JButton("Publico Masculino");
		btnPublicoMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPublicoMasculino.setBounds(10, 106, 159, 23);
		contentPane.add(btnPublicoMasculino);

		JButton btnPublicoFeminino = new JButton("Publico Feminino");
		btnPublicoFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPublicoFeminino.setBounds(10, 145, 159, 23);
		contentPane.add(btnPublicoFeminino);

		JButton btnQuantidadeDeSocios = new JButton("Quantidade de Socios");
		btnQuantidadeDeSocios.setBounds(10, 179, 159, 23);
		contentPane.add(btnQuantidadeDeSocios);

		JButton btnQuantidadeDeNao = new JButton("Quantidade de Nao Socios");
		btnQuantidadeDeNao.setBounds(10, 213, 159, 23);
		contentPane.add(btnQuantidadeDeNao);
	}

}
