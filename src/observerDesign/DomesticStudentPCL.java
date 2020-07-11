package observerDesign;

import java.beans.PropertyChangeEvent;

public class DomesticStudentPCL extends Student {
	private String statement;
	
	public String getStatement() {
        return statement;
    }
		
    public void setStatement(String statement) {
        this.statement = statement;
    }
	
	public void propertyChange(PropertyChangeEvent event) {
		this.setStatement((String) event.getNewValue());
		switch(statement) {
  		case "positive":
  			setState("Happy for their friends");
  			break;
  		case "negative":
  			setState("Worried for their friends");
  			break;
  		case "neutral":
  			setState("Calm about the update");
  			break;
  		default:
  			setState("Undecided");
  			break;
      }
	}
}
