class Actor implements Printable {

  private String firstName;
  private String lastName;
  private char gender;

  public Actor ( String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public char getGender() {
    return this.gender;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public String title() {
    return fullName();
  }

  protected void setGender( char gender ) {
    this.gender = gender;
  }

}
