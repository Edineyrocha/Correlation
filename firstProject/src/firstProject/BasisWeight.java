package firstProject;

import javax.swing.JOptionPane;

public class BasisWeight {
	public double calcOffsetBW() {

		String labBW1 = JOptionPane.showInputDialog("Digite o Resultado da Gramatura do Laboratório ");
		if (labBW1 == null) {
			labBW1 = "0.0";
		}
		labBW1 = labBW1.replace(",", ".");
		String qcsBW1 = JOptionPane.showInputDialog("Digite o Resultado da Gramatura  do QCS ");
		if (qcsBW1 == null) {
			qcsBW1 = "0.0";
		}
		qcsBW1 = qcsBW1.replace(",", ".");
		String offsetBW1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual da Gramatura ");
		if (offsetBW1 == null) {
			offsetBW1 = "0.0";
		}
		offsetBW1 = offsetBW1.replace(",", ".");
		double labBW = Double.parseDouble(labBW1);
		double qcsBW = Double.parseDouble(qcsBW1);
		double offBW = Double.parseDouble(offsetBW1);
		double newOffsetBW = offBW + (labBW - qcsBW);

		return newOffsetBW;

	}

}
