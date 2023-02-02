package br.com.camel.estudo_camel.choice.bean;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class ZipCodeBean {

    public static boolean getZipCode(Exchange exchange) {

        return "72539-7005".equals(exchange.getIn().getBody());
    }
}
