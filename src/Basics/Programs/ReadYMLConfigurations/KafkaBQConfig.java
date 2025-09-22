package Basics.Programs.ReadYMLConfigurations;

public class KafkaBQConfig {
    private String topic;
    private String consumerGroup;
    private String brokers;
    private String bqTenant;
    private String bqTable;

    // Getters & Setters
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getConsumerGroup() { return consumerGroup; }
    public void setConsumerGroup(String consumerGroup) { this.consumerGroup = consumerGroup; }

    public String getBrokers() { return brokers; }
    public void setBrokers(String brokers) { this.brokers = brokers; }

    public String getBqTenant() { return bqTenant; }
    public void setBqTenant(String bqTenant) { this.bqTenant = bqTenant; }

    public String getBqTable() { return bqTable; }
    public void setBqTable(String bqTable) { this.bqTable = bqTable; }

    @Override
    public String toString() {
        return "KafkaBQConfig{" +
                "topic='" + topic + '\'' +
                ", consumerGroup='" + consumerGroup + '\'' +
                ", brokers='" + brokers + '\'' +
                ", bqTenant='" + bqTenant + '\'' +
                ", bqTable='" + bqTable + '\'' +
                '}';
    }
}

