Feature: Appointment Feature

  Scenario: Schedule an appointment at CURA Healthcare
    Given pengguna sudah berada di halaman appointment
    When pengguna memilih facility "Hongkong CURA Healthcare Center"
    And pengguna memilih opsi "Yes" untuk apply hospital readmission
    And pengguna memilih "Medicaid" sebagai program kesehatan
    And pengguna memilih tanggal 9 bulan "9" tahun "2027" untuk janji temu
    And pengguna menekan tombol buat janji
    Then pengguna berhasil membuat janji kemudian dibawa ke halaman url "https://katalon-demo-cura.herokuapp.com/appointment.php#summary"

