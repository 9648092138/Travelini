package com.travelport.service.air_v45_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-08-23T13:38:11.088+05:30
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v45_0", name = "AirLowFareSearchAsynchPortType")
@XmlSeeAlso({com.travelport.schema.air_v45_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class, com.travelport.schema.common_v45_0.ObjectFactory.class, com.travelport.schema.rail_v45_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirLowFareSearchAsynchPortType {

    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    @WebResult(name = "LowFareSearchAsynchRsp", targetNamespace = "http://www.travelport.com/schema/air_v45_0", partName = "result")
    public com.travelport.schema.air_v45_0.LowFareSearchAsynchRsp service(
        @WebParam(partName = "parameters", name = "LowFareSearchAsynchReq", targetNamespace = "http://www.travelport.com/schema/air_v45_0")
        com.travelport.schema.air_v45_0.LowFareSearchAsynchReq parameters
    ) throws AirFaultMessage;
}
