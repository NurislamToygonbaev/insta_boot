package instagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class InstaBootApplication {

    public static void main(String[] args) {


        SpringApplication.run(InstaBootApplication.class, args);

//
//        ClassLoader classLoader = InstaBootApplication.class.getClassLoader();
//
//        File file = new File(classLoader.getResource("serviceAccaount.json")).getParentFile()


    }

}
