package br.com.contexttoolkit.app;

import br.com.contexttoolkit.services.AtualizacaoAcidente;

public class SAMUApplication implements AtualizacaoAcidente {

	private static SAMUApplication instance = null;
	
	private SAMUApplication() {
	}
	
	public static synchronized SAMUApplication getInstance() {
		if (instance == null) {
			instance = new SAMUApplication();
		}
		return instance;
	}
		
	@Override
	public void atualizar(int via, String situacao) {
		System.out.println("Via "+via+" - "+situacao);
	}

}
