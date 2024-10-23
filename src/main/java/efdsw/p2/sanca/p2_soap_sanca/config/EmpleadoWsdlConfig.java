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
public class EmpleadoWsdlConfig {

    @Bean(name = "empleados")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema empleadoSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("EmpleadoPort");
        definition.setLocationUri("/ws/empleados");
        definition.setTargetNamespace("http://www.sanca.p2.efdsw/ws/objects");
        definition.setSchema(empleadoSchema);
        return definition;
    }

    @Bean
    public XsdSchema empleadoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/empleado.xsd"));
    }
}
