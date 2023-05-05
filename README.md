# FinalExam311
Write a Java program using any of the data structures you think are appropriate and will have the least possible time complexity for the required solution to be implemented for the problem given below:

Implement a flight booking application.
A booking will have the traveller’s details and origin and destination airports.
Each flight will have an origin airport, a destination airport, flight date, start time and duration of light.
The App may have to book multiple flights to reach the destination.
A booking can be for a one-way or a return ticket.
The App can choose a set of flights given that previous flight’s reaching time and next flight’s start time have at least 60 minutes difference.
Assume all available flights are starting and reaching in a single day. You may use date as an integer considering the travel taking place in the same month and same year. You may use start time in 24 hours format with hours and minutes, for example: startTime 1430 is 2:30pm.
Every flight fare is calculated based on hours of air-time completed by the set flights used to reach destination and the hourly rate is USD 100.
Provide multiple routes to the traveller.
Based on option selected book the ticket and print itinerary with the fare amount.
Generate testcases for different scenarios.
Classes can be defined as but are not mandatory :
Traveller
Attributes: Name, travellerID
Methods: to be designed
Airport
Attributes: airportID, airportName
Methods: to be designed
Flight
Attributes: flightID, flightDate, OrigAirport, DestAirport, StartTime, Duration
Methods: to be designed
Booking
Attributes: Traveller, travelDate, OrigAirport, DestAirport
Methods: to be designed
Itinerary
Attributes: Booking, ArrayList<Flight> flights
Methods: to be designed
App_BookFlight
Attributes: to be designed
Methods:
generateMultipleRoutes(OrigAirport, DestAirport, Date)
bookTicket(OrigAirport, DestAirport, Date)
Rubric
Final Exam
Final Exam
Criteria	Ratings	Pts
This criterion is linked to a Learning Outcome Design complying with requirements
40 pts
Full Marks
20 pts
Design complying with requirements partly.
0 pts
No Marks
40 pts
This criterion is linked to a Learning Outcome Program implementation complete
40 pts
Full Marks
20 pts
Implementation of few functionalities working correctly.
0 pts
No Marks
40 pts
This criterion is linked to a Learning Outcome Testcases validate appropriate scenarios.
20 pts
Full Marks
10 pts
Few testcases capture the possible scenarios
0 pts
No Marks
20 pts
Total Points: 100
