import java.util.ArrayList;
import java.util.List;

public class StudentRetrieve {
	ArrayList<Subject> students = null;
	{	
		students = new ArrayList<>();
		Subject std1 = new Subject(1, "Neha", 80, 75, 70);
		students.add(std1);
		Subject std2 = new Subject(2, "sneha", 50, 60, 70);
		students.add(std2);
		Subject std3 = new Subject(3, "Sagarika", 50, 45, 70);
		students.add(std3);		
	}

	public void addStudent(Subject student){
		students.add(student);
	}

	public List<Subject> getAllStudent() 
	{
		return students;
	}
}