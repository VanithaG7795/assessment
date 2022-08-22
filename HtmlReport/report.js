$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/BillPay.feature");
formatter.feature({
  "line": 1,
  "name": "Request for loan",
  "description": "",
  "id": "request-for-loan",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Applying for loan",
  "description": "",
  "id": "request-for-loan;applying-for-loan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is entering in the url.",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click on Login and enter the details",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter the loan amount and down payment",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "then user able to apply",
  "keyword": "Then "
});
formatter.match({
  "location": "NEW2.user_is_entering_in_the_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NEW2.user_click_on_Login_and_enter_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NEW2.enter_the_loan_amount_and_down_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NEW2.then_user_able_to_apply()"
});
formatter.result({
  "status": "skipped"
});
});