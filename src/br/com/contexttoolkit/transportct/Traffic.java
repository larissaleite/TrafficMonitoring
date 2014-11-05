package br.com.contexttoolkit.transportct;

import context.arch.discoverer.Discoverer;
import br.com.contexttoolkit.sensores.SensorAcidente;
import br.com.contexttoolkit.sensores.SensorCarros;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;


public class Traffic {
	
	private static Monitoramento monitoramentoTraffic;
	private static Monitoramento monitoramentoAccident;
	
	public Traffic() {
	}

	public static void main(String[] args) {
		
		Discoverer.start();
		
		monitoramentoTraffic = new MonitoramentoTraffic();
		monitoramentoAccident = new MonitoramentoAcidente();
		
		System.out.println();
		
		SensorCarros sensor = new SensorCarros();
		sensor.gerarDados((MonitoramentoTraffic)monitoramentoTraffic);
		
		SensorAcidente sensorAcidente = new SensorAcidente();
		sensorAcidente.gerarDados((MonitoramentoAcidente) monitoramentoAccident);
	}

}
