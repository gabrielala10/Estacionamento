import java.util.Scanner;
import javax.swing.JFrame;

public class Principal {

	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in); 
		Veiculo veiculos[] = new Veiculo[200];
		int i;
		
		TelaPrincipal telaVagas = new TelaPrincipal();
		
		for(i=0;i<200;i++)
		{
			veiculos[i] = new Veiculo();
		}
		
		telaVagas.plantaBaixa(veiculos);
		
		int totalCarros, totalMotos, totalCaminhonetes, sair;
		
	}
}
