package com.woniu.yoga.handler;

import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.http.MediaType;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class MyErroHandler implements ErrorWebExceptionHandler{

	@Override
	public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
		if(exchange.getResponse().isCommitted()) {
			return Mono.error(ex);
		}
		exchange.getResponse().getHeaders().setContentType(MediaType.APPLICATION_JSON);
		String json = "{\"code\":500,\"msg\":\""+ex.getMessage()+"\"}";
		return exchange.getResponse().writeWith(Mono.fromSupplier(()->{
			return exchange.getResponse().bufferFactory().wrap(json.getBytes());
		}));
	}

}
