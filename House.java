package logging;
import org.apache.log4j.Logger;

public class House

{
	static Logger log = Logger.getLogger(House.class.getName());
    public static void main( String[] args )
    {
    	Interest.calculateInterest();
        Construction.costEvaluator();
    }
}