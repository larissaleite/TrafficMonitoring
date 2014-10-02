package br.com.contexttoolkit.services;

import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;

public class MonitoramentoAcidente implements Monitoramento {
	
	private Widget accidentInput;
	private Widget accidentWidget;
	private Enactor accidentEnactor;
	private AccidentService accidentService;
	
	public MonitoramentoAcidente() {
		Discoverer.start();
		
		accidentInput = WidgetXmlParser.createWidget("resources/accident-widget-input.xml");
		accidentWidget = WidgetXmlParser.createWidget("resources/accident-widget-output.xml");
		accidentEnactor = EnactorXmlParser.createEnactor("resources/accident-enactor.xml");
		
		accidentService = new AccidentService(accidentWidget);
		
		accidentWidget.addService(accidentService);
	}

	@Override
	public void atualizarInformacoes(String message) {
		
		String[] str = message.split("-"); 

		boolean isAccident = Boolean.parseBoolean(str[0]);
		int via = Integer.parseInt(str[1]);
		
		accidentInput.updateData("via", via);
		accidentInput.updateData("isAccident", isAccident);
		accidentInput.updateData("notifications", true);
		accidentInput.updateData("notifications", false);
		
	}

}
