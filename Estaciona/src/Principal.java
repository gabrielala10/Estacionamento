import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Principal implements Serializable{

	private static ObjectOutputStream output;
	
	public static void main (String args[])
	{

		Control controle;
		controle = Control.getControl();
		controle.criaLista();
		TelaPrincipal telaVagas = new TelaPrincipal();
			
		
		telaVagas.plantaBaixa(controle);		
	}
	
	public static void escrever(Control controle)
	{

		try {
			output = new ObjectOutputStream (new FileOutputStream("historico.ser"));
			output.writeObject(controle);
		}
		
		catch(IOException e){
			
		}
	}
	
	
}

