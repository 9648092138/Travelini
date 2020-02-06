package com.travelport.service.hotel_v45_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-08-23T13:38:07.467+05:30
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/hotel_v45_0", name = "HotelSuperShopperServicePortType")
@XmlSeeAlso({com.travelport.schema.common_v45_0.ObjectFactory.class, com.travelport.schema.hotel_v45_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelSuperShopperServicePortType {

    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    @WebResult(name = "HotelSuperShopperRsp", targetNamespace = "http://www.travelport.com/schema/hotel_v45_0", partName = "result")
    public com.travelport.schema.hotel_v45_0.HotelSuperShopperRsp service(
        @WebParam(partName = "parameters", name = "HotelSuperShopperReq", targetNamespace = "http://www.travelport.com/schema/hotel_v45_0")
        com.travelport.schema.hotel_v45_0.HotelSuperShopperReq parameters
    ) throws HotelFaultMessage;
}
