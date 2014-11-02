package br.com.contexttoolkit.sensores;

import java.util.Random;

import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class SensorCarros {
	
	private Random rand;
	
    public void gerarDados(MonitoramentoTraffic monitoramentoTraffic) {
    	rand = new Random();
    	
        for (int i = 0; i < 10; i++) {
            /* ((max - min) + 1) + min */
        	int via = rand.nextInt(7) + 1;
        	int carros = rand.nextInt(51);
        	
        	System.out.println("gerador --- "+via+"--"+carros);
        	monitoramentoTraffic.atualizarInformacoes(Integer.toString(via)+"-"+Integer.toString(carros));
        	
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        
    }

}
