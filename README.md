## Assignment 1
## CSCI 5308- Quality Assurance 

**Operating System used: Windows 10** <br/>
 **Programing language used: JAVA v1.8**<br/>
 **For compilation, set compiler "Jre 1.8"**<br/>
 **IDE used: Eclipse Oxygen**<br/>
 
 **Library Used**
 <br/>JUnit 4.12<br/>
 Mockito v1.9.5<br/>
 
 **Installation Instruction:**
 Validate.java has a business logic<br/>
 Order.java is main class whicch contains all order data<br/>
 dealer.java contains dealer id and access key<br/>
 deliveryaddress contains all address info<br/>
 Item class contains info about quantity and part number<br/>
 
 Security is interface for authorising dealer<br/>
 ISecurity is method to implement Security interface<br/>
 
 ValDelivery is interface to validate Address<br/>
 Addvali is class to implement ValDelivery class<br/>
 
 ItemValidate is Interface to validate item data<br/>
 itemval is clss to implement ItemValidate interface<br/>
 
____
PARTMANAGER is interface to validate wheter item is in stock, or anymore manufactured<br/>
Response_generator is class which implements PARTMANGER and contains method to validate stocks<br/>
Data.java is class which contain mock data.<br/>
___
Order.xml is original xml provided in assignment1 <br/>
order.xsd is XML schema for comparing whether XML is valid or not<br/>
fakeorder.xml is generated for test case of OUT_OF_STOCK<br/>
fake_result.xml is generated for test case of PART_NO_MORE_MANUFACTURED<br/>
UNauthoriseddealer.xml is generated to test if dealer is unauthorised.<br/>
___
*In mock data 1st order is same as given in order.xml, other 2 data are dummy generated for comparing fake data.<br/>
___

**References:**
1. JournalDev. (2018). How to validate XML against XSD in Java - JournalDev. [online] Available at: https://www.journaldev.com/895/how-to-validate-xml-against-xsd-in-java [Accessed 30 May 2018].

2. dzone.com. (2018). Marshalling and Unmarshalling in JAXB 2.0 - DZone Java. [online] Available at: https://dzone.com/articles/introduction-to-jaxb-20 [Accessed 1 Jun. 2018].

3. dzone.com. (2018). A Guide to Mocking With Mockito - DZone Java. [online] Available at: https://dzone.com/articles/a-guide-to-mocking-with-mockito [Accessed 1 Jun. 2018].

4. Set?, H. (2018). How to get the first element of the List or Set?. [online] Stack Overflow. Available at: https://stackoverflow.com/questions/8882295/how-to-get-the-first-element-of-the-list-or-set [Accessed 1 Jun. 2018].
5. Java?, H. (2018). How to use an array list in Java?. [online] Stack Overflow. Available at: https://stackoverflow.com/questions/2697182/how-to-use-an-array-list-in-java [Accessed 2 Jun. 2018].


 
