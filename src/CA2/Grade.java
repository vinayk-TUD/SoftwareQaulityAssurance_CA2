package CA2;

// Holds students name and rubric with the criterion 
public class Grade {
	
	String studentName; 
	Rubric rubric;
	
	public Grade(String studentName, Rubric rubric) {
		
		this.rubric = rubric;
		this.studentName= studentName;
		
	}
	
	//get and set 
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Rubric getRubric() {
		return rubric;
	}

	public void setRubric(Rubric rubric) {
		this.rubric = rubric;
	}
	
	

}
