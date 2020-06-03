Feature: User should be able to send email in Yahoo Mail using Firefox
@Firefox
Scenario Outline: User will send an email using Firefox

Given User navigates to Yahoo Mail <browser>

When User tries to login

And User inputs username <username>

And User inputs password <password>

Then User will be redirected to Yahoo Mail Home Page

And User clicks on Compose

And User inputs To field

And User inputs Subject Field

And User inputs Message

Then User clicks send



Examples:
|browser|username                |password|
|firefox|arwinchaseruiz@yahoo.com|Darmynbakla71|