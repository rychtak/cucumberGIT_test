Feature: Login
  Scenario: Weryfikacja poprawnego zalogowania si�
    Given User jest na stronie domowej
    When Przechodzi do okna logowania
    When User wprowadza login i haslo
    Then Moze korzystac z panelu usera
    

  Scenario: Weryfikacja niepoprawnego zalogowania si�
    Given User jest na stronie domowej1
    When Przechodzi do okna logowania1
    When User wprowadza login i haslo1
    Then Moze korzystac z panelu usera1
 