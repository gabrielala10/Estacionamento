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
	JPanel panel = new JPanel(null);
	
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
		  int x = 90, y = 50, i, j, k;
		  JPanel quad;
		  JLabel text;
		  for(j=0;j<10;j++)
		  {
			  for(i=0;i<20;i++)
			  {
				  
				  Color corVago = new Color(46,139,87);
				  Color corOcupado = new Color(205,92,92);
				  quad = new JPanel();
				  if(i<10)
				  {
					  text = new JLabel(""+ j+i);
					  if(veiculos[j*10+i].getConcluido()==1)
						  quad.setBackground( corVago );
					  else
						  quad.setBackground( corOcupado );
					  quad.setLocation(x, y);
					  quad.add(text);
				  }
				  else
				  {
					  k = i-10;
					  text = new JLabel(""+ 1+j+k);
					  if(veiculos[j*10+i+90].getConcluido()==1)
						  quad.setBackground( corVago );
					  else
						  quad.setBackground( corOcupado );
					  quad.add(text);
				  }
				  quad.setLocation(x, y);
				  quad.setSize(40, 50);
				  if(i!=9)
					  x+=60;
				  else
					  x+=70;
				  janela.add(quad);
				  
			  }
			  x = 90;
			  y += 60;
		  }
	  }
	  
	  private void textos()
	  {
		  Color cor = new Color(176,196,222);

		  JPanel text1;
		  JPanel text2;
		  JPanel text3 = new JPanel(null);
		  JPanel text4 = new JPanel(null);
		  JPanel text5 = new JPanel(null);
		  JPanel text6 = new JPanel(null);
		  JLabel terreo, piso1, motos, carros, carros2, caminhonetes;
		  terreo = new JLabel("Térreo");
		  piso1 = new JLabel("Piso 1");
		  motos = new JLabel("Motos");
		  caminhonetes = new JLabel("Caminhonetes");
		  carros = new JLabel("Carros");
		  carros2 = new JLabel("Carros");
		  
		  motos.setBounds(25, 45, 40, 20);
		  caminhonetes.setBounds(0, 45, 90, 20);
		  carros.setBounds(23, 165, 40, 20);
		  carros2.setBounds(23, 285, 40, 20);
		  
		  text1 = new JPanel();
		  text2 = new JPanel();
		  
		  text1.setLocation(90,10);
		  text2.setLocation(700,10);
		  text3.setLocation(1,50);
		  text4.setLocation(1,170);
		  text5.setLocation(1,290);
		  text6.setLocation(1284,50);
		  
		  text1.setBackground( cor );
		  text2.setBackground( cor );
		  text3.setBackground( cor );
		  text4.setBackground( cor );
		  text5.setBackground( cor );
		  text6.setBackground( cor );
		  
		  text1.setSize(580, 30);
		  text2.setSize(580, 30);
		  text3.setSize(85, 110);
		  text4.setSize(85, 110);
		  text5.setSize(85, 350);
		  text6.setSize(85, 590);
		  
		 
		  text1.add(terreo);
		  text2.add(piso1);
		  text3.add(motos);
		  text4.add(caminhonetes);
		  text5.add(carros);
		  text6.add(carros2);
		  motos.setVerticalAlignment(SwingConstants.CENTER);
		  
		  
		  janela.add(text1);
		  janela.add(text2);
		  janela.add(text3);
		  janela.add(text4);
		  janela.add(text5);
		  janela.add(text6);
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