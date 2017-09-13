import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	int length;/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.length=length;
	}
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public Student[] getStudents() {
		Student[] s1=new Student[length];
		if(students== null)
			throw new IllegalArgumentException();
		else
			for(int i=0;i<=(length-1);i++)
			{
				s1[i].id=student[i].id;
				s1[i].fullName=student[i].fullName;
				s1[i].birthDate=student[i].birthDate;
				s1[i].avgMark=student[i].avgMark;
			}// Add your implementation here
		return s1;
	}

	@Override
	public void setStudents(Student[] students) {
		
		
	
	// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(student== null || index<0 || index>length)
		{
			throw new IllegalArgumentException();
		}
		else
			{Student s;
		s.id=students[index].id;
		s.fullName=students[index].fullName;
		s.birthDate=students[index].birthDate;
		s.avgMark=students[index].avgMark;
			}// Add your implementation here
		return s;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student== null || index<0 || index>length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[index]=student;
		}// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[0]=student;
		}
			
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else{
			students[length-1]=student;
		}// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(student== null || index<0 || index>length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[index]=student;
		}// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		students[index]=null;}// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
