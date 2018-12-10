import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Preco {
	JFrame janelaa;
	
	public void telaEncerra(Veiculo vel, int i, Control controle)
	{
		janelaa = new JFrame("Nota Fiscal");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    double tot = vel.getValorTotal();
	    
	    janelaa.setSize(400, 250);
	    janelaa.setLocationRelativeTo(null);
	    janelaa.setVisible(true);
	    
	    JPanel text1 = new JPanel();
		JPanel text2 = new JPanel();
		JPanel text3 = new JPanel();
		JPanel bott = new JPanel();
		
		bott.setLocation(150,150);
		
		text1.setLocation(1,50);
		text2.setLocation(1,100);
		text3.setLocation(150,20);
		
		text1.setSize(150, 40);
		text2.setSize(150, 40);
		text3.setSize(100, 40);
		
		bott.setSize(100, 40);
	    
	    //JLabel precoAnterior = new JLabel("Preço anterior: R$ "+anterior);
	    JLabel precototal = new JLabel("Preço atual: R$ "+tot);
	    JLabel dados = new JLabel("A pagar");
	    
	   // text1.add(precoAnterior);
		text2.add(precototal);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
		  janelaa.add(text2);
		  janelaa.add(bott);
		  janelaa.add(text3);
		  
		  botao.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e){			  
				  janelaa.dispose();
				  TelaPrincipal t = new TelaPrincipal();
				  t.plantaBaixa(controle);
			  }
		  });
	}
}
