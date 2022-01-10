package firstProject;

import javax.swing.JDialog;
import java.awt.Desktop;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ScreenButtons extends JDialog {// utilizando recursos do Jdiolg
	private JPanel jPanel = new JPanel(new GridBagLayout());// Painel de Componentes.
	private JButton jbuttonW = new JButton();
	private JButton jbuttonB = new JButton();
	private JButton jbuttonA = new JButton();
	private JButton jbuttonBR = new JButton();
	private JButton jbuttonCA = new JButton();
	private JButton jbuttonBW = new JButton();
	private JButton jbuttonMOI = new JButton();
	private JButton jbuttonASH = new JButton();
	private JButton jButtonDOC = new JButton();

	public ScreenButtons() {// construtor da tela classe.
		setTitle("Correlação de Sensores V1.0 por Ediney Rocha.");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		// setDefaultCloseOperation(ScreenButtons.EXIT_ON_CLOSE);
		// ----------------------------------------
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new Insets(5, 5, 5, 5);

		jbuttonW.setPreferredSize(new Dimension(150, 25));
		jbuttonW.setText("Brancura");
		jPanel.add(jbuttonW, gridBagConstraints);
		gridBagConstraints.gridx++;

		jbuttonA.setPreferredSize(new Dimension(150, 25));
		jbuttonA.setText("Coordenada A");
		jPanel.add(jbuttonA, gridBagConstraints);
		gridBagConstraints.gridx++;

		jbuttonB.setPreferredSize(new Dimension(150, 25));
		jbuttonB.setText("Coordenada B");
		jbuttonB.setBackground(Color.BLUE);
		jPanel.add(jbuttonB, gridBagConstraints);

		gridBagConstraints.gridy++;

		jbuttonBR.setPreferredSize(new Dimension(150, 25));
		jbuttonBR.setText("Alvura");
		jPanel.add(jbuttonBR, gridBagConstraints);
		gridBagConstraints.gridx--;

		jbuttonBW.setPreferredSize(new Dimension(150, 25));
		jbuttonBW.setText("Gramatura");
		jPanel.add(jbuttonBW, gridBagConstraints);
		gridBagConstraints.gridx--;

		jbuttonCA.setPreferredSize(new Dimension(150, 25));
		jbuttonCA.setText("Espessura");
		jPanel.add(jbuttonCA, gridBagConstraints);
		gridBagConstraints.gridy++;

		jbuttonMOI.setPreferredSize(new Dimension(150, 25));
		jbuttonMOI.setText("Umidade");
		jPanel.add(jbuttonMOI, gridBagConstraints);
		gridBagConstraints.gridx++;

		jbuttonASH.setPreferredSize(new Dimension(150, 25));
		jbuttonASH.setText("  Cinzas  ");
		jPanel.add(jbuttonASH, gridBagConstraints);
		gridBagConstraints.gridx++;

		jButtonDOC.setPreferredSize(new Dimension(150, 25));
		jButtonDOC.setText("Documentação");
		jPanel.add(jButtonDOC, gridBagConstraints);

//---------------------------------Actions Buttons--------------------------------//
		jbuttonW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Whitness whitness = new Whitness();
				setVisible(false);
				JOptionPane.showMessageDialog(null,
						"O novo Offset é:  " + String.valueOf(whitness.calcOffsetwhiteness()));
				setVisible(true);
			}
		});
		// --------------------------------------------------------------------------//
		jbuttonA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CorA corA = new CorA();
				setVisible(false);
				JOptionPane.showMessageDialog(null, "O novo Offset é:  " + String.valueOf(corA.calcOffsetA()));
				setVisible(true);
			}
		});
//------------------------------------------------------//
		jbuttonB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OffsetB offsetB = new OffsetB();
				setVisible(false);
				JOptionPane.showMessageDialog(null, "O novo Offset é:  " + String.valueOf(offsetB.calcOffsetB()));
				setVisible(true);
			}
		});
		// ----------------------------------------------//
		jbuttonBR.addActionListener((new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CorAlvura corAlvura = new CorAlvura();
				setVisible(false);
				JOptionPane.showMessageDialog(null,
						"O novo Offset é:  " + String.valueOf(corAlvura.calcOffsetBright()));

				setVisible(true);
			}
		}));

		// --------------------------------------------------------//
		jbuttonCA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Caliper caliper = new Caliper();
				setVisible(false);
				JOptionPane.showMessageDialog(null, "O novo Offset é:  " + String.valueOf(caliper.calcOffsetCA()));
				setVisible(true);
			}
		});
		// ----------------------------------------------------//
		jbuttonBW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BasisWeight basisWeight = new BasisWeight();
				setVisible(false);
				JOptionPane.showMessageDialog(null, "O novo Offset é:  " + String.valueOf(basisWeight.calcOffsetBW()));
				setVisible(true);
			}
		});
		// ----------------------------------------------------//
		jbuttonASH.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Ash ash = new Ash();
				setVisible(false);
				JOptionPane.showMessageDialog(null, "O novo Offset é:  " + String.valueOf((ash.calcOffsetAsh())));
				setVisible(true);
			}
		});
		// ------------------------------------------------//
		jbuttonMOI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Moisture moisture = new Moisture();
				setVisible(false);
				JOptionPane.showMessageDialog(null, "O novo Offset é:  " + String.valueOf((moisture.calcOffsetMOI())));
				setVisible(true);
			}
		});
		// --------------------------------------------------//
		jButtonDOC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI(//chamando Endereco WEB no navegador padrao.
							"https://suzano.sharepoint.com/:f:/r/sites/QCS/Documentos%20Compartilhados/Scanner%20Enroladeira?csf=1&web=1&e=HCJm5n"));
				} catch (IOException ex) {
					ex.printStackTrace();
				} catch (URISyntaxException ex) {
					ex.printStackTrace();
				}
				setVisible(true);
			}
		});
		add(jPanel, BorderLayout.CENTER);// centralizando os botoes.
		setVisible(true);
	};

}
