package br.univille.poo.login;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	ComponentesLogin login=  new ComponentesLogin();
            	// Finaliza o programa quando fechar a janela
            	login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	login.show();
            }
        });
	}

}
