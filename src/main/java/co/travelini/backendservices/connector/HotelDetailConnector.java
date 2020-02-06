package co.travelini.backendservices.connector;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.travelport.schema.hotel_v45_0.BaseHotelSearchReq;
import com.travelport.schema.hotel_v45_0.BaseHotelSearchRsp;
import com.travelport.schema.hotel_v45_0.HotelDetailsReq;
import com.travelport.schema.hotel_v45_0.HotelDetailsRsp;
import com.travelport.schema.hotel_v45_0.HotelSearchAvailabilityReq;
import com.travelport.service.hotel_v45_0.HotelDetailsServicePortType;
import com.travelport.service.hotel_v45_0.HotelFaultMessage;
import com.travelport.service.hotel_v45_0.HotelSearchServicePortType;
import com.travelport.service.hotel_v45_0.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * The Class AirSearchConnector.
 */
@Component
public class HotelDetailConnector {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(HotelDetailConnector.class);

  /** The username. */
  @Value("${air.username}")
  private String username;

  /** The password. */
  @Value("${air.password}")
  private String password;

  /** The endpoint. */
  @Value("${air.endpoint}")
  private String endpoint;

  /** The branch. */
  @Value("${air.branch}")
  private String branch;

  /** The air shop. */
  public HotelDetailsServicePortType hotelShop;
  
  /** The air. */
  public HotelService hotel;

  /**
   * Instantiates a new air search connector.
   */
  @Autowired
  public HotelDetailConnector() {
    this.hotel = new HotelService();
    this.hotelShop = hotel.getHotelDetailsServicePort();
  }

  /**
   * Air search connector.
   *
   * @param lfsRequest the lfs request
   * @return the low fare search rsp
   */
  public HotelDetailsRsp hotelDetailConnector(HotelDetailsReq detailRequest) {
	  HotelDetailsRsp lfsResponse = new HotelDetailsRsp();
	  addParametersToProvider((BindingProvider) hotelShop);

 // Marshaling Employee object to XML using JAXB
    JAXBContext ctx = null;
    StringWriter writer = new StringWriter();

    try{
        ctx = JAXBContext.newInstance(HotelDetailsReq.class);
        ctx.createMarshaller().marshal(detailRequest, writer);
        System.out.println("Hotal Detail Request object as XML");
        System.out.println(writer);
  
    }catch(JAXBException ex){
        ex.printStackTrace();
    }
    
    try {
		lfsResponse = hotelShop.service(detailRequest);
	} catch (HotelFaultMessage e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return lfsResponse;
  }

  /**
   * Adds the parameters to provider.
   *
   * @param provider the provider
   */
  private void addParametersToProvider(BindingProvider provider) {
    LOG.debug("Username: " + username);
    LOG.debug("Password: " + password);
    LOG.debug("Endpoint: " + endpoint);
    LOG.debug("Branch: " + branch);

    provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint+"HotelService");
    provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
    provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
//    provider.getRequestContext().put("", value)
    provider.getRequestContext().put("schema-validation-enabled", "false");
//    provider.getRequestContext().put(BindingProvider.SOAPACTION_USE_PROPERTY, "1G");
  }
}