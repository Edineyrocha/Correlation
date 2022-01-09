package firstProject;

import javax.swing.JOptionPane;

public class Ash {
	public double calcOffsetAsh() {

		String labASH1 = JOptionPane.showInputDialog("Digite o Resultado de Cinzas do Laboratório ");
		if (labASH1 == null) {
			labASH1 = "0.0";
		}
		labASH1 = labASH1.replace(",", ".");
		String qcsASH1 = JOptionPane.showInputDialog("Digite o Resultado de Cinzas do QCS ");
		if (qcsASH1 == null) {
			qcsASH1 = "0.0";
		}
		qcsASH1 = qcsASH1.replace(",", ".");
		String offsetASH1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual de Cinzas ");
		if (offsetASH1 == null) {
			offsetASH1 = "0.0";
		}
		offsetASH1 = offsetASH1.replace(",", ".");
		double labASH = Double.parseDouble(labASH1);
		double qcsASH = Double.parseDouble(qcsASH1);
		double offASH = Double.parseDouble(offsetASH1);
		double newOffsetASH = offASH + (labASH - qcsASH);

		return newOffsetASH;

	}

}
