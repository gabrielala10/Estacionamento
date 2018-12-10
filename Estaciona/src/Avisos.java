import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Avisos {

	
	public void telaConfirma(double anterior, double atual)
	{
		JFrame janelaa = new JFrame("Retirar Veículo");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    
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
	    
	    JLabel precoAnterior = new JLabel("Preço anterior: R$ "+anterior);
	    JLabel precoAtual = new JLabel("Preço atual: R$ "+atual);
	    JLabel dados = new JLabel("Resultados:");
	    
	    text1.add(precoAnterior);
		text2.add(precoAtual);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
		  janelaa.add(text2);
		  janelaa.add(bott);
		  janelaa.add(text3);
		  
		  botao.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e){			  
				  janelaa.dispose();
				  
			  }
		  });
	}
	
	public void teste(Control controle, int vaga)
	{
		if(vaga!=-1 &&vaga!=-2)
			telaVeiculoEstacionado( controle, vaga);
		else
		{
			if(vaga==-2)
				telaSemEspaco(controle);
			else
			telaPlacaIgual(controle);
		}
	}
	
	public void telaVeiculoEstacionado(Control controle, int vaga)
	{
		JFrame janelaa = new JFrame("TEMOS VAGAS");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    
	    janelaa.setSize(400, 250);
	    janelaa.setLocationRelativeTo(null);
	    janelaa.setVisible(true);
	    
	    JPanel text1 = new JPanel();
		JPanel text3 = new JPanel();
		JPanel bott = new JPanel();
		
		bott.setLocation(150,150);
		
		text1.setLocation(120,50);
		text3.setLocation(150,20);
		
		text1.setSize(150, 150);
		text3.setSize(100, 40);
		
		bott.setSize(100, 40);
	    
	    JLabel vagaEsta = new JLabel(""+vaga);
	    vagaEsta.setFont(new Font("Dialog", Font.PLAIN, 50));
	    JLabel dados = new JLabel("Vaga:");
	    
	    text1.add(vagaEsta);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
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
	
	public void telaPlacaIgual(Control controle)
	{
		JFrame janelaa = new JFrame("ERRO!");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    
	    janelaa.setSize(400, 250);
	    janelaa.setLocationRelativeTo(null);
	    janelaa.setVisible(true);
	    
	    JPanel text1 = new JPanel();
		JPanel text3 = new JPanel();
		JPanel bott = new JPanel();
		
		bott.setLocation(150,150);
		
		text1.setLocation(5,50);
		text3.setLocation(150,20);
		
		text1.setSize(400, 150);
		text3.setSize(100, 40);
		
		bott.setSize(100, 40);
	    
	    JLabel vagaEsta = new JLabel("PLACA JÁ EXISTE!");
	    vagaEsta.setFont(new Font("Dialog", Font.PLAIN, 40));
	    JLabel dados = new JLabel("Mensagem de erro:");
	    
	    text1.add(vagaEsta);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
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
	
	public void telaSemEspaco(Control controle)
	{
		JFrame janelaa = new JFrame("NÃO HÁ VAGAS!");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    
	    janelaa.setSize(400, 250);
	    janelaa.setLocationRelativeTo(null);
	    janelaa.setVisible(true);
	    
	    JPanel text1 = new JPanel();
		JPanel text3 = new JPanel();
		JPanel bott = new JPanel();
		
		bott.setLocation(150,150);
		
		text1.setLocation(5,50);
		text3.setLocation(150,20);
		
		text1.setSize(400, 150);
		text3.setSize(100, 40);
		
		bott.setSize(100, 40);
	    
	    JLabel vagaEsta = new JLabel("VAGAS ESGOTADAS!");
	    vagaEsta.setFont(new Font("Dialog", Font.PLAIN, 35));
	    JLabel dados = new JLabel("Mensagem de erro:");
	    
	    text1.add(vagaEsta);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
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
	
	public void telaPlacaNot(Control controle)
	{
		JFrame janelaa = new JFrame("ERRO!");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    
	    janelaa.setSize(400, 250);
	    janelaa.setLocationRelativeTo(null);
	    janelaa.setVisible(true);
	    
	    JPanel text1 = new JPanel();
		JPanel text3 = new JPanel();
		JPanel bott = new JPanel();
		
		bott.setLocation(150,150);
		
		text1.setLocation(5,50);
		text3.setLocation(150,20);
		
		text1.setSize(400, 150);
		text3.setSize(100, 40);
		
		bott.setSize(100, 40);
	    
	    JLabel vagaEsta = new JLabel("Placa não encontrada!");
	    vagaEsta.setFont(new Font("Dialog", Font.PLAIN, 35));
	    JLabel dados = new JLabel("Mensagem de erro:");
	    
	    text1.add(vagaEsta);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
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
	
	public void entradaIncorreta(Control controle)
	{
		JFrame janelaa = new JFrame("ERRO!");
	    janelaa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    JButton botao = new JButton("OK");
	    
	    janelaa.setSize(550, 250);
	    janelaa.setLocationRelativeTo(null);
	    janelaa.setVisible(true);
	    
	    JPanel text1 = new JPanel();
		JPanel text3 = new JPanel();
		JPanel bott = new JPanel();
		
		bott.setLocation(125,150);
		
		text1.setLocation(5,50);
		text3.setLocation(400,20);
		
		text1.setSize(550, 150);
		text3.setSize(150, 40);
		bott.setSize(280, 40);
		
		
	    
	    JLabel vagaEsta = new JLabel("Digite somente números e ponto ou vírgula para separar casas decimais!");
	    vagaEsta.setFont(new Font("Dialog", Font.PLAIN, 15));
	    JLabel dados = new JLabel("Mensagem de erro:");
	    
	    text1.add(vagaEsta);
		text3.add(dados);
		bott.add(botao);
		
		
		  janelaa.add(text1);
		  janelaa.add(bott);
		  janelaa.add(text3);
		  
		  botao.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e){			  
				  janelaa.dispose();
			  }
		  });
	}
	
}
