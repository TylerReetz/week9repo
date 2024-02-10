
public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        
        asteriskLogger.log("Testing");
        asteriskLogger.error("Testing");
        spacedLogger.log("Testing");
        spacedLogger.error("Testing");
	}

}
