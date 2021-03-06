
package com.owl_ontologies.ecsdiservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Centre2Service", targetNamespace = "http://www.owl-ontologies.com/ECSDIServices", wsdlLocation = "file:/Users/clara/Dropbox/ECSDI/Practica/WSDL/Centre2Service.wsdl")
public class Centre2Service
    extends Service
{

    private final static URL CENTRE2SERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.owl_ontologies.ecsdiservices.Centre2Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.owl_ontologies.ecsdiservices.Centre2Service.class.getResource(".");
            url = new URL(baseUrl, "file:/Users/clara/Dropbox/ECSDI/Practica/WSDL/Centre2Service.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/Users/clara/Dropbox/ECSDI/Practica/WSDL/Centre2Service.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CENTRE2SERVICE_WSDL_LOCATION = url;
    }

    public Centre2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Centre2Service() {
        super(CENTRE2SERVICE_WSDL_LOCATION, new QName("http://www.owl-ontologies.com/ECSDIServices", "Centre2Service"));
    }

    /**
     * 
     * @return
     *     returns Centre2PortType
     */
    @WebEndpoint(name = "Centre2Port")
    public Centre2PortType getCentre2Port() {
        return super.getPort(new QName("http://www.owl-ontologies.com/ECSDIServices", "Centre2Port"), Centre2PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Centre2PortType
     */
    @WebEndpoint(name = "Centre2Port")
    public Centre2PortType getCentre2Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.owl-ontologies.com/ECSDIServices", "Centre2Port"), Centre2PortType.class, features);
    }

}
