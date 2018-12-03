import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaPrincipal {
	
	JFrame janela;
	JPanel panel;
	
	  public void plantaBaixa(Veiculo veiculos[])
	  {
		  janela = new JFrame("Estacionamento");
		  Color cor = new Color(255, 255, 224);
		  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  panel = new JPanel();
		  panel.setSize(1000, 1000);
		  quadrado(veiculos);
		  textos();
		  //panel.setBackground(cor);
		  janela.add(panel);
		  criaMenu();
		    
		  janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		  janela.setVisible(true);
	  }
	  
	  private void quadrado(Veiculo veiculos[])
	  {
		  int x = 84, y = 50, i, j;
		  JPanel quad;
		  for(j=0;j<10;j++)
		  {
			  for(i=0;i<20;i++)
			  {
				  
				  Color corVago = new Color(4, 139, 34);
				  Color corOcupado = new Color(255, 0, 0);
				  quad = new JPanel();
				  if(i<10)
				  {
					  if(veiculos[j*10+i].getConcluido()==1)
						  quad.setBackground( corVago );
					  else
						  quad.setBackground( corOcupado );
					  quad.setLocation(x, y);
				  }
				  else
				  {
					  if(veiculos[j*10+i+90].getConcluido()==1)
						  quad.setBackground( corVago );
					  else
						  quad.setBackground( corOcupado );
				  }
				  quad.setLocation(x, y);
				  quad.setSize(40, 50);
				  if(i!=9)
					  x+=60;
				  else
					  x+=80;
				  janela.add(quad);
				  
			  }
			  x = 84;
			  y += 60;
		  }
	  }
	  
	  private void textos()
	  {
		  Color cor = new Color(152, 251, 152);

		  JPanel text1, text2, text3, text4, text5, text6;
		  JLabel terreo, piso1, motos, carros, caminhonetes;
		  terreo = new JLabel("Térreo");
		  piso1 = new JLabel("Piso 1");
		  motos = new JLabel("Motos");
		  caminhonetes = new JLabel("Caminhonetes");
		  carros = new JLabel("Carros");
		  
		  text1 = new JPanel();
		  text2 = new JPanel();
		  text3 = new JPanel();
		  text4 = new JPanel();
		  text5 = new JPanel();
		  text6 = new JPanel();
		  
		  text1.setLocation(80,10);
		  text2.setLocation(700,10);
		  text3.setLocation(1,50);
		  text4.setLocation(1,170);
		  text5.setLocation(1,120);
		  text6.setLocation(740,10);
		  
		  text1.setBackground( cor );
		  text2.setBackground( cor );
		  text3.setBackground( cor );
		  text4.setBackground( cor );
		  text5.setBackground( cor );
		  text6.setBackground( cor );
		  
		  text1.setSize(580, 30);
		  text2.setSize(580, 30);
		  text3.setSize(83, 110);
		  text4.setSize(83, 110);
		  text5.setSize(79, 50);
		  text6.setSize(50, 700);
		  
		 
		  text1.add(terreo);
		  text2.add(piso1);
		  text3.add(motos);
		  text4.add(caminhonetes);
		  text5.add(carros);
		  text6.add(carros);
		  motos.setVerticalAlignment(SwingConstants.CENTER);
		  
		  
		  janela.add(text1);
		  janela.add(text2);
		  janela.add(text3);
		  janela.add(text4);
		  //janela.add(text5);
		//  janela.add(text6);
	  }
	  
	  private void criaMenu()
	  {
		  JMenuBar bar = new JMenuBar();
		  JMenu menu = new JMenu("Inicio");
		  JMenu configurar = new JMenu("Configurar");
		  
		  TelaEstacionar estacionar = new TelaEstacionar();
		
		  JMenuItem inserirVeiculo = new JMenuItem("Inserir Veiculo");
		  menu.add(inserirVeiculo);
		
		  JMenuItem retirarVeiculo = new JMenuItem("Retirar Veiculo");
		  menu.add(retirarVeiculo);
		
		  JMenuItem historico = new JMenuItem("Histórico");
		  menu.add(historico);
		    
		  JMenuItem sair = new JMenuItem("Sair");
		  menu.add(sair);
		
		  JMenuItem mudarValor = new JMenuItem("Configurar Valores");
		  configurar.add(mudarValor);
		
		  JMenuItem limparHistorico = new JMenuItem("Limpar Histórico");
		  configurar.add(limparHistorico);
		
		  sair.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  janela.dispose();
			  }
		  });
		
		  retirarVeiculo.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {   		
				  estacionar.retirar();
			  }
		  });
		    
		  inserirVeiculo.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  estacionar.estaciona();
			  }
		  });
		
		
		  bar.add(menu);
		  bar.add(configurar);
		  janela.setJMenuBar(bar);
	}
  
}