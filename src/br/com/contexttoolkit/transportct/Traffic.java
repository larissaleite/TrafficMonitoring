package br.com.contexttoolkit.transportct;

import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class Traffic {
	
	private static Monitoramento monitoramento;
	
	public Traffic() {
		monitoramento = new MonitoramentoTraffic();
	}

	public static void main(String[] args) {
		
		new Traffic();
		
		monitoramento.atualizarInformacoes("1-10");
		monitoramento.atualizarInformacoes("1-5");
		monitoramento.atualizarInformacoes("2-15");
		monitoramento.atualizarInformacoes("2-2");
		monitoramento.atualizarInformacoes("3-10");
		monitoramento.atualizarInformacoes("4-13");
		monitoramento.atualizarInformacoes("5-30");
		monitoramento.atualizarInformacoes("4-2");
		monitoramento.atualizarInformacoes("3-20");
		
	}

}
