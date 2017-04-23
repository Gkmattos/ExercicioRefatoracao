package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JUIMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUIMain frame = new JUIMain();
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
	public JUIMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntradaDeClientes = new JButton("Entrada de Clientes");
		btnEntradaDeClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JUIEntradaDeClientes eu=new JUIEntradaDeClientes();
				eu.setVisible(true);
			}
		});
		btnEntradaDeClientes.setBounds(38, 28, 166, 23);
		contentPane.add(btnEntradaDeClientes);
		
		JButton btnNewButton = new JButton("Saída de Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(38, 87, 166, 23);
		contentPane.add(btnNewButton);
		
		JButton btnInformaes = new JButton("Informa\u00E7\u00F5es");
		btnInformaes.setBounds(214, 87, 166, 23);
		contentPane.add(btnInformaes);
		
		JButton btnEntradaDeScios = new JButton("Entrada de S\u00F3cios");
		btnEntradaDeScios.setBounds(214, 28, 166, 23);
		contentPane.add(btnEntradaDeScios);
	}
}
