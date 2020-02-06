package co.travelini.backendservices.mapper;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.travelini.backendservices.entity.FlightArrival;
import co.travelini.backendservices.entity.FlightDeparture;
import co.travelini.backendservices.entity.CatalogOffering;
import co.travelini.backendservices.entity.Flight;
import  co.travelini.backendservices.entity.FlightIntermediateStop;
import co.travelini.backendservices.entity.FlightReferenceList;
import co.travelini.backendservices.entity.Identifier;

import com.travelport.schema.air_v45_0.AirPricePoint;
import com.travelport.schema.air_v45_0.Brand;
import com.travelport.schema.air_v45_0.FareInfo;
import com.travelport.schema.air_v45_0.FlightDetails;
import com.travelport.schema.air_v45_0.LowFareSearchRsp;
import com.travelport.schema.air_v45_0.TypeBaseAirSegment;



/**
 * The Class ReferenceListMapper.
 */
@Component
public class ReferenceListMapper {

	
  
/**
   * Map reference list.
   *
   * @param airSegments the air segments
   * @return the list
   */
  public List<FlightReferenceList> mapReferenceList(List<TypeBaseAirSegment> airSegments) {
    List<FlightReferenceList> segmentsList = new ArrayList<FlightReferenceList>();

    segmentsList.add(setFlightReferenceList(airSegments));

    return segmentsList;
  }

  /**
   * Sets the reference list.
   *
   * @param airSegments the air segments
   * @return the reference list
   */
  private FlightReferenceList setFlightReferenceList(List<TypeBaseAirSegment> airSegments) {
    FlightReferenceList flights = new FlightReferenceList();

    flights.setType("ReferenceListFlight");
    flights.setFlight(mapFlightsList(airSegments));

    return flights;
  }

  /**
   * Map flights list.
   *
   * @param airSegments the air segments
   * @return the list
   */
  private List<Flight> mapFlightsList(List<TypeBaseAirSegment> airSegments) {
    List<Flight> flightsList = new ArrayList<Flight>();

    for (TypeBaseAirSegment airSegment : airSegments) {
      flightsList.add(setAirSegment(airSegment));
    }

    return flightsList;
  }

  /**
   * Sets the air segment.
   *
   * @param seg the seg
   * @return the flight
   */
  private Flight setAirSegment(TypeBaseAirSegment seg) {
    Flight flight = new Flight();
    flight.setId(seg.getKey());
    flight.setType("Flight");

    if (seg.getCodeshareInfo() != null) {
      flight.setOperatingCarrier(seg.getCodeshareInfo().getOperatingCarrier());
      flight.setOperatingCarrierName(seg.getCodeshareInfo().getValue());
    }

    flight.setFlightDeparture(mapDeparture(seg.getDepartureTime(), seg.getOrigin()));
    flight.setFlightArrival(mapArrival(seg.getArrivalTime(), seg.getDestination()));
    flight.setCarrier(seg.getCarrier());
    flight.setEquipment(Arrays.asList(seg.getEquipment()));
    flight.setNumber(seg.getFlightNumber());

    if (seg.getDistance() != null) {
      flight.setDistance(seg.getDistance().intValue());
    }

    flight.setDuration(Duration.ofMinutes(seg.getFlightTime().longValue()).toString());
    flight.setIntermediateStop(mapIntermediateStops(seg));

    return flight;
  }

  /**
   * Map arrival.
   *
   * @param arrivalTime the arrival time
   * @param destination the destination
   * @return the arrival
   */
  private FlightArrival mapArrival(String arrivalTime, String destination) {
    String arrivalTimeAndDate[] = arrivalTime.split("T");
    FlightArrival arrival = new FlightArrival();

    arrival.setType("Arrival");
    arrival.setTime(arrivalTimeAndDate[1]);
    arrival.setDate(arrivalTimeAndDate[0]);
    arrival.setLocation(destination);

    return arrival;
  }

  /**
   * Map departure.
   *
   * @param departureTime the departure time
   * @param origin the origin
   * @return the departure
   */
  private FlightDeparture mapDeparture(String departureTime, String origin) {
    String timeAndDate[] = departureTime.split("T");
    FlightDeparture departure = new FlightDeparture();

    departure.setType("Departure");
    departure.setLocation(origin);
    departure.setTime(timeAndDate[1]);
    departure.setDate(timeAndDate[0]);

    return departure;
  }

  /**
   * Map intermediate stops.
   *
   * @param seg the seg
   * @return the list
   */
  private List<FlightIntermediateStop> mapIntermediateStops(TypeBaseAirSegment seg) {
    List<FlightIntermediateStop> intermediateStops = null;

    if (seg.getNumberOfStops() != null && seg.getFlightDetails() != null) {
      intermediateStops = new ArrayList<FlightIntermediateStop>();
      for (FlightDetails flightDetail : seg.getFlightDetails()) {
        FlightIntermediateStop intermediateStop = new FlightIntermediateStop();
        intermediateStop
            .setDuration(Duration.ofMinutes(flightDetail.getGroundTime().longValue()).toString());
        intermediateStop.setValue(flightDetail.getDestination());
        intermediateStops.add(intermediateStop);
      }
    }

    return intermediateStops;
  }
}