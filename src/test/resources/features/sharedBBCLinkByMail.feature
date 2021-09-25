#Feature: Share link functionality
#  Scenario: Share BBC link by email
#    Given a user is on the Home page
#    And user navigate to travel
#    Then user is in travel page
#    When user navigate to about us
#    When user navigate to share mail
#    And user is in new window
#
#
#
##  And user going to share BBC link by click on mail
##  And user is in new window
#  When user enters email Id
#    |Email            |
#    |jimyraj@gmail.com|
#  And user clicks on send button
##  Then mail send with cridentials
#






#  More button  //div[@class='open-nav__icon']
#  FaceBookLogo  //div[@id='FacebookIcon']

#   FaceBook banner   //u[normalize-space()='Facebook']



#  Travel button   //div[@id='orb-nav-links']//a[normalize-space()='Travel']
#  travel logo    //a[@class='branding branding--travel branding--large']
# email icon    //div[@id='headline-travelarticle20160106-fall-in-love-with-the-world-every-day']//div[@id='EmailIcon']
#  To      //textarea[@id=':o6']
#  send   //div[@id=':oy']
#  About  //  //p[normalize-space()='About us'];

  #   // Store the current window handle
  #String winHandleBefore = driver.getWindowHandle();
  #
  #// Perform the click operation that opens new window
  #
  #// Switch to new window opened
  #for(String winHandle : driver.getWindowHandles()){
  #    driver.switchTo().window(winHandle);
  #}
  #
  #// Perform the actions on new window
  #
  #// Close the new window, if that window no more required
  #driver.close();
  #
  #// Switch back to original browser (first window)
  #driver.switchTo().window(winHandleBefore);
  #
  #// Continue with original browser (first window)