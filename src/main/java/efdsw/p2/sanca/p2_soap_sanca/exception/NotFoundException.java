package efdsw.p2.sanca.p2_soap_sanca.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM,
        customFaultCode = "{http://www.sanca.p2.efdsw/ws}001")
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message){
        super(message);
    }

}