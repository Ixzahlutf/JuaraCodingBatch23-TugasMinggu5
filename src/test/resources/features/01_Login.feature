Feature: Login Feature

  Scenario: Login at CURA Healthcare
    Given pengguna sudah berada di halaman home.
    When pengguna masuk ke halaman login.
    And pengguna memasukkan username "John Doe" dan password "ThisIsNotAPassword".
    And pengguna menekan tombol login.
    Then pengguna akan dibawa ke halaman appointment dengan url "https://katalon-demo-cura.herokuapp.com/#appointment".
