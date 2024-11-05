package Tools;




import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log_4j {
	@Test
	public void logReport() throws IOException
	{
		Layout lay= new PatternLayout("%d %c %m %n");
		Appender app= new FileAppender(lay, "./Reports/re.log");
		BasicConfigurator.configure(app);
		Logger log= Logger.getLogger(getClass().getName());
		log.warn("testcase warning");
		log.info("testcase info");
		log.error("testcase error");
	}
}
