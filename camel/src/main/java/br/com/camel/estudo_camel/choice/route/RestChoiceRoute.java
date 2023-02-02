package br.com.camel.estudo_camel.choice.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestChoiceRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //restConfiguration().host("0.0.0.0").port(8083).bindingMode(RestBindingMode.auto);

        rest("/integration_choice")
                .get("/book")
                .routeId("conditional-book")
                .to("direct:call-rest-book1");
    }
}
