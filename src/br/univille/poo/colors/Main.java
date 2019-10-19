package br.univille.poo.colors;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	ComponentesColors color=  new ComponentesColors();
            	// Finaliza o programa quando fechar a janela
            	color.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	color.show();
            }
        });
	}

}
