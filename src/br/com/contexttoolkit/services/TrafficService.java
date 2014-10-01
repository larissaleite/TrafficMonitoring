package br.com.contexttoolkit.services;

import br.com.contexttoolkit.app.SecretariaTransporteApplication;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;

public class TrafficService extends Service {
	
	private SecretariaTransporteApplication secretariaTransporte;

	@SuppressWarnings("serial")
	public TrafficService(final Widget widget) {
		super(widget, "TrafficService", 
				new FunctionDescriptions() {
				{ // constructor
				// define function for the service
				add(new FunctionDescription(
						"trafficControl", 
						"quantidade de carros", 
						widget.getNonConstantAttributes()));
				}
		});	
	}
	
	@Override
	public DataObject execute(ServiceInput input) {
		
		secretariaTransporte = SecretariaTransporteApplication.getInstance();
		
		String message = input.getInput().getAttributeValue("message");
		
        String valores[] = message.split("-");
        secretariaTransporte.atualizar(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), false);
  
		return null;
	}

}
