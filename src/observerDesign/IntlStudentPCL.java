package observerDesign;

import java.beans.PropertyChangeEvent;

public class IntlStudentPCL extends Student {
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
  			setState("Happy");
  			break;
  		case "negative":
  			setState("Worried");
  			break;
  		case "neutral":
  			setState("Calm");
  			break;
  		default:
  			setState("Undecided");
  			break;
      }
	}
}
