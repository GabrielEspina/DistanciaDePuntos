package ar.edu.ub.p3.plano.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ar.edu.ub.p3.plano.modelo.Punto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frmCalculadorDeDistancia;
	private JTextField textPAX;
	private JTextField textPAY;
	private JTextField textPBX;
	private JTextField textPBY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmCalculadorDeDistancia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param punto2 
	 * @param punto 
	 */
	public Ventana( ) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadorDeDistancia = new JFrame();
		frmCalculadorDeDistancia.setResizable(false);
		frmCalculadorDeDistancia.setTitle("Calculador De Distancia");
		frmCalculadorDeDistancia.setBounds(100, 100, 305, 185);
		frmCalculadorDeDistancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadorDeDistancia.getContentPane().setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(41, 36, 46, 14);
		frmCalculadorDeDistancia.getContentPane().add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(41, 61, 46, 14);
		frmCalculadorDeDistancia.getContentPane().add(lblY);
		
		JLabel lblPuntoA = new JLabel("Punto A");
		lblPuntoA.setBounds(71, 11, 46, 14);
		frmCalculadorDeDistancia.getContentPane().add(lblPuntoA);
		
		JLabel lblPuntoB = new JLabel("Punto B");
		lblPuntoB.setBounds(127, 11, 46, 14);
		frmCalculadorDeDistancia.getContentPane().add(lblPuntoB);
		
		textPAX = new JTextField();
		textPAX.setBounds(71, 33, 46, 20);
		frmCalculadorDeDistancia.getContentPane().add(textPAX);
		textPAX.setColumns(10);
		
		textPAY = new JTextField();
		textPAY.setColumns(10);
		textPAY.setBounds(71, 58, 46, 20);
		frmCalculadorDeDistancia.getContentPane().add(textPAY);
		
		textPBX = new JTextField();
		textPBX.setColumns(10);
		textPBX.setBounds(127, 33, 46, 20);
		frmCalculadorDeDistancia.getContentPane().add(textPBX);
		
		textPBY = new JTextField();
		textPBY.setColumns(10);
		textPBY.setBounds(127, 58, 46, 20);
		frmCalculadorDeDistancia.getContentPane().add(textPBY);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(61, 116, 112, 14);
		frmCalculadorDeDistancia.getContentPane().add(lblResultado);
		
		JButton btnNewButton = new JButton("Calcular Distancia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Punto puntoA = new Punto(Double.parseDouble(textPAX.getText()) ,Double.parseDouble(textPAY.getText()));
					Punto puntoB = new Punto(Double.parseDouble(textPBX.getText()) ,Double.parseDouble(textPBY.getText()));
					lblResultado.setText( Double.toString(puntoA.calcularDistancia(puntoB)) );
					
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Datos mal ingresados", "ERROR AL CALCULAR", JOptionPane.CANCEL_OPTION);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(51, 86, 126, 23);
		frmCalculadorDeDistancia.getContentPane().add(btnNewButton);
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				System.exit(0);
				
			}
		});
		btnSalir.setBounds(200, 116, 89, 23);
		frmCalculadorDeDistancia.getContentPane().add(btnSalir);
	}

}
