import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.*;

public class PlayTest {

  Play hamlet;
  Actor tomCruise;
  Actor pamRogers;

  @Before
  public void before() {
    this.hamlet = new Play( "Hamlet", 5, 2 );
    this.tomCruise = new MaleActor( "Tom", "Cruise" );
    this.pamRogers = new FemaleActor( "Pam", "Rogers" );

  }

  @Test
  public void hasName() {
    assertEquals( "Hamlet", hamlet.getName() );
  }

  @Test
  public void hasNumberMaleRoles() {
    assertEquals( 5, hamlet.getNumberMaleRoles() );
  }

  @Test
  public void hasNumberFemaleRoles() {
    assertEquals( 2, hamlet.getNumberFemaleRoles() );
  }

  @Test
  public void hasCastSize() {
    assertEquals( 7, hamlet.castSize() );
  }

  @Test
  public void availableMaleRolesInitialisedCorrectly() {
    assertEquals( 5, hamlet.availableMaleRoles() );
  }

  @Test
  public void
  availableFemaleRolesInitialisedCorrectly() {
    assertEquals( 2, hamlet.availableFemaleRoles() );
  }

  @Test
  public void addingMaleActorReducesRolesAvailable() {
    hamlet.castActor( tomCruise );
    assertEquals( 4, hamlet.availableMaleRoles() );
  }

  @Test
  public void addingFemaleActorReducesRolesAvailable() {
    hamlet.castActor( pamRogers );
    assertEquals( 1, hamlet.availableFemaleRoles() );
  }

  @Test
  public void cantAddTooManyMaleActors() {

    for ( int i = 0; i < 10; i++ ) {
      Actor testActor = new MaleActor( "testFirst", "testLast" );
      hamlet.castActor( testActor );
    }

    assertEquals( 0, hamlet.availableMaleRoles() );
    assertEquals( 2, hamlet.availableFemaleRoles() );
  }

  @Test
  public void cantAddTooManyFemaleActors() {

    for ( int i = 0; i < 10; i++ ) {
      Actor testActor = new FemaleActor( "testFirst", "testLast" );
      hamlet.castActor( testActor );
    }

    assertEquals( 5, hamlet.availableMaleRoles() );
    assertEquals( 0, hamlet.availableFemaleRoles() );
  }

  @Test
  public void titleCorrect() {
    assertEquals( "Hamlet", this.hamlet.title() );
  }

  @Test
  public void canGetCast() {
    hamlet.castActor( this.tomCruise );
    hamlet.castActor( this.pamRogers );
    ArrayList<Actor> cast = hamlet.getCast();
    assertEquals( false, cast == null );
    assertEquals( this.tomCruise, cast.get( 0 ) );
    assertEquals( this.pamRogers, cast.get( 1 ) );
  }

}
