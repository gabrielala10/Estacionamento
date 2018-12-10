import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Historico {
	JFrame janela;
	
	public void exibir(Control controle)
	{
		int i;
		double tot = 0;
		janela = new JFrame("Histórico");
	    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    JTextArea textos = new JTextArea();
	    for(i=0;i<controle.totalConcluido;i++)
	    {
	    	textos.append("Placa: "+controle.historico.get(i).getPlaca()+"\n");
	    	textos.append("Data de entrada: "+controle.historico.get(i).getDia()+"/"+controle.historico.get(i).getMes()+"/"+controle.historico.get(i).getAno()+"\n");
	    	textos.append("Hora de entrada: "+controle.historico.get(i).getHora()+":"+controle.historico.get(i).getMinuto()+":"+controle.historico.get(i).getSegundo()+"\n");
	    	textos.append("Data de saída: "+controle.historico.get(i).getDiaSaida()+"/"+controle.historico.get(i).getMesSaida()+"/"+controle.historico.get(i).getAnoSaida()+"\n");
	    	textos.append("Hora de saída: "+controle.historico.get(i).getHoraSaida()+":"+controle.historico.get(i).getMinutoSaida()+":"+controle.historico.get(i).getSegundoSaida()+"\n");
	    	textos.append("Valor pago: R$ "+controle.historico.get(i).getValorTotal()+"\n");
	    	textos.append("-------------------------------------------------------------------\n");
	    	tot+=controle.historico.get(i).getValorTotal();
	    }
	    textos.append("-------------------------------------------------------------------\n");
	    textos.append("Total recebido: R$ "+tot+"\n");
	    i = controle.diaSaida - controle.diaEntrada;
	    textos.append("Dias trabalhados: "+i+"\n");
	    i = controle.totalConcluido;
	    textos.append("Clientes atendidos: "+i+"\n");
	    
	    textos.setEditable(false);
	    
	    JScrollPane rolagem = new JScrollPane(textos);
	    rolagem.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    textos.setSize(400,350);
	    
	    janela.setSize(400, 350);
	    janela.setLocationRelativeTo(null);
	    janela.setVisible(true);
	    
	    janela.add(rolagem);
	    
	      
	}
}
