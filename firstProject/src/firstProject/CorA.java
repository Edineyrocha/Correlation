package firstProject;

import javax.swing.JOptionPane;

public class CorA {
	public double calcOffsetA() {

		String labA1 = JOptionPane.showInputDialog("Digite o Resultado da coordenada A do Laboratório ");
		if (labA1 == null) {
			labA1 = "0.0";
		}
		labA1 = labA1.replace(",", ".");
		String qcsA1 = JOptionPane.showInputDialog("Digite o Resultado da coordenada A do QCS ");
		if (qcsA1 == null) {
			qcsA1 = "0.0";
		}
		qcsA1 = qcsA1.replace(",", ".");
		String offsetA1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual da Coordenada A ");
		if (offsetA1 == null) {
			offsetA1 = "0.0";
		}
		offsetA1 = offsetA1.replace(",", ".");
		double labA = Double.parseDouble(labA1);
		double qcsA = Double.parseDouble(qcsA1);
		double offA = Double.parseDouble(offsetA1);
		double newOffsetA = offA + (labA - qcsA);

		return newOffsetA;

	}

}
