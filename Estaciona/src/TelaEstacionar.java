
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaEstacionar extends JFrame{

	JFrame janela;
	
	public void estaciona()
	{
		janela = new JFrame("Inserir Veículo");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    
	    janela.setSize(400, 300);
	    janela.setLocationRelativeTo(null);
	    janela.setVisible(true);
	    
	}
	
	private void text()
	{
		JPanel titulo = new JPanel();
		JLabel inserir = new JLabel("Inserir Veículo");
		titulo.add(inserir);
		janela.add(titulo);
	}
	
	public void retirar()
	{
		JFrame janela = new JFrame("Inserir Veículo");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    janela.setSize(400, 300);
	    janela.setVisible(true);
	}
}
