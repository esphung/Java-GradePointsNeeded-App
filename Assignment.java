/*
* @Author: home
* @Date:   2015-03-29 16:51:24
* @Last Modified by:   Eric Phung
* @Last Modified time: 2015-03-29 20:13:58
*	PURPOSE:			builds assignment objects for final project
*/

public class Assignment {
	// instance variables
	private int actualPoints; // score student received
	private int possiblePoints; // total score possible
	private String assignmentName; // title of assignment

	public Assignment(){
	} // end null constructor

	public Assignment(int actual,int possible,String name){
		this.setActualPoints(actual);
		this.setPossiblePoints(possible);
		this.setAssignmentName(name);
	} // end multi param constructor

	// setter methods
	public void setActualPoints(int num){
		this.actualPoints = num;
	} // end set actual
	public void setPossiblePoints(int num){
		this.possiblePoints = num;
	} // end set possible
	public void setAssignmentName(String name){
		this.assignmentName = name;
	} // end set name

	// getter methods
	public int getActualPoints(){
		return this.actualPoints;
	} // end get actual
	public int getPossiblePoints(){
		return this.possiblePoints;
	} // end get possible
	public String getAssignmentName(){
		return this.assignmentName;
	} // end get name

	// test method
	public void testMe(){
		// humanize order value output
		System.out.println(this); // show type/mem location
		System.out.println(this.getAssignmentName());
		System.out.println(this.getActualPoints());
		System.out.println(this.getPossiblePoints());
	} // test assignment object vals




/*
	// main (for testing)
	public static void main(String[] args) {
		// test units
		Assignment assignmentObject = new Assignment();
		assignmentObject.setActualPoints(85);
		assignmentObject.setPossiblePoints(100);
		assignmentObject.setAssignmentName("Final Exam");

		Assignment myAssignmentObject = new Assignment(95,100,"Exam");

		assignmentObject.testMe(); // obj values from setter
		myAssignmentObject.testMe(); // obj values from constuctor
	} // end assignment main
*/

} // end assignment class definition


