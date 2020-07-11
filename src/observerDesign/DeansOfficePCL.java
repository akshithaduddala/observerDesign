package observerDesign;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DeansOfficePCL {
	
	private String statement;
	private PropertyChangeSupport support;
	
	public DeansOfficePCL() {
		support = new PropertyChangeSupport(this);
		
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
	    support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
	    support.removePropertyChangeListener(pcl);
    }
	
	public void setStatement(String update) {
		support.firePropertyChange("statement", this.statement, update);
		this.statement = update;
	}

}
