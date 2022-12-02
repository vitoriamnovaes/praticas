package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JTextArea textArea;
	private String textoTotal;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setBounds(287, 11, 119, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorSelecionado = (String) comboBox.getSelectedItem();
				if(textoTotal == null) {
					textoTotal = valorSelecionado;
				} else {
					textoTotal = textoTotal + "," + valorSelecionado;
				}
				
				
				textArea.setText(textoTotal);
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(27, 11, 92, 31);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(129, 15, 118, 27);
		comboBox.addItem("Brasil");
		comboBox.addItem("França");
		comboBox.addItem("Italia");
		comboBox.addItem("Australia");
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 74, 361, 166);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
