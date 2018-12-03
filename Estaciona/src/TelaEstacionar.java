
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaEstacionar extends JFrame{

	public void estaciona()
	{
		JFrame janela = new JFrame("Inserir Veículo");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    
	    janela.setSize(400, 300);
	    janela.setLocationRelativeTo(null);
	    janela.setVisible(true);
	    
	    
	    
	}
	
	public void retirar()
	{
		JFrame janela = new JFrame("Inserir Veículo");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    janela.setSize(400, 300);
	    janela.setVisible(true);
	}
}
