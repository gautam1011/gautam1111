
public class FlighBookingService {

	private PersonalService pservice;
	private ArlinesService  aservice;
	
	public PersonalService getPservice() {
		return pservice;
	}
	public void setPservice(PersonalService pservice) {
		this.pservice = pservice;
	}
	public ArlinesService getAservice() {
		return aservice;
	}
	public void setAservice(ArlinesService aservice) {
		this.aservice = aservice;
	}
	public String BookFlight(String userName, String airlineName);
	// check user Creditcard balamnve
	
	if(service.isPersonAcceptable(userName))
	{
		String flight =as.getAvaliableFlight(airlineName);
		System.out.println("now booking the flight for the user" +userName+" with flight" +flight);
		return "success";
	}
	return "fail";
}
