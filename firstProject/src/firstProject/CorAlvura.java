package firstProject;

import javax.swing.JOptionPane;

public class CorAlvura {
	public double calcOffsetBright() {

        String labBright1 = JOptionPane.showInputDialog("Digite o Resultado da Alvura do Laboratório ");
        if (labBright1 == null ) {
            labBright1 = "0.0";
        }
        labBright1 = labBright1.replace(",", ".");
        String qcsBright1 = JOptionPane.showInputDialog("Digite o Resultado da Alvura do QCS ");
        if (qcsBright1 == null ) {
            qcsBright1 = "0.0";
        }
        qcsBright1 = qcsBright1.replace(",", ".");
        String offsetBright1 = JOptionPane.showInputDialog("Digite o  Valor do Offset Atual da Alvura");
        if (offsetBright1 == null ) {
            offsetBright1 = "0.0";
        }
        offsetBright1 = offsetBright1.replace(",", ".");
        double labBright = Double.parseDouble(labBright1);
        double qcsBright = Double.parseDouble(qcsBright1);
        double offBright = Double.parseDouble(offsetBright1);
        double newOffsetBright = offBright + (labBright - qcsBright);

        return newOffsetBright;
    }

}
