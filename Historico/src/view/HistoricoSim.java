package view;
import javax.swing.JOptionPane;
import controller.HistoricoSimcontroller;


public class HistoricoSim {

	public static void main(String args[]) {
		HistoricoSimcontroller h = new HistoricoSimcontroller();
		int opc = 0;
		
		while(opc != 4) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir endereço de site  \n 2 - Retirar último endereço do histórico \n 3 - Consultar último endereço do histórico \n 4 - Fim"));	
			switch(opc) {
			case 1: h.inserirEnd();
			break;
			case 2: h.removerEnd();
			break;
			case 3: h.consultarEnd();
			break;
			case 4: JOptionPane.showMessageDialog(null,"Fim");
			break;
			default: JOptionPane.showMessageDialog(null,"nah");
			break;
			}
		}
		

	}

}
