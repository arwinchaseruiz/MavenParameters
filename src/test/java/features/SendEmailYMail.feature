Feature: User should be able to send email in Yahoo Mail using Google Chrome
@Chrome
Scenario Outline: User will send an email using Google Chrome

Given User navigates to Yahoo Mail

When User tries to login

And User inputs username <username>

And User inputs password <password>

Then User will be redirected to Yahoo Mail Home Page

And User clicks on Compose

And User inputs To field

And User inputs Subject Field

And User inputs Message

Then User clicks send


@Chrome
Examples:
|username                |password|
|arwinchaseruiz@yahoo.com|test|
