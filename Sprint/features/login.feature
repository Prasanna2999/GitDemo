Feature: Login to website

Background: login to website
Given I want to login the website
   
   When I enter number as "9989456998"
   And click continue
   And enter otp
   And click verify
   Then enter into the website
 Scenario: Add Address
 Given i click on profile
 When i click on add aress
 #And i click on add aress
 And Enter the details
 Then save the address 
 
 
 
 #Scenario: Add members
 #Given When i click on profile
 #When i click on manage family members
 #And i click add member
 #And enter details 
 #Then save the details
 
 
 
  
 
   