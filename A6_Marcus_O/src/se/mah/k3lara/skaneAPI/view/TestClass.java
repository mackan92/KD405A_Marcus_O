package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class TestClass {
	

	public static void main(String[] args) {
		//Hämtar de angivna destinationerna.
		String searchURL = Constants.getURL("80000","81216",20); //Malmö C = 80000,  Lund C, 81216 Malmö Gatorg 80100, Hässleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		//Skriver ut destinationer och vilken tid tåget kommer. Skriver även ut om tåget är försenat eller inte.
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs to " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
		
	   System.out.println("// Stations when searching for stations containing \"Malm\"");
	   //Skriver ut en lista över de stationer man har sökt på.
		ArrayList<Station> searchStations = new ArrayList<Station>(); 
		//Skriver ut vilka koder det är för de olika stationer som innehåller "Malm".
		searchStations.addAll(Parser.getStationsFromURL("Malm"));
		for (Station s: searchStations){
			System.out.println(s.getStationName() +" number:" +s.getStationNbr());
		}
		
		System.out.println("// Busses departing from Ub�tshallen stationsnummer 80046 ");
		Lines lines = Parser.getStationResults(new Station("80046"));
		for (Line l : lines.getLines()) {
			System.out.println("Line " + l.getLine() +" departs: "+l.getDepTime().get(Calendar.HOUR_OF_DAY)+":"+l.getDepTime().get(Calendar.MINUTE)+
					" and is "+l.getDepTimeDeviation()+" minutes late");
		}
	}
}

