
import java.io.Serializable;

public class Veiculo implements Serializable{
	private int diaEntrada;
	private int segundoEntrada;
	private int minutoEntrada;
	private int horaEntrada;
	private int mesEntrada;
	private int anoEntrada;
	
	private int diaSaida;
	private int segundoSaida;
	private int minutoSaida;
	private int horaSaida;
	private int mesSaida;
	private int anoSaida;

	private int concluido;
	private String placa;
	private double preco;
	private double valorTotal;
	
	public Veiculo()
	{
		concluido = 1;
	}
	
	public Veiculo(Veiculo veic)
	{
		placa = veic.getPlaca();
		anoEntrada = veic.getAno();
		mesEntrada = veic.getMes();
		diaEntrada = veic.getDia();
		horaEntrada = veic.getHora();
		minutoEntrada = veic.getMinuto();
		segundoEntrada = veic.getSegundo();
		anoSaida = veic.getAnoSaida();
		mesSaida = veic.getMesSaida();
		diaSaida = veic.getDiaSaida();
		horaSaida = veic.getHoraSaida();
		minutoSaida = veic.getMinutoSaida();
		segundoSaida = veic.getSegundoSaida();
		concluido = 1;
		preco = veic.getPreco();
		valorTotal = veic.getValorTotal();	
	}
	
	public void estaciona(String placa, int diaEntrada, int mesEntrada, int horaEntrada, int minutoEntrada, int segundoEntrada, int anoEntrada)
	{
		this.placa = placa;
		this.anoEntrada = anoEntrada;
		this.mesEntrada = mesEntrada;
		this.diaEntrada = diaEntrada;
		this.horaEntrada = horaEntrada;
		this.minutoEntrada = minutoEntrada;
		this.segundoEntrada = segundoEntrada;
		concluido = 0;
	}
	
	public String getPlaca()
	{
	 return placa;
	}
	
	public int getDia()
	{
	 return diaEntrada;
	}
	
	public int getAno()
	{
	 return anoEntrada;
	}
	
	public int getHora()
	{
	 return horaEntrada;
	}
	
	public int getMinuto()
	{
	 return minutoEntrada;
	}
	
	public int getSegundo()
	{
	 return segundoEntrada;
	}
	
	public int getMes()
	{
	 return mesEntrada;
	}
	
	public int getDiaSaida()
	{
	 return diaSaida;
	}
	
	public int getAnoSaida()
	{
	 return anoSaida;
	}
	
	public int getHoraSaida()
	{
	 return horaSaida;
	}
	
	public int getMinutoSaida()
	{
	 return minutoSaida;
	}
	
	public int getSegundoSaida()
	{
	 return segundoSaida;
	}
	
	public int getMesSaida()
	{
	 return mesSaida;
	}
	
	public double getValorTotal()
	{
	 return valorTotal;
	}
	
	
	public int getConcluido()
	{
	 return concluido;
	}
	
	public double getPreco()
	{
	 return preco;
	}
	
	public void setPreco(double preco)
	{
	 this.preco = preco;
	}
	
	public int retirarVeiculo(int diaSaida, int mesSaida, int horaSaida, int segundoSaida, int anoSaida, int minutoSaida, int i)
	{
		int meses, dias = 0, minutos, segundos, anos = 0;
		double horas;
		int mesEntrada = this.mesEntrada;
		
		this.anoSaida = anoSaida;
		this.mesSaida = mesSaida;
		this.diaSaida = diaSaida;
		this.horaSaida = horaSaida;
		this.minutoSaida = minutoSaida;
		this.segundoSaida = segundoSaida;
	
		if(anoSaida > anoEntrada)
		{
			anos = anoSaida - anoEntrada;
		}
			while(mesEntrada < mesSaida)
			{
				if(mesEntrada == 2)
					dias -= 3;
				if(mesEntrada == 4 || mesEntrada == 6 || mesEntrada == 9 || mesEntrada == 11)
					dias -= 3;
				mesEntrada++;
			}
			
		meses = mesSaida - this.mesEntrada;
		dias = dias + diaSaida - diaEntrada;
		horas = horaSaida - horaEntrada;
		minutos = minutoSaida - minutoEntrada;
		segundos = segundoSaida - segundoEntrada;
		
		segundos = segundos + minutos * 60 + (int)horas * 3600 + dias*24*3600 + meses*31*24*3600 + anos*31*12*24*3600;
		
		horas = (double)segundos / 3600;
		concluido = 1;
		
		valorTotal = horas * preco;	
		if(horas>0)
			return i;
		else
			concluido = 0;
			return -2;
	}
	
}
