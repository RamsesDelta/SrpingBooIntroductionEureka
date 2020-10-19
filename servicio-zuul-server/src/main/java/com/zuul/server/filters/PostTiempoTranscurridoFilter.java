package com.zuul.server.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostTiempoTranscurridoFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(PostTiempoTranscurridoFilter.class);

	//para validar en la ruta es decir si existe un param en el request 
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		RequestContext ctx  = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		log.info("Entrando a  post filter ");
		
		Long tiempoInicio = (Long) (request.getAttribute("tiempoInicio"));
		Long tiempoFinal = System.currentTimeMillis();
		Long tiempoTranscurrido = tiempoFinal - tiempoInicio;
		
		log.info(String.format("tiempo transcurrido  en segundos", tiempoTranscurrido.doubleValue()/10000.00));
		log.info(String.format("tiempo transcurrido  en mileseg", tiempoTranscurrido));
		
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
