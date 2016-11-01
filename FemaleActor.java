class FemaleActor extends Actor {

  public FemaleActor( String firstName, String lastName ) {
    super( firstName, lastName );
    this.setGender( 'f' );
  }

  public String title() {
    return "Mrs " + fullName();
  }

}
