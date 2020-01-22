import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class RadioInterface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioInterface window = new RadioInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 920, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 878, 252);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBoton1 = new JButton("1");
		btnBoton1.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton1.setBackground(SystemColor.inactiveCaption);
		btnBoton1.setForeground(Color.BLUE);
		btnBoton1.setBounds(121, 179, 97, 25);
		panel.add(btnBoton1);
		
		JButton btnBoton2 = new JButton("2\r\n");
		btnBoton2.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton2.setForeground(Color.BLUE);
		btnBoton2.setBackground(SystemColor.inactiveCaption);
		btnBoton2.setBounds(230, 179, 97, 25);
		panel.add(btnBoton2);
		
		JButton btnBoton3 = new JButton("3");
		btnBoton3.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton3.setBackground(SystemColor.inactiveCaption);
		btnBoton3.setForeground(Color.BLUE);
		btnBoton3.setBounds(339, 179, 97, 25);
		panel.add(btnBoton3);
		
		JButton btnBoton4 = new JButton("4");
		btnBoton4.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton4.setForeground(Color.BLUE);
		btnBoton4.setBackground(SystemColor.inactiveCaption);
		btnBoton4.setBounds(448, 179, 97, 25);
		panel.add(btnBoton4);
		
		JButton btnBoton5 = new JButton("5");
		btnBoton5.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton5.setBackground(SystemColor.inactiveCaption);
		btnBoton5.setForeground(Color.BLUE);
		btnBoton5.setBounds(557, 179, 97, 25);
		panel.add(btnBoton5);
		
		JButton btnBoton6 = new JButton("6");
		btnBoton6.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton6.setForeground(Color.BLUE);
		btnBoton6.setBackground(SystemColor.inactiveCaption);
		btnBoton6.setBounds(662, 179, 97, 25);
		panel.add(btnBoton6);
		
		JButton btnBoton7 = new JButton("7");
		btnBoton7.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton7.setBackground(SystemColor.inactiveCaption);
		btnBoton7.setForeground(Color.BLUE);
		btnBoton7.setBounds(121, 214, 97, 25);
		panel.add(btnBoton7);
		
		JButton btnBoton8 = new JButton("8");
		btnBoton8.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton8.setForeground(Color.BLUE);
		btnBoton8.setBackground(SystemColor.inactiveCaption);
		btnBoton8.setBounds(230, 214, 97, 25);
		panel.add(btnBoton8);
		
		JButton btnBoton9 = new JButton("9");
		btnBoton9.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton9.setForeground(Color.BLUE);
		btnBoton9.setBackground(SystemColor.inactiveCaption);
		btnBoton9.setBounds(339, 214, 97, 25);
		panel.add(btnBoton9);
		
		JButton btnBoton10 = new JButton("10");
		btnBoton10.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton10.setBackground(SystemColor.inactiveCaption);
		btnBoton10.setForeground(Color.BLUE);
		btnBoton10.setBounds(448, 214, 97, 25);
		panel.add(btnBoton10);
		
		JButton btnBoton11 = new JButton("11");
		btnBoton11.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton11.setForeground(Color.BLUE);
		btnBoton11.setBackground(SystemColor.inactiveCaption);
		btnBoton11.setBounds(557, 214, 97, 25);
		panel.add(btnBoton11);
		
		JButton btnBoton12 = new JButton("12");
		btnBoton12.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton12.setBackground(SystemColor.inactiveCaption);
		btnBoton12.setForeground(Color.BLUE);
		btnBoton12.setBounds(662, 214, 97, 25);
		panel.add(btnBoton12);
		
		JButton btnAtras = new JButton("\u2039");
		btnAtras.setBackground(SystemColor.inactiveCaption);
		btnAtras.setFont(new Font("Arial", Font.BOLD, 55));
		btnAtras.setForeground(new Color(0, 0, 255));
		btnAtras.setBounds(12, 13, 97, 151);
		panel.add(btnAtras);
		
		JButton btnAdelante = new JButton("\u203A");
		btnAdelante.setBackground(SystemColor.inactiveCaption);
		btnAdelante.setForeground(Color.BLUE);
		btnAdelante.setFont(new Font("Arial", Font.BOLD, 55));
		btnAdelante.setBounds(769, 13, 97, 151);
		panel.add(btnAdelante);
		
		JPanel panelRadio = new JPanel();
		panelRadio.setBackground(new Color(204, 255, 255));
		panelRadio.setBounds(121, 13, 636, 151);
		panel.add(panelRadio);
		panelRadio.setLayout(null);
		
		JLabel lblEmisora = new JLabel("AM");
		lblEmisora.setForeground(Color.BLUE);
		lblEmisora.setFont(new Font("BankGothic Lt BT", Font.BOLD, 50));
		lblEmisora.setBounds(12, 13, 91, 125);
		panelRadio.add(lblEmisora);
		
		JRadioButton rbEncendido = new JRadioButton("");
		rbEncendido.setBackground(Color.BLUE);
		rbEncendido.setBounds(42, 196, 25, 25);
		panel.add(rbEncendido);
		
		JButton btnNewButton = new JButton("\u0398");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton.setBounds(769, 179, 97, 60);
		panel.add(btnNewButton);
	}
}
