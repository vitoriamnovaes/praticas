package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarefa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarefa frame = new Tarefa();
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
	public Tarefa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(151, 35, 153, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		JButton btnNewButton = new JButton("SOMA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text1 = txtNumero1.getText();
				String text2 = txtNumero2.getText();
				
				if (!text1.isEmpty() && !text2.isEmpty()) {
					Double n1 = Double.valueOf(text1);
					Double n2 = Double.valueOf(text2);
					JOptionPane.showMessageDialog(null, n1 + n2);
				}
			}
		});
		btnNewButton.setBounds(123, 198, 89, 23);
		contentPane.add(btnNewButton);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(151, 115, 153, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("numero 1");
		lblNewLabel.setBounds(20, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("numero 2");
		lblNewLabel_1.setBounds(20, 118, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
}
