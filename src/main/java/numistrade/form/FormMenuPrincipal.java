package numistrade.form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormMenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormMenuPrincipal frame = new FormMenuPrincipal();
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
	public FormMenuPrincipal() {
		setTitle("Menu principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 458);
		contentPane = new JPanel();
		contentPane.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(30, 273, 89, 23);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 642, 419);
		lblNewLabel.setIcon(new ImageIcon(FormMenuPrincipal.class.getResource("/numistrade/images/NumisMainMenu.gif")));
		contentPane.add(lblNewLabel);
	}
}
