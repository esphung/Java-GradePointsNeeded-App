/*
* @Author: Eric Phung
* @Date:   2015-03-29 17:48:52
* @Last Modified by:   Eric Phung
* @Last Modified time: 2015-03-29 20:18:08
*/
import java.util.*;

public class Calculation {

	// instance variables
	public static List<Assignment> currentAssignmentObjects;// completed assignments single arg
	public static Calculation calculationObject;
	private int numeratorSum; // sum total actual points
	private int denominatorSum; // sum total possible points
	private double weightPointAveragePercent; // weighted point average as %

	public Calculation(){} // end null
	public Calculation(List<Assignment> assignments){
		this.setCurrentAssignments(assignments);
		this.setNumeratorSum(assignments);
		this.setDenominatorSum(assignments);
		this.setWeightPointAveragePercent(assignments);

	} // end constructor

	// setter methods
	public void setCurrentAssignments(List<Assignment> assignments){
		this.currentAssignmentObjects = assignments;
	} // end curr assgnmnt
	public void setNumeratorSum(List<Assignment> assignments){
		for (int i = 0; i < assignments.size(); i++) {
			this.numeratorSum += this.currentAssignmentObjects.get(i).getActualPoints();
		} // end for list size
	} // end set actual points sum total
	public void setDenominatorSum(List<Assignment> assignments){
				for (int i = 0; i < assignments.size(); i++) {
			this.denominatorSum += this.currentAssignmentObjects.get(i).getPossiblePoints();
		} // end for list size
	} // end set possible points sum total
	public void setWeightPointAveragePercent(List<Assignment> assignments){
		this.weightPointAveragePercent = (this.getNumeratorSum()%this.getDenominatorSum());
	} // end set weight pt avg


	// getter methods
	public double getWeightPointAveragePercent(){
		return this.weightPointAveragePercent;
	} // end get weight point average
	public int getNumeratorSum(){
		return this.numeratorSum;
	} // end get actual points sum total
	public int getDenominatorSum(){
		return this.denominatorSum;
	} // end get possible points sum total


	// test method
	public void testMe(){
		System.out.println(this);
		System.out.println(this.currentAssignmentObjects);
		System.out.println(this.getNumeratorSum());
		System.out.println(this.getDenominatorSum());
		System.out.println(this.getWeightPointAveragePercent()+"%");
	} // end test method



/*
	public static void main(String[] args) {
		List<Assignment> currentAssignmentObjects = new ArrayList<Assignment>();
		// test unit
		Assignment myAssignmentObject = new Assignment(95,100,"Exam");
		currentAssignmentObjects.add(myAssignmentObject);
		Calculation calculationObject = new Calculation(currentAssignmentObjects);

		try{
			calculationObject.testMe();
		}catch(Exception e){
			System.out.println("Uh Oh!!!");
		} // end try catch testing

	} // end main
*/

} // end Calculation class definition