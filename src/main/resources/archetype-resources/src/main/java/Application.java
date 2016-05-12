package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
      SpringApplication application = new SpringApplication(Application.class, "classpath*:/spring/*.xml");
      application.setWebEnvironment(true);
      application.run(args);
  }
}
