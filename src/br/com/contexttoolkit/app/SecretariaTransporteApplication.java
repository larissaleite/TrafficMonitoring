package br.com.contexttoolkit.app;

import br.com.contexttoolkit.services.AtualizacaoCongestionamento;

public class SecretariaTransporteApplication implements AtualizacaoCongestionamento {
	
	private static SecretariaTransporteApplication instance = null;
	
	private SecretariaTransporteApplication() {
	}
	
	public static synchronized SecretariaTransporteApplication getInstance() {
		if (instance == null) {
			instance = new SecretariaTransporteApplication();
		}
		return instance;
	}

	@Override
	public void atualizar(int via, int quantCarros, boolean isAccident) {
		System.out.println("Via "+via+"  Carros: "+quantCarros);
		
	}
	

}
