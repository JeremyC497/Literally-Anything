# Literally-Anything

## personnel
Jeremy Chen and Jiajie Mai

## statement of problem

return the solution(s?) of the maze from the designated start point to the designated end point

## base case

When there is only one path to proceed.

## recursive abstraction

When I am asked to choose between n paths where n > 1(and assumed n < 4), the recursive abstraction can provide a
choice of n – 1 paths to choose between.

## solution to the base case

Proceed down that path.

## decision base case vs. recursive case

If there is more than one path, invoke the recursive
abstraction.
Else, invoke the base case.
