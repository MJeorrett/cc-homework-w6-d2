import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ActorTest {

  Actor tomCruise;

  @Before
  public void before() {
    tomCruise = new MaleActor( "Tom", "Cruise" );
  }

  @Test
  public void hadFirstName() {
    assertEquals( "Tom", tomCruise.getFirstName() );
  }

  @Test
  public void hasLastName() {
    assertEquals( "Cruise", tomCruise.getLastName() );
  }

  @Test
  public void hasGender() {
    assertEquals( 'm', tomCruise.getGender() );
  }

}
