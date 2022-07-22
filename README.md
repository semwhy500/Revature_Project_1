# Event-Ticketing API

## Project Description

This project was created using Java 8 with Maven to simulate a simple event ticketing web API, primarily demonstrating communication between a RESTful API and a SOAP API. Includes database-related event logging with Log4j.

## Technologies Used

* Java 8 with Maven
* Spring 2.0.8
* PostgreSQL 10
* Apache CXF 3.5.2

## Getting Started

> Extract EricSchmidtP1TicketingAPI, EricSchmidtP1EventAPI, and EricSchmidtP1VenueAPI to a local directory, preserving the data structure.

> Edit database connection configuration (if necessary) in the following locations:
  > /EricSchmidtP1TicketingAPI/src/main/resources/application.properties,
  > /EricSchmidtP1EventAPI/src/main/resources/application.properties, and
  > /EricSchmidtP1VenueAPI/src/main/resources/application.properties

> Start all 3 services in Spring Tool Suite 4.

## Usage

> Using a SOAP and REST-ready web client, send requests to the "ht<span>tp://localhost:(specified port)/(requested function path)" directory using the specified HTTP method. Supported function paths and their HTTP methods are below.

## Features

List of features ready:
* /events/getEvents (GET) - Returns a list of all events
* /events/{ID} (GET) - Returns a list of events matching the specified ID
* /events/delete/{ID} (POST) - Removes all events matching the specified ID in the event database
* /events/addEvent (DELETE) - Adds an event to the event database
* /venues/getVenues (GET) - Returns a list of all venues
* /venues/{ID} (GET) - Returns a list of venues matching the specified ID
* /venues/delete/{ID} (DELETE) - Removes all venues matching the specified ID in the venue database
* /venues/addVenue (POST) - Adds a venue to the venue database