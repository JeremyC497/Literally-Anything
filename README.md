# Literally-Anything

## Personnel
Jeremy Chen and Jiajie Mai

## Statement of Problem

Return boolean: "Is there one path to the treasure starting from the designated beginning?"

## Recursive Abstraction

When I am asked if a path exists from the designated beginning, 
the recursive abstraction should be able to return a boolean value 
if a path exists after I have moved.

## Base Case

When the explorer is on the treasure.
When the explorer has no legal paths.

## English or pseudocode description of algorithm

recordmazesolutions();

if (baseCase1)
return true;

else if (baseCase2)
return false;

else
	for each path
		move one position
		if legal path
			invoke recursive abstraction
		else 
			move back to original position

## Class(es), with fields and methods

## Version 1 improvements

Changed it so that it works even when placed in a wall.

Would be benifical if there was a feature to print every move.

