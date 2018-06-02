## Assignment 1
## CSCI 5308- Quality Assurance 

**Operating System used: Windows 10**
 **Programing language used: JAVA v1.8**
 **IDE used: Eclipse Oxygen**
 
 **Library Used**
 JUnit 4.12
 Mockito v1.9.5
 
 **Installation Instruction:**
 Validate.java has a business logic
 Order.java is main clas whic contailns all order data
 dealer.java contains dealer id and access key
 deliveryaddress contains all address info
 Item class contains info about quantity and art number
 
 Security is interface for authorising dealer
 ISecurity is method to implement Security interface
 
 ValDelivery is interface to validate Address
 Addvali is class to implement ValDelivery class
 
 ItemValidate is Interface to validate item data
 itemval is clss to implement ItemValidate interface
 
____
PARTMANAGER is interface to validate wheter item is in stock, or anymore manufactured
Response_generator is class which implements PARTMANGER and contains method to validate stocks

Data.java is class which contain mock data.
___
Order.xml is original xml provided in assignment1
order.xsd is XML schema for comparing whether XML is valid or not
fakeorder.xml is generated for test case of OUT_OF_STOCK
fake_result.xml is generated for test case of PART_NO_MORE_MANUFACTURED
UNauthoriseddealer.xml is generated to test if dealer is unauthorised.
___
*In mock data 1st order is same as given in order.xml, other 2 data are dummy generated for comparing fake data.
___

**References:**
1. JournalDev. (2018). How to validate XML against XSD in Java - JournalDev. [online] Available at: https://www.journaldev.com/895/how-to-validate-xml-against-xsd-in-java [Accessed 30 May 2018].

2. dzone.com. (2018). Marshalling and Unmarshalling in JAXB 2.0 - DZone Java. [online] Available at: https://dzone.com/articles/introduction-to-jaxb-20 [Accessed 1 Jun. 2018].

3. dzone.com. (2018). A Guide to Mocking With Mockito - DZone Java. [online] Available at: https://dzone.com/articles/a-guide-to-mocking-with-mockito [Accessed 1 Jun. 2018].

4. Set?, H. (2018). How to get the first element of the List or Set?. [online] Stack Overflow. Available at: https://stackoverflow.com/questions/8882295/how-to-get-the-first-element-of-the-list-or-set [Accessed 1 Jun. 2018].
5. Java?, H. (2018). How to use an array list in Java?. [online] Stack Overflow. Available at: https://stackoverflow.com/questions/2697182/how-to-use-an-array-list-in-java [Accessed 2 Jun. 2018].


 
