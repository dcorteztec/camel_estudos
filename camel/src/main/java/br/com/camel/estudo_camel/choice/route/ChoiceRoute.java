package br.com.camel.estudo_camel.choice.route;

import br.com.camel.estudo_camel.choice.bean.ZipCodeBean;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ChoiceRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:call-rest-book1")
                .routeId("get-book")
                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .to("http://{{books.url}}/books")
                .split().jsonpath("$.[?(@.id == 11)]")
                    .to(ExchangePattern.InOnly,"activemq:queue-book-1")
                //.choice()
                //    .when().jsonpath("$.[?(@.id == 11)]")
                //    .to(ExchangePattern.InOnly,"activemq:queue-book-1")
                //    .log("ID EQUAL")
                //.otherwise()
                //    .to(ExchangePattern.InOnly,"activemq:queue-book-2")
                //    .log("ID NOT EQUAL")
                ///.endChoice()
                .end();
    }
}
