package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota1;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(152, 27, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(152, 73, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(152, 122, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(152, 170, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(83, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(83, 76, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(83, 125, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(83, 173, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				
				String n1 = txtNota1.getText();
				String n2 = txtNota2.getText();
				String n3 = txtNota3.getText();
				
				if(!n1.isEmpty( ) && !n2.isEmpty() && !n3.isEmpty()) {
				
				Integer Nota1 = Integer.valueOf(n1);
				Integer Nota2 = Integer.valueOf(n2);
				Integer Nota3 = Integer.valueOf(n3);
				
				Integer calculo = (Nota1 + Nota2 + Nota3) / 3;
				
				
				
				JOptionPane.showConfirmDialog(null, "A média das notas do aluno " + nome + " é: " + calculo);
				
				}
			}
		});
		btnCalcular.setBounds(104, 208, 89, 23);
		contentPane.add(btnCalcular);
	}
}
