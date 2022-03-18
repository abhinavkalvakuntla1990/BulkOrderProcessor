import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Bulk Orders Producer API",  version = "1.0", description = "This is just for the demo purpose to be able to send message to kafka topic"))
public class BulkOrderProcessor {
    public static void main(String[] args) { SpringApplication.run(BulkOrderProcessor.class, args); }

}
