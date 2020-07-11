package observerDesign;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.*;

public class Student implements PropertyChangeListener {
	private String name;
    private String state;
 
    public String getName() {
        return name;
    } 
    
    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    } 
    
    public void setState(String state) {
        this.state = state;
    }

}
