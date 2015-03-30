/*
* @Author: Eric Phung
* @Date:   2015-03-29 17:33:25
* @Last Modified by:   Eric Phung
* @Last Modified time: 2015-03-29 20:14:46
*/
import java.util.*;

public class Main {
	// instance variables
	public static List<Assignment> currentAssignmentObjects;
	public static Assignment assignmentObject;
	public static Calculation calculationObject;


	public static void main(String[] args) {

		List<Assignment> currentAssignmentObjects = new ArrayList<Assignment>();
		Assignment assignmentObject = new Assignment(95,100,"Exam");
		currentAssignmentObjects.add(assignmentObject);
		Calculation calculationObject = new Calculation(currentAssignmentObjects);

		try{
			calculationObject.testMe();
			assignmentObject.testMe();
		}catch(Exception e){
			System.out.println("Uh Oh!!!");
		} // end try catch testing

	} // end main

} // end Main class defintion