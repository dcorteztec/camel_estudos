package br.com.camel.estudo_camel.enricher.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;

import java.util.Map;

public class GetAuthorIdProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String author = exchange.getIn().getBody(String.class);
        JsonParser parser = JsonParserFactory.getJsonParser();
        Map<String, Object> jsonMap = parser.parseMap(author);
        String authorId = (String) jsonMap.get("id");

        exchange.getIn().setHeader("id", authorId);
        exchange.getIn().setBody(author);
    }
}
