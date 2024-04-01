Feature: Login to website

Background: login to website
Given I want to login the website
   
   When I enter number as "8341402168"
   And click continue
   And enter otp
   And click verify
   Then enter into the website
   
   #Scenario: Logging out of the website
 #Given click on the profile
 #When i click on logout
 #Then logging out 
 
 
 
 
 
 Scenario: Add members
 Given When i click on profile
 When i click on manage family members
 And i click add member
 And enter details 
 Then save the details
 
 #Scenario: Add Address
 #Given i click on profile
 #When i click on add aress
 #And i click on add aress
 #And Enter the details
 #Then save the address 
 
 
 
 #Scenario: UNUTHORIZED OTP
 #Given clicking on the profile
 #When i clicked on logout
 #And logging out of the website
   #
   #When I enter phonenumber as "9908511051"
   #And click continue button
   #And enter  wrong otp 
   #And click verify button
   #Then print the message
 
 
 
  
 
   