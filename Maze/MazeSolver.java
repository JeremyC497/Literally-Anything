public class MazeSolver {
	
    public Maze mazeToSolve;
    
    //constructor
    public MazeSolver (Maze maze){
        mazeToSolve = new Maze(maze);
    }
	
	//Solving Method
    public boolean possible(){
		
        // base case
        if (mazeToSolve.explorerIsOnA() == Maze.TREASURE){return true;}
        else if (mazeToSolve.explorerIsOnA() == Maze.WALL){return false;}
		
        //recursive case	
        else{
            Maze currentProgress = new Maze(mazeToSolve);
            mazeToSolve.dropA(mazeToSolve.WALL);
		
            //Testing North
            mazeToSolve.go(mazeToSolve.NORTH); 
            if (possible() == true){return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }
			
            //Testing East
            mazeToSolve.go(mazeToSolve.EAST); 
            if (possible() == true){return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }			
			
            //Testing South
            mazeToSolve.go(mazeToSolve.SOUTH); 
            if (possible() == true){return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }
			
            //Testing West
            mazeToSolve.go(mazeToSolve.WEST); 
            if (possible() == true){return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }	
			
            //Required return statement
            return false;
        }	
    }	
	
}