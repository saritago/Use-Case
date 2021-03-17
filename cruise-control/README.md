Cruise Control for Apache Kafka
===================

[![CircleCI](https://circleci.com/gh/linkedin/cruise-control.svg?style=svg)](https://circleci.com/gh/linkedin/cruise-control)

### Purpose ###
  Cruise Control is a product that helps run Apache Kafka clusters at large scale. Due to the popularity of 
  Apache Kafka, many companies have bigger and bigger Kafka clusters.  
  
  Kafka Cruise Control is designed to address this operation scalability issue that are seen in companies which have huge Kafka infrastructure.
  
### Assignment ###
  Illustaration of cluster rebalancing using cruisecontrol where 3 new nodes have been added to the cluster.
  
- Status when the cluster has 2 nodes:


  ![image](https://user-images.githubusercontent.com/42265090/111490115-bfd5c480-8760-11eb-81b2-f25a13f99d1f.png)
 
 
  ![image](https://user-images.githubusercontent.com/42265090/111491232-b305a080-8761-11eb-9147-e1ea255756a3.png)


  ![image](https://user-images.githubusercontent.com/42265090/111491264-b8fb8180-8761-11eb-8456-6a95dd6a6d1b.png)


- Status after 3 new nodes have been added to the cluster but cluster not in rebalanced state:


  ![image](https://user-images.githubusercontent.com/42265090/111491463-e6482f80-8761-11eb-8811-5a35d4dab389.png)


- Admin page where rebalance is being triggered by using "Add Brokers" with "Dry Run" option: 


  ![image](https://user-images.githubusercontent.com/42265090/111491720-1b548200-8762-11eb-8922-aa83f27f2ffa.png)


- Few screen shots of the response received for triggering the "Add Brokers" task with "Dry Run" option. This basically shows how the partition/leader distribution will look after rebalance:

  ![image](https://user-images.githubusercontent.com/42265090/111492455-af264e00-8762-11eb-908a-de138f0fb136.png)


  ![image](https://user-images.githubusercontent.com/42265090/111492488-b77e8900-8762-11eb-90bf-fb66cdebb4dc.png)


  ![image](https://user-images.githubusercontent.com/42265090/111492502-bbaaa680-8762-11eb-810b-97b7f79b559d.png)


  ![image](https://user-images.githubusercontent.com/42265090/111492532-c06f5a80-8762-11eb-9d74-fa3fe9afbc24.png)


- Once "Add Brokers" is run with "Dry Run" false option, the partitions/leader distribution looks like below:


  ![image](https://user-images.githubusercontent.com/42265090/111492776-f90f3400-8762-11eb-8c95-e6c3787a9185.png)


- An exnample of "Demote Brokers":


  ![image](https://user-images.githubusercontent.com/42265090/111492920-1c39e380-8763-11eb-8d84-433929dec04b.png)


- Its response:


  ![image](https://user-images.githubusercontent.com/42265090/111493009-31167700-8763-11eb-8c74-3166d45c0af2.png)


- Results as below:


  ![image](https://user-images.githubusercontent.com/42265090/111493080-3ecbfc80-8763-11eb-9a31-58ef5f1c9c61.png)


- Now "Rebalance Cluster" to add back the leaders that were moved from Broker "5":


  ![image](https://user-images.githubusercontent.com/42265090/111493336-776bd600-8763-11eb-849a-cab14d0e9663.png)


- Results into below:


  ![image](https://user-images.githubusercontent.com/42265090/111493417-881c4c00-8763-11eb-8be3-2e4226d0945c.png)






