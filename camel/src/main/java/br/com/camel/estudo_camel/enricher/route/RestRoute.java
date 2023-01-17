package br.com.camel.estudo_camel.enricher.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().host("0.0.0.0").port(8083).bindingMode(RestBindingMode.auto);

        rest("/integration")
                .get("/authors")
                    .routeId("rest-all-authors")
                    .to("direct:call-rest-all")
                .get("/authors/{name}")
                    .routeId("rest-author-by-name")
                    .to("direct:call-rest-author");

    }
}
