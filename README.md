# Literally-Anything

## Personnel
Jeremy Chen and Jiajie Mai

## Statement of Problem

Return the solution(s?) of the maze from the designated start point to the designated end point

## Base Case

When there is only one path to proceed.

## Recursive Abstraction

When I am asked to choose between n paths where n > 1(and assumed n < 4), the recursive abstraction can provide a
choice of n – 1 paths to choose between.

## Solution to the Base Case

Proceed down that path.

## Decision Base Case vs. Recursive Case

If there is more than one path, invoke the recursive
abstraction.
Else, invoke the base case.
