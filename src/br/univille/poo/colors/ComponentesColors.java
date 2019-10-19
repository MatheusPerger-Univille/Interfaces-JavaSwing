package br.univille.poo.colors;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComponentesColors extends JFrame{
	
	private JPanel panelLeft;
	private JPanel panelRight;

	public ComponentesColors() {
		
		super("GridLayout");
		
		setLayout( new GridLayout(1,2));
		
		setTitle("Interactive Colors");
		setSize(500, 350);
		setResizable(false);
		configLayout();
	}
	
	// Configura a tela
	private void configLayout() {
		
		add(criarPanelEsquerda());
		add(criarPanelDireita());
	}
	
    private JPanel criarPanelEsquerda() {
    	panelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	
    	// Checkbox Norte
		JCheckBox checkNorte = new JCheckBox("Norte");
		checkNorte.setPreferredSize(new Dimension(200,20));
		checkNorte.setText("Norte");
		checkNorte.setFont(new Font("Arial", Font.BOLD, 17));
		checkNorte.setSelected(true);
		
		// Checkbox Sul
		JCheckBox checkSul = new JCheckBox("Sul");
		checkSul.setPreferredSize(new Dimension(200,20));
		checkSul.setText("Sul");
		checkSul.setFont(new Font("Arial", Font.BOLD, 17));
		checkSul.setSelected(true);
		
		// Checkbox Centro
		JCheckBox checkCentro = new JCheckBox("Centro");
		checkCentro.setPreferredSize(new Dimension(200,20));
		checkCentro.setText("Centro");
		checkCentro.setFont(new Font("Arial", Font.BOLD, 17));
		checkCentro.setSelected(true);
		
		// Checkbox Leste
		JCheckBox checkLeste = new JCheckBox("Leste");
		checkLeste.setPreferredSize(new Dimension(200,20));
		checkLeste.setText("Leste");
		checkLeste.setFont(new Font("Arial", Font.BOLD, 17));
		checkLeste.setSelected(true);
		
		// Checkbox Oeste
		JCheckBox checkOeste = new JCheckBox("Oeste");
		checkOeste.setPreferredSize(new Dimension(200,20));
		checkOeste.setText("Oeste");
		checkOeste.setFont(new Font("Arial", Font.BOLD, 17));
		checkOeste.setSelected(true);
		
    	// Configura um tamanho padrao do painel
		panelLeft.setBorder(BorderFactory.createEmptyBorder(70,60,10,10));
		
		panelLeft.add(checkNorte);
		adicionandoListener(checkNorte, "Norte");
		panelLeft.add(checkSul);
		adicionandoListener(checkSul, "Sul");
		panelLeft.add(checkCentro);
		adicionandoListener(checkCentro, "Centro");
		panelLeft.add(checkLeste);
		adicionandoListener(checkLeste, "Leste");
		panelLeft.add(checkOeste);
		adicionandoListener(checkOeste, "Oeste");
		
    	return panelLeft;
    }
    
    private void adicionandoListener(JCheckBox checkbox, String name) {
    	checkbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel selectedPanel = new JPanel();
				for(Component panel : panelRight.getComponents()) {
					if(panel.getName().equals(name)) {
						selectedPanel = (JPanel) panel;
						break;
					}
				}
				if(checkbox.isSelected())
					selectedPanel.show();
				else
					selectedPanel.hide();
			}
		});
    }
    
    private JPanel criarPanelDireita() {
    	panelRight = new JPanel(new BorderLayout(2,2));
        
        //Cria os paineis
        JPanel norte = criarPanelComCor(Color.BLUE,"Norte");
        JPanel leste = criarPanelComCor(Color.gray,"Leste");
        JPanel oeste = criarPanelComCor(Color.ORANGE,"Oeste");
        JPanel sul = criarPanelComCor(Color.RED,"Sul");
        JPanel centro = criarPanelComCor(Color.WHITE,"Centro");
        
        // Adiciona o painel no norte
        panelRight.add(norte, BorderLayout.NORTH);
        // Adiciona o painel no sul
        panelRight.add(sul, BorderLayout.SOUTH);
        // Adiciona o painel no leste
        panelRight.add(leste, BorderLayout.WEST);
        // Adiciona o painel no oeste
        panelRight.add(oeste, BorderLayout.EAST);
        // Adiciona o painel no centro
        panelRight.add(centro, BorderLayout.CENTER); 
        panelRight.getComponents();
    	return panelRight;
    }
	
    private JPanel criarPanelComCor(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configura um tamanho padrao do painel
    	panel.setPreferredSize(new Dimension(70, 50));
    	panel.setName(texto);
    	return panel;
    }
	

}
