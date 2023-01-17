package br.com.camel.estudo_camel.file.route;

import br.com.camel.estudo_camel.file.processor.FileProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    private String path = "/home/david/Documentos/estudos_java/camel/src/main/resources/static";

    @Override
    public void configure() throws Exception {
        from("file://"+path+"/input")
                .log("${file:name}")
                //.bean("fileComponent")
                //.process(new FileProcessor())
                .to("file://"+path+"/output");
    }
}
