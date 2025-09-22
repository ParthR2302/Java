package Basics.Programs.ReadYMLConfigurations;

// public class ConfigReader 
/*
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;

public class ConfigReader {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();

        try (InputStream input = ConfigReader.class.getResourceAsStream("/config-properties.yml")) {
            // Load YAML into AppConfig class directly
            AppConfig config = yaml.loadAs(input, AppConfig.class);

            // Retrieve KafkaBQ config
            KafkaBQConfig kafkaConfig = config.getKafkabq();

            System.out.println("Topic: " + kafkaConfig.getTopic());
            System.out.println("Consumer Group: " + kafkaConfig.getConsumerGroup());
            System.out.println("Brokers: " + kafkaConfig.getBrokers());
            System.out.println("BQ Tenant: " + kafkaConfig.getBqTenant());
            System.out.println("BQ Table: " + kafkaConfig.getBqTable());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 */