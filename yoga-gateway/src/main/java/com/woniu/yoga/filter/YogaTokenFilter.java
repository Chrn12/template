package com.woniu.yoga.filter;

import com.woniu.yoga.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Component
public class YogaTokenFilter implements GlobalFilter {
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //获取令牌
        String token = exchange.getRequest().getHeaders().get("yogaToken").get(0);
        if(token==null){
            throw new RuntimeException("未登录");
        }
        try {
            Claims claims =  JwtUtil.parseToken(token);
        } catch (ExpiredJwtException e) {
            e.printStackTrace();
            throw new RuntimeException("令牌过期");
        } catch(MalformedJwtException e){
            e.printStackTrace();
            throw new RuntimeException("令牌不合法");
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("未知错误");
        }
        return chain.filter(exchange);
    }
}
