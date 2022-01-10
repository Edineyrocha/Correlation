package firstProject;

import javax.swing.JOptionPane;

public class Whitness {
	public double calcOffsetwhiteness() {

		String labWhitness1 = JOptionPane.showInputDialog("Digite a Brancura LAB");
		if (labWhitness1 == null) {
			labWhitness1 = "0.0";
		}
		labWhitness1 = labWhitness1.replace(",", ".");
		String qcsWhitness1 = JOptionPane.showInputDialog("Digite a Brancura QCS");
		if (qcsWhitness1 == null) {
			qcsWhitness1 = "0.0";
		}
		qcsWhitness1 = qcsWhitness1.replace(",", ".");
		String offsetwhiteness1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual");
		if (offsetwhiteness1 == null) {
			offsetwhiteness1 = "0.0";
		}
		offsetwhiteness1 = offsetwhiteness1.replace(",", ".");

		double labWhitness = Double.parseDouble(labWhitness1);
		double qcsWhitness = Double.parseDouble(qcsWhitness1);
		double offsetwhiteness = Double.parseDouble(offsetwhiteness1);
		double newOffsetwhitness = offsetwhiteness + (labWhitness - qcsWhitness);
		return newOffsetwhitness;

	}

}
