import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Control implements Serializable{

	private static Control controle = null;
	ArrayList <Veiculo> veiculos = new ArrayList<>();
	ArrayList <Veiculo> historico = new ArrayList<>();
	public double valmoto = 0;
	public double valcaminhonete = 0;
	public double valcarro = 0;
	static int motos=0;
	static int carros=0;
	static int caminhonetes=0;
	static int ultimaVaga=0;
	int total=0;
	int totalConcluido = 0;
	int diaEntrada = -1;
	int diaSaida = -1;
	int inicio = 0;

	private Control(){}
	
	public static Control getControl()
	{
		if (controle==null){

			if(ler()==-1)
			{
				controle = new Control();
			}
		}
		return controle;
	}
	
	public ArrayList <Veiculo> getArrayList()
	{
		return veiculos;
	}
	
	/*public void limpar()
	{
		totalConcluido = 0;
		diaEntrada=-1;
		diaSaida=-1;
		valcarro = 0;
		valcaminhonete = 0;
		valmoto = 0;
		//historico.clear();
	}*/
	
	public void inserirMoto(String placa, int dia, int mes, int ano, int hora, int minuto, int segundo){
		int i, k=1;
		menor(dia,mes,ano);
		if(motos<20)
		for(i=0;i<=motos;i++)
		{
			if(veiculos.get(i).getConcluido()==1)
				{
					if(verificaPlaca(placa, total)==-1)
					{
						ultimaVaga=i;
						veiculos.get(i).estaciona(placa,dia,mes,hora,minuto,segundo,ano);
						total++;
						motos++;
						k=0;
						break;
					}
					//else: break essa placa já existe.
				}
			
		}
		if(k==1)
		{	ultimaVaga = -1;
			if(verificaPlaca(placa, total)==-1)
			ultimaVaga = -2;
		}
		escrever();
	}
	
	public void inserirCaminhonete(String placa, int dia, int mes, int ano, int hora, int minuto, int segundo){
		int i, k = 1;
		menor(dia,mes,ano);
		if(caminhonetes<20)
		for(i=20;i<=20+caminhonetes;i++)
		{
			if(veiculos.get(i).getConcluido()==1)
				{
					if(verificaPlaca(placa, total)==-1)
					{
						ultimaVaga=i;
						veiculos.get(i).estaciona(placa,dia,mes,hora,minuto,segundo,ano);
						total++;
						caminhonetes++;
						k=0;
						
						break;
					}
					//else: break essa placa já existe.
				}
			
		}
		if(k==1)
		{	ultimaVaga = -1;
		if(verificaPlaca(placa, total)==-1)
		ultimaVaga = -2;
		}
		escrever();
	}
	
	public void inserirCarro(String placa, int dia, int mes, int ano, int hora, int minuto, int segundo){
		int i, k = 1;
		menor(dia,mes,ano);
		if(carros<160)
		for(i=40;i<=40+carros;i++)
		{
			if(veiculos.get(i).getConcluido()==1)
				{
					if(verificaPlaca(placa, total)==-1)
					{
						ultimaVaga=i;
						veiculos.get(i).estaciona(placa,dia,mes,hora,minuto,segundo,ano);
						total++;
						carros++;
						k=0;
						break;
					}
					//else: break essa placa já existe.
				}
			
		}
		if(k==1)
		{	ultimaVaga = -1;
		if(verificaPlaca(placa, total)==-1)
		ultimaVaga = -2;
		}
		escrever();
	}
	
	public void alterarPreco(double valor, String tipo){
		int i;
		if(tipo.equals("Moto"))
		for(i=0;i<=20;i++)
			veiculos.get(i).setPreco(valor);
		else {
			if(tipo.equals("Caminhonete"))
				for(i=20;i<=40;i++)
					veiculos.get(i).setPreco(valor);
			else
				if(tipo.equals("Carro"))
				for(i=40;i<=200;i++)
					veiculos.get(i).setPreco(valor);
		}

		//else: tela de sem vagas
	}
	
	public int verificaPlaca(String placa, int totEst)
	{
		int i, k=0;
		for(i = 0; i<200 && k<totEst;i++)
		{
			if(veiculos.get(i).getConcluido()==0)
			{
				if(placa.equals(veiculos.get(i).getPlaca()))
					return i;
				k++;
			}
		}
		return -1;
	}
	
	public int retirar(String placa, int dia, int mes, int ano, int hora, int minuto, int segundo){
		int k =verificaPlaca(placa, total);
		int i = -1, c=0,cm=0,m=0;
		if(k!=-1)
		{
			if(k<20)
				{
				motos--;
				veiculos.get(k).setPreco(valmoto);
				m=1;
				}
			else {
				if(k<40)
				{
					caminhonetes--;
					veiculos.get(k).setPreco(valcaminhonete);
					cm=1;
					}
				else
				{
					carros--;
					veiculos.get(k).setPreco(valcarro);
					c=1;
					}
			}
			total--;
			totalConcluido++;
			maior(dia,mes,ano);
			i = veiculos.get(k).retirarVeiculo(dia, mes, hora, segundo, ano, minuto, k);
			if(i!=-2)
			{historico.add(new Veiculo(veiculos.get(i)));
			total--;
			totalConcluido++;
			}
			else
			{
				if(c==1)
					carros++;
				else
				{
					if(m==1)
						motos++;
					else
						caminhonetes++;
				}
				total++;
				totalConcluido--;
			}
		}
		escrever();
		return i;
		//else: veiculo não esta estacionado
	}
	
	public void menor(int dia, int mes, int ano)
	{
		if(diaEntrada==-1)
			diaEntrada = dia + mes*31 + ano*365;
		else
			if(diaEntrada>(dia + mes*31 + ano*365))
				diaEntrada = dia + mes*31 + ano*365;
	}
	
	public void maior(int dia, int mes, int ano)
	{
		if(diaSaida==-1)
			diaSaida = dia + mes*31 + ano*365;
		else
			if(diaSaida<(dia + mes*31 + ano*365))
				diaSaida = dia + mes*31 + ano*365;
	}
	
	public static void escrever()
	{

		try {
			ObjectOutput output = new ObjectOutputStream (new FileOutputStream("historico.ser"));
			output.writeObject(controle);
			output.close();
		}
		
		catch(IOException e){
			System.out.println("Erro");
			e.printStackTrace();
		}
	}
	
	public static int ler()
	{
		try {
			ObjectInput input = new ObjectInputStream  (new FileInputStream("historico.ser"));
			controle = (Control) input.readObject();
			input.close();
			return 1;
		}
		
		catch(IOException|ClassNotFoundException e){
			return -1;
		}
	}
	
	public void criaLista()
	{
		int i;
		if(motos==0&&carros==0&&caminhonetes==0)
			for(i=inicio;i<200;i++)
			{
				veiculos.add(new Veiculo());
			}
		inicio = 200;
	}
	
}
