import java.util.ArrayList;

class Play implements Printable {

  private String name;
  private int numberMaleRoles;
  private int numberFemaleRoles;
  private int castSize;
  private ArrayList<Actor> cast;

  public Play( String name, int numberMaleRoles, int numberFemaleRoles ) {
    this.name = name;
    this.numberMaleRoles = numberMaleRoles;
    this.numberFemaleRoles = numberFemaleRoles;
    this.castSize = numberMaleRoles + numberFemaleRoles;
    cast = new ArrayList<Actor>();
  }

  public String getName() {
    return this.name;
  }

  public int getNumberMaleRoles() {
    return this.numberMaleRoles;
  }

  public int getNumberFemaleRoles() {
    return this.numberFemaleRoles;
  }

  public int castSize() {
    return this.castSize;
  }

  public int availableMaleRoles() {
    int maleRolesCast = numberRolesCastForGender( 'm' );
    return getNumberMaleRoles() - maleRolesCast;
  }

  public int availableFemaleRoles() {
    int femaleRolesCast = numberRolesCastForGender( 'f' );
    return getNumberFemaleRoles() - femaleRolesCast;
  }

  public void castActor( Actor actor ) {

    int avaialableRoles = 0;
    if ( actor.getGender() == 'm' ) {
      avaialableRoles = availableMaleRoles();
    } else {
      avaialableRoles = availableFemaleRoles();
    }

    if ( avaialableRoles > 0 ) {
      cast.add(actor);
    }
  }

  public String title() {
    return this.name;
  }

  public ArrayList<Actor> getCast() {
    return this.cast;
  }

  private int numberRolesCastForGender( char gender ) {
    int numberRolesCast = 0;

    for ( Actor actor : cast ) {
      if ( actor != null && actor.getGender() == gender ) {
        numberRolesCast++;
      }
    }

    return numberRolesCast;
  }

}
