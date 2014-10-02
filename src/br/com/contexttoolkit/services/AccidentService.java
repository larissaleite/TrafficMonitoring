package br.com.contexttoolkit.services;

import br.com.contexttoolkit.app.SAMUApplication;
import br.com.contexttoolkit.app.SecretariaTransporteApplication;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;

public class AccidentService extends Service {
	
	private SecretariaTransporteApplication secretariaTransporte;
	private SAMUApplication samuApp;

	@SuppressWarnings("serial")
	public AccidentService(final Widget widget) {
		super(widget, "AccidentService", 
				new FunctionDescriptions() {
				{ // constructor
				// define function for the service
				add(new FunctionDescription(
						"accidentControl", 
						"quantidade de carros", 
						widget.getNonConstantAttributes()));
				}
		});	
	}
	
	@Override
	public DataObject execute(ServiceInput input) {
		
		secretariaTransporte = SecretariaTransporteApplication.getInstance();
		samuApp = SAMUApplication.getInstance();
		
		String message = input.getInput().getAttributeValue("message");
		
        String valores[] = message.split("-");
        secretariaTransporte.atualizar(Integer.parseInt(valores[1]), valores[0]);
        samuApp.atualizar(Integer.parseInt(valores[1]), valores[0]);
        
		return null;
	}

}
