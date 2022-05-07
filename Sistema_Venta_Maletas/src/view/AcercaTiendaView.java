package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class AcercaTiendaView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblAutores;
	private JLabel lblGianinaMuoz;
	private JLabel lblTienda;
	private JSeparator separator;
	private JButton btnCerrar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaTiendaView frame = new AcercaTiendaView();
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
	public AcercaTiendaView() {
		setTitle("Acerca de Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTienda.setBounds(177, 11, 132, 31);
		contentPane.add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(10, 44, 466, 2);
		contentPane.add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAutores.setBounds(208, 57, 70, 22);
		contentPane.add(lblAutores);
		
		lblGianinaMuoz = new JLabel("Gianina Mu\u00F1oz");
		lblGianinaMuoz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGianinaMuoz.setBounds(191, 89, 104, 20);
		contentPane.add(lblGianinaMuoz);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(198, 253, 89, 23);
		contentPane.add(btnCerrar);
	}

}
