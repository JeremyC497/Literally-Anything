public class MazeSolver {
	
    public Maze mazeToSolve;
    
    //constructor
    public MazeSolver (Maze maze){
        mazeToSolve = new Maze(maze);
    }
	
	//Solving Method
    public boolean possible(){
		
        // base case
        if (mazeToSolve.explorerIsOnA() == Maze.TREASURE){
	    System.out.println(mazeToSolve);
	    return true;}
        else if (mazeToSolve.explorerIsOnA() == Maze.WALL){
	return false;
	    //moves the explorer to a random place that is not a wall for now

	    //mazeToSolve.move();}
		
        //recursive case	
        else{
            Maze currentProgress = new Maze(mazeToSolve);
            mazeToSolve.dropA(mazeToSolve.WALL);
		
            //Testing North
	    System.out.println(mazeToSolve);
	    System.out.println("Testing North");
            mazeToSolve.go(mazeToSolve.NORTH); 
            if (possible() == true){
		return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }
			
            //Testing East
	    System.out.println(mazeToSolve);
	    System.out.println("Testing East");
            mazeToSolve.go(mazeToSolve.EAST); 
            if (possible() == true){
		return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }			
			
            //Testing South
	    System.out.println(mazeToSolve);	   
	    System.out.println("Testing South");
            mazeToSolve.go(mazeToSolve.SOUTH); 
            if (possible() == true){
		return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }
			
            //Testing West
	    System.out.println(mazeToSolve);
	    System.out.println("Testing West");
            mazeToSolve.go(mazeToSolve.WEST); 
            if (possible() == true){
		return true;}
            else{
                mazeToSolve = new Maze(currentProgress);
            }	
			
            //Required return statement
	    System.out.println(mazeToSolve);
            return false;
        }	
    }	
	
}
