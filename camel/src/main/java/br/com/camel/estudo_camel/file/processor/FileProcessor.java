package br.com.camel.estudo_camel.file.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Processor "+ exchange.getIn().getBody());
    }
}
