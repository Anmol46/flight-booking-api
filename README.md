# flight-booking-api
A backend API for flight booking web application

The two main REST endpoints of this application that provide booking information are as follows:

● GET /bookings/?uid={passenger-id}

● GET /bookings/{booking-id}

Other endpoints:

● GET /airports

● GET /airports/{iata-code}

● GET /flights

● GET /flights/{flight-id}

● GET /passengers

● GET /passengers/{passenger-id}

Database used is H2 database which uses in-memory storage method to store schema which means the data will be removed from memory when the application goes down.

Data used preloaded using the DataLoader class.
