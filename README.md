# Parking-Garage-System-Java
Parking Garage application manages a parking space for a configurable maximum number of vehicles. 

Each parking space (slot) defined with a dimension (width and depth) .

The application handle's the following functions:

● Each vehicle is identified by a model name, unique identification number, Model year and vehicle dimensions (vehicle width and depth).

● Park-in function marks the arrival time of a vehicle if there is an available slot , The application capture's time automatically from the system.

● During the park-in function the application picks a free slot based on the active slot configuration.

 There are two configurations:
 
(i) first come first served slots i.e., the park-in function will use the first free slot available from the parking garage slots. 

(ii) best-fit approach where the system finds the slot with the minimum dimension to hold the vehicle.

● Park-out function that marks the departure time of a vehicle from the garage. The application capture's time automatically from the system.

● Calculating the parking fees during the park-out based on the time-of-stay with an hourly rate of 5 EGP.(Variable)

● Calculating the total income as well as the total number of vehicles that used the parking garage at any given point in time.

● Display the available parking slots

-SOLID Principles & Design Patterns are applied to code.
