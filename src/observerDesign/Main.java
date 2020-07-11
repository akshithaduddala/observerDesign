package observerDesign;

public class Main {

	public static void main(String[] args) {
		DeansOfficePCL deansOfficeEECS = new DeansOfficePCL();
		IntlStudentPCL student1 = new IntlStudentPCL();
		DomesticStudentPCL student2 = new DomesticStudentPCL();
		student1.setName("Akshitha");
		student2.setName("Alex");
		deansOfficeEECS.addPropertyChangeListener(student1);
		deansOfficeEECS.addPropertyChangeListener(student2);
		deansOfficeEECS.setStatement("positive");
		System.out.println("Student "+student1.getName()+" is "+student1.getState());
		System.out.println("Student "+student2.getName()+" is "+student2.getState());
		deansOfficeEECS.setStatement("negative");
		System.out.println("Student "+student1.getName()+" is "+student1.getState());
		System.out.println("Student "+student2.getName()+" is "+student2.getState());
		deansOfficeEECS.setStatement("");
		System.out.println("Student "+student1.getName()+" is "+student1.getState());
		System.out.println("Student "+student2.getName()+" is "+student2.getState());

	}

}
