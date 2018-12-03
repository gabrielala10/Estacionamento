
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
	private int tipo;
	private int vaga;
	private double valorTotal;
	
	public Veiculo()
	{
		concluido = 1;
	}
	
	public void Estaciona(String placa, int tipo, int diaEntrada, int mesEntrada, int horaEntrada, int minutoEntrada, int segundoEntrada, int anoEntrada, int vaga)
	{
		this.placa = placa;
		this.tipo = tipo;
		this.anoEntrada = anoEntrada;
		this.mesEntrada = mesEntrada;
		this.diaEntrada = diaEntrada;
		this.horaEntrada = horaEntrada;
		this.minutoEntrada = minutoEntrada;
		this.segundoEntrada = segundoEntrada;
		this.vaga = vaga;
		concluido = 0;
	}
	
	public String getPlaca()
	{
	 return placa;
	}
	
	public int getVaga()
	{
		return vaga;
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
	
	public int getTipo()
	{
	 return tipo;
	}
	
	public int getConcluido()
	{
	 return concluido;
	}
	
	public double retirarVeiculo(int diaSaida, int mesSaida, int horaSaida, int segundoSaida, int anoSaida, int minutoSaida, double valor)
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
		
		segundos = segundos + minutos * 60 + (int)horas * 360 + dias*24*360 + meses*31*24*360 + anos*365*24*360;
		
		horas = segundos / 360;
		concluido = 1;
		
		valorTotal = valor * horas;
		
		return valor*horas;	
	}
}
