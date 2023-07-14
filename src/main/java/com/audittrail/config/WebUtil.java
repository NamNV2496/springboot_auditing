package com.audittrail.config;

import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WebUtil {

    private final HttpServletRequest request;

    public String getToken() throws ParseException {
        String token = request.getHeader("authorization");
        if (Objects.isNull(token)) {
            return "system";
        }
        token = token.substring(7);
        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();

        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));

        JSONParser parser = new JSONParser(payload);
        Object json = parser.parse();
        System.out.println(json);
        return ((LinkedHashMap) json).get("name").toString();
    }
}
