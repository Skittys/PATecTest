Feature: API testing
  This feature file allows testing of the example API

  Scenario: New Video added through POSTing
    When Video information sent to server
    Then Server should return http code 201



  Scenario: Want to see the song list through GET
    When GET request sent to server
    Then Server should return the full song list and http code 200