package logPack;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleFile {
static Logger log = LogManager.getLogger(SampleFile.class.getName());

public static void main(String[] args)throws IOException ,SQLException {
// TODO Auto-generated method stub
log.debug("Hello this is a debug message");
log.info("Hello this is a info message");
log.warn("Sample warn message ");
log.error("Sample error message ");
log.fatal("Sample fatal message ");

}

}