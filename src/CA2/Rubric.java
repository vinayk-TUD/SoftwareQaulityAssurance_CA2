package CA2;
//Rubric will have a name and a list of criterion 
import java.util.ArrayList;

public class Rubric {
	
	//create array list 
	ArrayList<Criterion> criteria;
	String rubricName;
	
	public Rubric(String rubricName) {
		//instantiate the list 
		criteria = new ArrayList<Criterion>();
		this.rubricName = rubricName;
	}
	
	//get and set methods

	public ArrayList<Criterion> getCriteria() {
		return criteria;
	}

	public void setCriteria(ArrayList<Criterion> criteria) {
		this.criteria = criteria;
	}

	public String getRubricName() {
		return rubricName;
	}

	public void setRubricName(String rubricName) {
		this.rubricName = rubricName;
	}
	
	

}
