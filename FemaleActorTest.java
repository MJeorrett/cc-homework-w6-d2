import static org.junit.Assert.assertEquals;
import org.junit.*;

public class FemaleActorTest {

  FemaleActor bethenyHughes;

  @Before
  public void before() {
    this.bethenyHughes = new FemaleActor( "Betheny", "Hughes" );
  }

  @Test
  public void titleCorrect() {
    assertEquals( "Mrs Betheny Hughes", this.bethenyHughes.title() );
  }

}
