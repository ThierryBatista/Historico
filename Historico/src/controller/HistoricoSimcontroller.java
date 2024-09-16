package controller;
import javax.swing.JOptionPane;
import models.PilhaString;

public class HistoricoSimcontroller {

	public HistoricoSimcontroller() {
		super();
	}
	PilhaString p = new PilhaString();
	
	public void inserirEnd() {
		String site = JOptionPane.showInputDialog(" Digite o site");
		if(site.contains("http://") && site.contains(".com") || site.contains(".co.uk")) {
			p.pushS(site);
		} else {
			System.out.println("Endereço invalido");
		}
	}
	
	public void removerEnd() {
		if(p.isEmpty()) {
			System.err.println("Historico vazio");
		} else {
			try {
				p.popS();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void consultarEnd() {
		if(p.isEmpty()) {
			System.err.println("Historico vazio");
		} else {
			try {
				String topogenkaku = p.topS();
				System.out.println(topogenkaku);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
