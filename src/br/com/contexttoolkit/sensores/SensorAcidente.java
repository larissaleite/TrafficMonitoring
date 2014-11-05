package br.com.contexttoolkit.sensores;

import java.util.Random;

import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class SensorAcidente {

	private Random rand;
	
    public void gerarDados(MonitoramentoAcidente monitoramentoAcidente) {
    	rand = new Random();
    	
        for (int i = 0; i < 10; i++) {
            /* ((max - min) + 1) + min */
        	int via = rand.nextInt(7) + 1;
        	boolean acidente = rand.nextBoolean();
        	
        	System.out.println("gerador --- "+via+"--"+acidente);
        	monitoramentoAcidente.atualizarInformacoes(Boolean.toString(acidente)+"-"+Integer.toString(via));
        	
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        
    }
    
}
