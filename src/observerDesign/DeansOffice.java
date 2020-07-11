package observerDesign;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class DeansOffice extends Observable {
	 private String statement;
	    private List<Student> students = new ArrayList<>();
	    
	    @Override
	    public void addObserver(Student student) {
	        if (!students.contains( student )) {
	            this.students.add(student);
	        }
	    }
	 
	    @Override
	    public void deleteObserver(Student student) {
	        if (students.contains( student )) {
	            this.students.remove(student);
	        }
	    }
	 
	    public void setStatement(String statement) {
	        this.statement = statement;
	        setChanged();
	        notifyObservers(statement);
	    }

}
