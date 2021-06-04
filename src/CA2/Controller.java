package CA2;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {
	
	 // Array lists holding  rubrics and grades 
    ArrayList<Rubric> rubricList = new ArrayList<>();
    ArrayList<Grade> gradeList = new ArrayList<>();
    
    public Controller(){}
    
 // Validates input is a string
    public boolean checkStringInput(String input){
        boolean result = true ;
        //if input is empty return false
        if (input.isEmpty()){
            result = false ;
        }//end if 
        
        else {
        	try {
        		Integer.parseInt(input);
        		result = false;
        		
        	}catch(NumberFormatException e) {}
        }
		return result;
        
    }//end check string input 
    
    
    //Validation that input for grade is a number from 1 to 5
    public boolean checkScoreInput(String input) {
    	//set to true at the beginning assuming the input is valid from beginning 
    	boolean validation = true;
    	
    	if(!checkStringInput(input)) {
    		int mark = 0;
    		try {
    			mark = Integer.parseInt(input);
    		}catch(NumberFormatException e) {}
    		
    		//check if mark is in the range and return true of false 
    		if(mark>5 || mark<1) {
        		validation = false;
        	}//end if
    	}//end if 
    	
    	else {
    		validation = false;
    	}//end else 
    	
		return validation;
    	
    }//End checkScoreInput 
    
 //Adding a rubric. Gets a name of a Rubric and adds to the rubric list
    public Rubric addRubric(String rubricName){
        //initialise rubric and add to the list
    	Rubric rubric = new Rubric(rubricName);
        rubricList.add(rubric);
        return rubric;
    }
    
    //Creating a criterion and returning iT 
    public Criterion createCriterion(String criterionName)
    {
        return new Criterion(criterionName,0);
    }
    
 // Adding criterion, receiving a name for a rubric,
    public String addCriterion(String rubric , String criterion){
    	
    	boolean found = false ;
    	String msg = " " ;
    	
    	//check to see if rubric has criterion of maz size of 10
    	for (Rubric r : rubricList) {
    		if(r.getCriteria().size()==10) {
    			msg = "Rubric reached max capacity";
    			found = true;
    		}//end if 
    		
    		else {
				Criterion criteria = createCriterion(criterion);
				r.getCriteria().add(criteria);
				found = true;
				msg = " Added criteria ";
    			
    		}
    		
    		if(!found) {
    			
    		msg = "No rubric found" ;
    		}// end if 
    		
    	}//end for 
    	
		return msg;
    }//end addcriterion
    
    public Grade addGrade(String studentName, Rubric rubric) {
    	//create grade and initialise 
    	Grade g = new Grade(studentName, rubric);
    	//add to list of grades 
    	gradeList.add(g);
    	//return the value 
		return g;
	
    }//end add grade 
    
 // return rubric by name 
    public Rubric getRubricName(String rubricName) {
    	
        Rubric rubric = null ;

        for (Rubric r : rubricList ) {
        	
            if(rubricName.equalsIgnoreCase(r.getRubricName())){
                rubric = r ;
            }
        }//end for 

        return  rubric ;
    }//end getrubricname 
    
    
    //Retunr list of rubrics 
    public ArrayList<Rubric> listRubrics(){
        
    	return rubricList ;
    }//end rubrics list 
    
    //Return a list of student grades 
    public ArrayList<Grade> listGrades(){
    	
        return gradeList ;
    }//end 
    
    //get average score of grades 
    public double getAverageRubric(String rubricName) {
		
    	int average =0;
    	int count =0;
    	int sum =0;
    	
    	//iterate through lists 
    	for(Grade g: gradeList) {
    		if(g.getRubric().getRubricName().equalsIgnoreCase(rubricName)) {
    			for(Criterion c : g.getRubric().getCriteria()) {
    				// calculate 
    				sum = sum + c.mark;
    				count = count +1;
    			}//edn for 
    		}//end if 
    	}//end for 
    	
    	//get average 
    	if (count!=0 && sum!=0) {
    		average = (sum/count);
    	}//end if 
    	return average ;
    	
    }//end get average rubric 
    
    //return the grade from the name of a student 
    public ArrayList<Grade> gradeByName(String studentName){
    	//create arraylist 
        ArrayList<Grade> listofgrades = new ArrayList<>();
        //loop through list f grades 
        for (Grade g : gradeList) {
        	
            if(g.getRubric().rubricName.equalsIgnoreCase(studentName))
                listofgrades.add(g);
        }

        return listofgrades ;
    }//end gradebyName 
 
    
    //Lowest Score in a  rubric 
    public int lowestRubricScore(String rubricName) {
    	ArrayList<Integer> list = new ArrayList<>();
    	for (Grade g : gradeList) {
    		if(g.getRubric().rubricName.equalsIgnoreCase(rubricName)) {
    			for (Criterion c : g.getRubric().getCriteria()) {
    				list.add(c.mark);
    			}//end for 
    		}//end if
    	
    	}//end for 
    	//use collection library to return the minimun value in the list 
		return Collections.min(list);
    	
    }//end 
    
  //Highest Score in a  rubric 
    public int highestRubricScore(String rubricName) {
    	ArrayList<Integer> list = new ArrayList<>();
    	for (Grade g : gradeList) {
    		if(g.getRubric().rubricName.equalsIgnoreCase(rubricName)) {
    			for (Criterion c : g.getRubric().getCriteria()) {
    				list.add(c.mark);
    			}//end for 
    		}//end if
    	
    	}//end for 
    	//use collection library to return the maximum value in the list 
		return Collections.max(list);
    	
    }//end 
    
    
    //Get average for a criteria 
 // Get the average of all scores for a given Criteria
    public double CriteriaAverage(String CriterName){
        int sum = 0 ;
        int count = 0 ;
        int average = 0 ;

        for(Grade g : gradeList){
            for (Criterion c : g.getRubric().getCriteria()) {

                if(c.criteriaName.equalsIgnoreCase(CriterName)){
                   sum = (sum + c.mark) ;
                   count = count +1 ;
                }//end if 

            }///end for 
        }//end fr 

        if(count!= 0 && sum!= 0){
            average = (sum/count) ;
        }//end f 


        return average ;
    }//end criteria average
       


}//End Controller class 
