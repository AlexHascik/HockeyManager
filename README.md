# Hockey Team Manager

In this assignment I decided to create a class for each type of player
(Forward, Defender, Goalie) and an abstract class Player. The Player abstract class
implements shared functionality, which is inherited by  Forward, Defender and Goalie classes.
The HockeyManager manages a collection of players and performs operations, such as finding the
youngest player from the team (I added an extra function that finds all youngest players, since
multiple players can have the same age). I also created an enumeration to represent the possible player
positions. In the "diagrams" folder, there is an UML class diagram which represents my design.

## Validation
I added some simple validation for name, age, hits, wins and goals variables. The name cannot
be empty or null, the age of a player can be between 5 - 100. The rest of the variables can not
be negative. If any of these conditions is violated an IllegalArgumentException with appropriate
message is thrown by the function.

## Tests
I added simple unit tests using JUnit5 for the implemented classes. For the JUni5  to work, I added a
dependency to the pom.xml file.
