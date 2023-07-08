Feature: US1003 BackGroundg kullanarak tekrarlardan kurtulur

  Background:
    Given Kullanici amazon anasayfaya gider

  Scenario: TC05 Amazon Nutella Testi

    When Nutella icin arama yapar
    Then Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir

  @smoke
  Scenario: TC06 Amazon Java Testi

    When Java icin arama yapar
    Then Arama sonuclarinin Java icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC07 Amazon Java Testi

    When Samsung icin arama yapar
    Then Arama sonuclarinin Samsung icerdigini test eder
    And Sayfayi kapatir