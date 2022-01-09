package firstProject;

import javax.swing.JOptionPane;

public class Caliper {
	public double calcOffsetCA() {

		String labCaliper1 = JOptionPane.showInputDialog("Digite o Resultado da Espessura do Laboratório ");
		if (labCaliper1 == null) {
			labCaliper1 = "0.0";
		}
		labCaliper1 = labCaliper1.replace(",", ".");
		String qcsCaliper1 = JOptionPane.showInputDialog("Digite o Resultado da Espessura do QCS ");
		if (qcsCaliper1 == null) {
			qcsCaliper1 = "0.0";
		}
		qcsCaliper1 = qcsCaliper1.replace(",", ".");
		String offsetCaliper1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual da Espessura  ");
		if (offsetCaliper1 == null) {
			offsetCaliper1 = "0.0";
		}
		offsetCaliper1 = offsetCaliper1.replace(",", ".");
		double labCaliper = Double.parseDouble(labCaliper1);
		double qcsCaliper = Double.parseDouble(qcsCaliper1);
		double offCaliper = Double.parseDouble(offsetCaliper1);
		double newOffsetCaliper = offCaliper + ((labCaliper - qcsCaliper) / 25.4);

		return newOffsetCaliper;

	}

}
