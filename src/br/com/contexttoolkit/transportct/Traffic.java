package br.com.contexttoolkit.transportct;

import context.arch.discoverer.Discoverer;
import br.com.contexttoolkit.sensores.SensorCarros;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoTraffic;


public class Traffic {
	
	
	public Traffic() {
	}

	public static void main(String[] args) {
		
		Monitoramento monitoramentoTraffic;
		Discoverer.start();
		monitoramentoTraffic = new MonitoramentoTraffic();
		System.out.println();
		SensorCarros sensor = new SensorCarros();
		sensor.gerarDados((MonitoramentoTraffic)monitoramentoTraffic);
	}

}
