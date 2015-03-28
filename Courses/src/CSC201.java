
public class CSC201 extends Course {
	
	CSC201(String title, int credit, String teacher, String department, String building){
		
		this.title = title;
		this.credit = credit;
		this.teacher = teacher;
		this.department = department;
		this.building = building;
		
		
		printTitle();
		printCredit();
		printTeacher();
		printDepartment();
		printBuilding();
		
	}
	

}
