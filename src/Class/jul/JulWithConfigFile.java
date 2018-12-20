package Class.jul;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//-Djava.util.logging.config.file=C:\Users\taghiyevr\IdeaProjects\logging\src\logger.properties

public class JulWithConfigFile {

    private static final Logger LOGGER = Logger.getLogger(JulWithConfigFile.class.getName());

    public void fileHandlerByDefault() {

//        try {
//            LogManager.getLogManager().readConfiguration(
//                    JulWithConfigFile.class.getResourceAsStream(
//                            "/logger.properties"
//                    )
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        LOGGER.info("FILE HANDLER INFO");

    }

    public static void main(String[] args) {
        JulWithConfigFile jul = new JulWithConfigFile();

        jul.fileHandlerByDefault();
    }

}
