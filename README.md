# The Airplane

You are navigating an airplane, which can take a series of commands:
- up X increases the direction by X units
- down X decreases the direction by X units
- forward X increases the horizontal position by X units and the vertical position by X multipled by the current direction
 
Here is an example of a preplanned course:
- forward 4
- up 2
- forward 8
- down 1
- forward 2
- up 3
- forward 3

These instructions would do the following (with the initial position and direction set to 0):
- Increase the horizontal position by 4 (as your direction is 0, the vertical position stays unchanged)
- Increase the direction by 2
- Increase the horizontal position by 8 and vertical position by 16 (as the direction is 2, the vertical position becomes the previous value 0 + 2 * 8 = 16)
- Decrease the direction by 1
- Increase the horizontal position by 2 and vertical position by 2 (as the direction is 1, the vertical position becomes the previous value 16 + 1 * 2 = 18)
- Increase the direction by 3
- Increase the horizontal position by 3 and vertical position by 12

This course would result in a horizontal position of 17 and a vertical position of 30.
Create a program that reads the preplanned course from a file (e.g. a file
containing the preplanned course above), calculates the horizontal and vertical
position after following the course and then multiplies the final horizontal position
by the final vertical position. In this case that would be 17 * 30 = 510.
