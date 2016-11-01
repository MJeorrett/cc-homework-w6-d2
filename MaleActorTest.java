import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MaleActorTest {

  MaleActor tomCruise;

  @Before
  public void before() {
    this.tomCruise = new MaleActor( "Tom", "Cruise" );
  }

  @Test
  public void titleCorrect() {
    assertEquals( "Mr Tom Cruise", this.tomCruise.title() );
  }

}
