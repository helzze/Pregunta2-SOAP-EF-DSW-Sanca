package efdsw.p2.sanca.p2_soap_sanca.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class ClienteWsdlConfig {

    @Bean(name = "clientes")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema clienteSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ClientePort");
        definition.setLocationUri("/ws/clientes");
        definition.setTargetNamespace("http://www.sanca.p2.efdsw/ws/objects");
        definition.setSchema(clienteSchema);
        return definition;
    }

    @Bean
    public XsdSchema clienteSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/cliente.xsd"));
    }
}
