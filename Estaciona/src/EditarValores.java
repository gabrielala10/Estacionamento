import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EditarValores {

	JFrame janela;
	
	public void editar(Control controle)
	{
		janela = new JFrame("Configurações");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    janela.setSize(400, 250);
	    janela.setLocationRelativeTo(null);
	    janela.setVisible(true);
	    textosEditarValor(controle);
	}
	
	
	private void textosEditarValor(Control controle)
	  {
		 Color cor = new Color(176,196,222);
		 JButton botao = new JButton("Confirma");
		 JTextField valor = new JTextField("00.00");
		   
		 ButtonGroup veiculo = new ButtonGroup();
		 JRadioButton moto = new JRadioButton("Moto", true);
		 JRadioButton caminhonete = new JRadioButton("Caminhonete", false);
		 JRadioButton carro = new JRadioButton("Carro", false);

		 veiculo.add(moto);
		 veiculo.add(caminhonete);
		 veiculo.add(carro);

		  JPanel text1 = new JPanel();
		  JPanel text2 = new JPanel();
		  JPanel text = new JPanel();
		  JPanel opcao = new JPanel();
		  JPanel total = new JPanel();
		  JPanel bott = new JPanel();
		  JLabel tipo, dados, preco;
		  
		  
		  tipo = new JLabel("Tipo:");
		  preco = new JLabel("Novo Valor:");
		  dados = new JLabel("Editar valores:");
		  
		  opcao.setLayout(new GridBagLayout());

		  opcao.setLocation(50,50);
		  bott.setLocation(150,150);
		  text1.setLocation(1,50);
		  text2.setLocation(1,100);
		  total.setLocation(100,100);
		  
		  text1.setSize(50, 40);
		  text2.setSize(90, 40);
		  total.setSize(40, 100);
		  bott.setSize(100, 40);
		  text.setSize(50, 30);
		  opcao.setSize(300, 40);
		  opcao.setBackground( cor );
		 
		  text1.add(tipo);
		  text2.add(preco);
		  total.add(valor);
		  text.add(dados);
		  opcao.add(moto);
		  opcao.add(caminhonete);
		  opcao.add(carro);
		  bott.add(botao);
		  
	
		  janela.add(text1);
		  janela.add(text2);
		  janela.add(total);
		  janela.add(opcao);
		  janela.add(bott);
		  janela.add(text);
		  
		  Avisos telinha = new Avisos();
		  
		  botao.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e){
					  try {
					  double anterior = 0, atual;
			  		String prec = valor.getText();
			  		prec = prec.replace(",", ".");
			  		atual = Double.parseDouble(prec);
			  		janela.dispose();
			  		if(moto.isSelected())
			  			{
				  			anterior = controle.valmoto;	
				  			controle.valmoto = atual;
			  			}
			  		else
			  		{
			  			if(caminhonete.isSelected())
			  				{
			  				anterior = controle.valcaminhonete;
			  				controle.valcaminhonete = atual;
			  				}
			  			else
			  				if(carro.isSelected())
			  				{
			  				anterior = controle.valcarro;
			  				controle.valcarro = atual;
			  				}
			  		}
			  		telinha.telaConfirma(anterior, atual);
					}
					  
					  catch(NumberFormatException numberFormatException)
					  {
						  telinha.entradaIncorreta(controle);
					  }
					  
				  }

		  });
	  }
}
