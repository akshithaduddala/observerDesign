package observerDesign;
import java.util.*;

public class IntlStudent1 extends Student {
 
    @Override
    public void update(Observable o, Object statement) {
      switch(statement.toString()) {
  		case "positive":
  			setState("Happy");
  			break;
  		case "negative":
  			setState("Worry");
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
