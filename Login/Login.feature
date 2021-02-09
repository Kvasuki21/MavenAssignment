Feature: Login and compose and verify message 

Background: 
Given Give URL

@LoginAndVerify 
Scenario Outline: Title of your scenario outline
When Entering username "<name>"
And Entering password and click login "<passwd>"
Then Verify the mail "<status>"
Examples: 
| name  | passwd  | status                  |
| admin |admin@123|mohankrishna176@gmail.com|
|Kvasuki|vasukik21|vasukik21@gmail.com      |
 
@Compose
Scenario: Compose a mail and send
 When Do login "Kvasuki" "vasukik21"
 And Go to inbox and click on compose
 And Type message
 Then Verify message