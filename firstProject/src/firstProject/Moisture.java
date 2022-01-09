package firstProject;

import javax.swing.JOptionPane;

public class Moisture {
	public double calcOffsetMOI() {

		String labMOI1 = JOptionPane.showInputDialog("Digite o Resultado da Umidade do Laboratório ");
		if (labMOI1 == null) {
			labMOI1 = "0.0";
		}
		labMOI1 = labMOI1.replace(",", ".");
		String qcsMOI1 = JOptionPane.showInputDialog("Digite o Resultado da Umidade do QCS ");
		if (qcsMOI1 == null) {
			qcsMOI1 = "0.0";
		}
		qcsMOI1 = qcsMOI1.replace(",", ".");
		String offsetMOI1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual da Umidade ");
		if (offsetMOI1 == null) {
			offsetMOI1 = "0.0";
		}
		offsetMOI1 = offsetMOI1.replace(",", ".");
		double labMOI = Double.parseDouble(labMOI1);
		double qcsMOI = Double.parseDouble(qcsMOI1);
		double offMOI = Double.parseDouble(offsetMOI1);
		double newOffsetMOI = (offMOI + (labMOI - qcsMOI)) * -1;

		return newOffsetMOI;
	}

}
