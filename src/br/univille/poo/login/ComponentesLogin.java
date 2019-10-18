package br.univille.poo.login;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ComponentesLogin extends JFrame{
	

	public ComponentesLogin() {
		
		setTitle("Login");
		setSize(400, 350);
		setResizable(false);
		setLayout();
	}
	
	// Configura a tela
	private void setLayout() {
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		panel.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com titulo
			   ,BorderFactory.createTitledBorder("Login")));

		// Campo texto com 10 caracteres
		JTextField textUser = new JTextField(10);
		textUser.setBounds(140, 60, 170, 30);
		
		JLabel labelUser = new JLabel("Usuário:");
		labelUser.setBounds(80, 60, 80, 30);
		
		// Campo Password com 10 caracteres
		JPasswordField textPassword = new JPasswordField(10);
		textPassword.setBounds(140, 97, 170, 30);
		
		JLabel labelPassword = new JLabel("Senha:");
		labelPassword.setBounds(80, 97, 80, 30);
		
		// Botão
		JButton button = new JButton("Acessar");
		button.setBounds(140, 130, 170, 30);
		
		// Checkbox
		JCheckBox check = new JCheckBox("Manter acessado");
		check.setBounds(140, 160, 170, 30);
		check.setText("Manter acessado!");
		
		// Label
		JLabel labelEsqueceuSenha = new JLabel("Esqueci minha senha");
		labelEsqueceuSenha.setForeground(Color.magenta);
		labelEsqueceuSenha.setBounds(160, 190, 170, 30);
		
		panel.add(textUser);
		panel.add(textPassword);
		panel.add(button);
		panel.add(labelUser);
		panel.add(labelPassword);
		panel.add(labelEsqueceuSenha);
		panel.add(check);
		
		//Adiciona o painel no frame
		add(panel);
	}
	

}
