Cruise Control for Apache Kafka
===================

[![CircleCI](https://circleci.com/gh/linkedin/cruise-control.svg?style=svg)](https://circleci.com/gh/linkedin/cruise-control)

### Introduction ###
  Cruise Control is a product that helps run Apache Kafka clusters at large scale. Due to the popularity of 
  Apache Kafka, many companies have bigger and bigger Kafka clusters.  
  
  Kafka Cruise Control is designed to address this operation scalability issue that are seen in companies which have huge Kafka infrastructure.
  
### Features ###
  Kafka Cruise Control provides the following features out of the box:
  
  * Resource utilization tracking for brokers, topics, and partitions.
  
  * Query the current Kafka cluster state to see the online and offline partitions, in-sync and out-of-sync replicas,
  replicas under `min.insync.replicas`, online and offline logDirs, and distribution of replicas in the cluster.
  
  * Multi-goal rebalance proposal generation for:
    * Rack-awareness
    * Resource capacity violation checks (CPU, DISK, Network I/O)
    * Per-broker replica count violation check
    * Resource utilization balance (CPU, DISK, Network I/O)
    * Leader traffic distribution
    * Replica distribution for topics
    * Global replica distribution
    * Global leader replica distribution
    * Custom goals that you wrote and plugged in
  
  * Anomaly detection, alerting, and self-healing for the Kafka cluster, including:
    * Goal violation
    * Broker failure detection
    * Metric anomaly detection
    * Disk failure detection (not available in `kafka_0_11_and_1_0` branch)
    * Slow broker detection (not available in `kafka_0_11_and_1_0` branch)
  
  * Admin operations, including:
    * Add brokers
    * Remove brokers
    * Demote brokers
    * Rebalance the cluster
    * Fix offline replicas (not available in `kafka_0_11_and_1_0` branch)
    * Perform preferred leader election (PLE)
    * Fix offline replicas
    * Adjust replication factor

