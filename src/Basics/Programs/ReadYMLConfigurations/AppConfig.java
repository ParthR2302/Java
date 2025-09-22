package Basics.Programs.ReadYMLConfigurations;

public class AppConfig {
    private KafkaBQConfig kafkabq;

    public KafkaBQConfig getKafkabq() { return kafkabq; }
    public void setKafkabq(KafkaBQConfig kafkabq) { this.kafkabq = kafkabq; }
}

