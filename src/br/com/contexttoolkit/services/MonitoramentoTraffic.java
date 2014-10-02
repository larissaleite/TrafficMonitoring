package br.com.contexttoolkit.services;

import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;

public class MonitoramentoTraffic implements Monitoramento {

	private Widget trafficInput;
	private Widget trafficWidget;
	private Enactor trafficEnactor;
	private TrafficService trafficService;
	
	public MonitoramentoTraffic() {
		Discoverer.start();
		
		trafficInput = WidgetXmlParser.createWidget("resources/traffic-widget-input.xml");
		trafficWidget = WidgetXmlParser.createWidget("resources/traffic-widget-output.xml");
		trafficEnactor = EnactorXmlParser.createEnactor("resources/traffic-enactor.xml");
		
		trafficService = new TrafficService(trafficWidget);
		
		trafficWidget.addService(trafficService);
	}
	
	@Override
	public void atualizarInformacoes(String message) {
		String[] str = message.split("-");
		int via = Integer.parseInt(str[0]);
		int quantCarros = Integer.parseInt(str[1]);
		
		trafficInput.updateData("via", via);
		trafficInput.updateData("carros", quantCarros);
		trafficInput.updateData("notifications", true);
		trafficInput.updateData("notifications", false);
		
	}

}
