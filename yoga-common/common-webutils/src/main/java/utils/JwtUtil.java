package utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.lang.reflect.Field;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    //自定义的秘钥
    private static String sect = "laisdjfoiwqjflksaasfdasdfadsfwfrasdfsadffcasijfasadfasfdlkfjlasjflksajfd";
    //生成token
    public static String createToken(Object value, Integer mil) throws Exception{
        //Key key = Keys.hmacShaKeyFor(sect.getBytes());
        Key key = Keys.hmacShaKeyFor(sect.getBytes());
        Map<String, Object> map = new HashMap<>();
        Class<?> c = value.getClass();
        Field[] fields = c.getDeclaredFields();
        if(fields != null && fields.length > 1){
            for(Field f : fields){
                f.setAccessible(true);
                try {
                    Object put = map.put(f.getName(), f.get(value));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    throw new RuntimeException("111");
                }
            }
        }
        return Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + mil * 60 * 1000))
                .signWith(key)
                .compact();

    }
    //解析token
    public static Claims parseToken(String token) throws Exception{
        Key key = Keys.hmacShaKeyFor(sect.getBytes());
        return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
    }

    public static void main(String[] args) throws Exception {
        Claims claims = parseToken("eyJhbGciOiJIUzUxMiJ9.eyJwaG9uZSI6IjExMSIsIm5hbWUiOiIxMTEiLCJleHAiOjE2MDM3MjQ1NTh9.3Ks4N9uJAD4oU-4kaRT0z0QCH8KTo4Uy34bsFwu_dnX_bQ1dPxyacZ9JrfYNqJV_YtEVx49tnGoYlJtAJz6IsQ");
        System.out.println(claims);
    }
}
