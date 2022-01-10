package firstProject;

import javax.swing.JOptionPane;

public class OffsetB {
	public double calcOffsetB() {

		String labB1 = JOptionPane.showInputDialog("Digite o Resultado da coordenada B do Laboratório ");
		if (labB1 == null) {
			labB1 = "0.0";
		}
		labB1 = labB1.replace(",", ".");
		String qcsB1 = JOptionPane.showInputDialog("Digite o Resultado da coordenada B do QCS ");
		if (qcsB1 == null) {
			qcsB1 = "0.0";
		}
		qcsB1 = qcsB1.replace(",", ".");
		String offsetB1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual da Coordenada B ");
		if (offsetB1 == null) {
			offsetB1 = "0.0";
		}
		offsetB1 = offsetB1.replace(",", ".");
		double labB = Double.parseDouble(labB1);
		double qcsB = Double.parseDouble(qcsB1);
		double offB = Double.parseDouble(offsetB1);
		double newOffsetB = offB + (labB - qcsB);

		return newOffsetB;

	}

}
