
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TelaEstacionar{

	private JFrame janela;
	private JButton botao = new JButton("Confirma");
	
	public void estaciona(Control controle)
	{
		janela = new JFrame("Inserir Veículo");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    
	    janela.setSize(400, 350);
	    janela.setLocationRelativeTo(null);
	    janela.setVisible(true);
	    textosEstacionar(controle);
	      
	}
	
	public void retirar(Control controle)
	{
		janela = new JFrame("Retirar Veículo");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    janela.setSize(400, 350);
	    janela.setLocationRelativeTo(null);
	    janela.setVisible(true);
	    textosRetirar(controle);
	    
	    
	}
	
	 private void textosEstacionar(Control controle)
	  {
		 Color cor = new Color(176,196,222);
		 String placaa, categoria, mesSel;
		 
		 	String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		 	String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		 	String[] meses = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		 	String[] anos = {"2018", "2019", "2020", "2021"};
		 	String[] dias31 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}; 
		 	String[] dias30 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
		 	String[] fevereiro = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};
		 	String[] horas = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
		 	String[] minutos = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
		   JComboBox l1 = new JComboBox(letras);
		   JComboBox l2 = new JComboBox(letras);
		   JComboBox l3 = new JComboBox(letras);
		   JComboBox n1 = new JComboBox(numeros);
		   JComboBox n2 = new JComboBox(numeros);
		   JComboBox n3 = new JComboBox(numeros);
		   JComboBox n4 = new JComboBox(numeros);
		   JComboBox mes = new JComboBox(meses);
		   JComboBox ano = new JComboBox(anos);
		   JComboBox dias1 = new JComboBox(dias31);
		   JComboBox dias0 = new JComboBox(dias30);
		   JComboBox minuto = new JComboBox(minutos);
		   JComboBox segundos = new JComboBox(minutos);
		   JComboBox horaa = new JComboBox(horas);
		   JComboBox diasfev = new JComboBox(fevereiro);
		   
		   l1.setSize(10,10);
		   l2.setSize(10,10);
		   l3.setSize(10,10);
		   n1.setSize(10,10);
		   n2.setSize(10,10);
		   n3.setSize(10,10);
		   n4.setSize(10,10);
		 
		 
		 ButtonGroup veiculo = new ButtonGroup();
		 JRadioButton moto = new JRadioButton("Moto", true);
		 JRadioButton caminhonete = new JRadioButton("Caminhonete", false);
		 JRadioButton carro = new JRadioButton("Carro", false);

		 veiculo.add(moto);
		 veiculo.add(caminhonete);
		 veiculo.add(carro);

		  JPanel text1 = new JPanel();
		  JPanel text2 = new JPanel();
		  JPanel text3 = new JPanel();
		  JPanel text4 = new JPanel();
		  JPanel text = new JPanel();
		  JPanel opcao = new JPanel();
		  JPanel selplaca = new JPanel();
		  JPanel selData = new JPanel();
		  JPanel selHora = new JPanel();
		  JPanel bott = new JPanel();
		  JLabel tipo, placa, data, hora, dados;
		  
		  
		  mesSel = (String) mes.getSelectedItem();
		  selData.add(dias1);
		  selData.add(mes);
		  selData.add(ano);
		  selHora.add(horaa);
		  selHora.add(minuto);
		  selHora.add(segundos);
		  
		  tipo = new JLabel("Tipo:");
		  placa = new JLabel("Placa:");
		  data = new JLabel("Data:");
		  hora = new JLabel("Hora:");
		  dados = new JLabel("Cadastrar dados");
		  
		  opcao.setLayout(new GridBagLayout());

		  opcao.setLocation(50,50);
		  selplaca.setLocation(50,100);
		  selData.setLocation(50,150);
		  selHora.setLocation(50,200);
		  bott.setLocation(150,250);
		  text1.setLocation(1,50);
		  text2.setLocation(1,100);
		  text3.setLocation(1,150);
		  text4.setLocation(1,200);
		  
		  text1.setSize(50, 40);
		  text2.setSize(50, 40);
		  text3.setSize(50, 40);
		  bott.setSize(100, 40);
		  text4.setSize(50, 40);
		  text.setSize(50, 30);
		  opcao.setSize(300, 40);
		  selplaca.setSize(300,40);
		  selData.setSize(300,40);
		  selHora.setSize(300,40);
		  opcao.setBackground( cor );
		 
		  text1.add(tipo);
		  text2.add(placa);
		  text3.add(data);
		  text4.add(hora);
		  text.add(dados);
		  opcao.add(moto);
		  opcao.add(caminhonete);
		  opcao.add(carro);
		  selplaca.add(l1);
		  selplaca.add(l2);
		  selplaca.add(l3);
		  selplaca.add(n1);
		  selplaca.add(n2);
		  selplaca.add(n3);
		  selplaca.add(n4);
		  bott.add(botao);
		  
	
		  janela.add(text1);
		  janela.add(text2);
		  janela.add(text3);
		  janela.add(text4);
		  janela.add(opcao);
		  janela.add(selplaca);
		  janela.add(selData);
		  janela.add(selHora);
		  janela.add(bott);
		  janela.add(text);
		  
		  Avisos telinha = new Avisos();
		  
		  botao.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e){
			  String placaa = ""+ l1.getSelectedItem().toString()+ l2.getSelectedItem().toString()+ l3.getSelectedItem().toString()+ n1.getSelectedItem().toString()+ n2.getSelectedItem().toString() +n3.getSelectedItem().toString()+n4.getSelectedItem().toString();
		  		int diaa = Integer.parseInt((String) dias1.getSelectedItem().toString());
		  		int mess = Integer.parseInt((String) mes.getSelectedItem().toString());
		  		int anoo = Integer.parseInt((String) ano.getSelectedItem().toString());
		  		int hora = Integer.parseInt((String) horaa.getSelectedItem().toString());
		  		int minutos = Integer.parseInt((String) minuto.getSelectedItem().toString());
		  		int segundo = Integer.parseInt((String) segundos.getSelectedItem().toString());
		  		if(moto.isSelected())
				  verifica(controle, placaa, "Moto", diaa, mess, anoo, hora, minutos, segundo);
		  		else
		  		{
		  			if(caminhonete.isSelected())
		  				verifica(controle, placaa, "Caminhonete", diaa, mess, anoo, hora, minutos, segundo);
		  			else
		  				verifica(controle, placaa, "Carro", diaa, mess, anoo, hora, minutos, segundo);
		  		}
		  		telinha.teste(controle, Control.ultimaVaga);
				  janela.dispose();
			  }
		  });
	  }
	 
	 private void textosRetirar(Control controle)
	  {
		 Color cor = new Color(176,196,222);
		 String placaa, categoria, mesSel;
		 
		 	String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		 	String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		 	String[] meses = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		 	String[] anos = {"2018", "2019", "2020", "2021"};
		 	String[] dias31 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}; 
		 	String[] dias30 = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
		 	String[] fevereiro = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};
		 	String[] horas = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
		 	String[] minutos = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
		   JComboBox l1 = new JComboBox(letras);
		   JComboBox l2 = new JComboBox(letras);
		   JComboBox l3 = new JComboBox(letras);
		   JComboBox n1 = new JComboBox(numeros);
		   JComboBox n2 = new JComboBox(numeros);
		   JComboBox n3 = new JComboBox(numeros);
		   JComboBox n4 = new JComboBox(numeros);
		   JComboBox mes = new JComboBox(meses);
		   JComboBox ano = new JComboBox(anos);
		   JComboBox dias1 = new JComboBox(dias31);
		   JComboBox dias0 = new JComboBox(dias30);
		   JComboBox minuto = new JComboBox(minutos);
		   JComboBox segundos = new JComboBox(minutos);
		   JComboBox horaa = new JComboBox(horas);
		   JComboBox diasfev = new JComboBox(fevereiro);
		   
		   l1.setSize(10,10);
		   l2.setSize(10,10);
		   l3.setSize(10,10);
		   n1.setSize(10,10);
		   n2.setSize(10,10);
		   n3.setSize(10,10);
		   n4.setSize(10,10);

		  JPanel text2 = new JPanel();
		  JPanel text3 = new JPanel();
		  JPanel text4 = new JPanel();
		  JPanel text = new JPanel();
		  JPanel selplaca = new JPanel();
		  JPanel selData = new JPanel();
		  JPanel selHora = new JPanel();
		  JPanel bott = new JPanel();
		  JLabel placa, data, hora, dados;
		  
		  
		  mesSel = (String) mes.getSelectedItem();
		  selData.add(dias1);
		  selData.add(mes);
		  selData.add(ano);
		  selHora.add(horaa);
		  selHora.add(minuto);
		  selHora.add(segundos);
		  
		  placa = new JLabel("Placa:");
		  data = new JLabel("Data:");
		  hora = new JLabel("Hora:");
		  dados = new JLabel("Finalizar serviço");

		  selplaca.setLocation(50,100);
		  selData.setLocation(50,150);
		  selHora.setLocation(50,200);
		  bott.setLocation(150,250);
		  text2.setLocation(1,100);
		  text3.setLocation(1,150);
		  text4.setLocation(1,200);
		  
		  text2.setSize(50, 40);
		  text3.setSize(50, 40);
		  bott.setSize(100, 40);
		  text4.setSize(50, 40);
		  text.setSize(50, 30);
		  selplaca.setSize(300,40);
		  selData.setSize(300,40);
		  selHora.setSize(300,40);
		 
		  text2.add(placa);
		  text3.add(data);
		  text4.add(hora);
		  text.add(dados);
		  selplaca.add(l1);
		  selplaca.add(l2);
		  selplaca.add(l3);
		  selplaca.add(n1);
		  selplaca.add(n2);
		  selplaca.add(n3);
		  selplaca.add(n4);
		  bott.add(botao);
		  
		  janela.add(text2);
		  janela.add(text3);
		  janela.add(text4);
		  janela.add(selplaca);
		  janela.add(selData);
		  janela.add(selHora);
		  janela.add(bott);
		  janela.add(text);
		  
		  
		  Avisos telinha = new Avisos();
		  botao.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e){
				  Preco telVal = new Preco();
				String placaa = ""+ l1.getSelectedItem().toString()+ l2.getSelectedItem().toString()+ l3.getSelectedItem().toString()+ n1.getSelectedItem().toString()+ n2.getSelectedItem().toString() +n3.getSelectedItem().toString()+n4.getSelectedItem().toString();
		  		int diaa = Integer.parseInt((String) dias1.getSelectedItem().toString());
		  		int mess = Integer.parseInt((String) mes.getSelectedItem().toString());
		  		int anoo = Integer.parseInt((String) ano.getSelectedItem().toString());
		  		int hora = Integer.parseInt((String) horaa.getSelectedItem().toString());
		  		int minutos = Integer.parseInt((String) minuto.getSelectedItem().toString());
		  		int segundo = Integer.parseInt((String) segundos.getSelectedItem().toString());
		  		int i =controle.retirar(placaa, diaa, mess, anoo, hora, minutos, segundo);
				  janela.dispose();
				  if(i!=-1)
				  telVal.telaEncerra(controle.veiculos.get(i), i, controle);
				  else
					  telinha.telaPlacaNot(controle);
			  }
		  });
	  }
	 
	 
	 public void verifica(Control controle, String placa, String sel, int dia, int mes, int ano,int hora, int minuto, int segundo)
	 {
		 if(sel.equals("Moto"))
			 controle.inserirMoto(placa, dia, mes, ano, hora, minuto, segundo);
		 else
		 {
			 if(sel.equals("Caminhonete"))
				 controle.inserirCaminhonete(placa, dia, mes, ano, hora, minuto, segundo);
			 else
				 controle.inserirCarro(placa, dia, mes, ano, hora, minuto, segundo);
		 }
	 }
}
