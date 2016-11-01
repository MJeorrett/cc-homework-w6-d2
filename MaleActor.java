class MaleActor extends Actor {

  public MaleActor( String firstName, String lastName ) {
    super( firstName, lastName );
    this.setGender( 'm' );
  }

  public String title() {
    return "Mr " + fullName();
  }

}
