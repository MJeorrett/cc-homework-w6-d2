import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ProgrammeTest {

  Play hamlet;
  MaleActor tomCruise;
  MaleActor matLeBlanc;
  MaleActor judeLaw;
  FemaleActor shirleyTemple;
  FemaleActor dawnFrench;
  Programme hamletProgramme;

  @Before
  public void before() {
    this.hamlet = new Play( "Hamlet", 3, 2 );
    this.tomCruise = new MaleActor( "Tom", "Cruise" );
    this.matLeBlanc = new MaleActor( "Mat", "Le Blanc" );
    this.judeLaw = new MaleActor( "Jude", "Law" );
    this.shirleyTemple = new FemaleActor( "Shirley", "Temple" );
    this.dawnFrench = new FemaleActor( "Dawn", "French" );
    this.hamletProgramme = new Programme( this.hamlet );
  }

  @Test
  public void printReturnIsCorrectForFullyCastPlay() {
    this.hamlet.castActor( this.tomCruise );
    this.hamlet.castActor( this.matLeBlanc );
    this.hamlet.castActor( this.judeLaw );
    this.hamlet.castActor( this.shirleyTemple );
    this.hamlet.castActor( this.dawnFrench );
    String expected =
"Hamlet\n\n** starring **\n\nMr Tom Cruise\nMr Mat Le Blanc\nMr Jude Law\nMrs Shirley Temple\nMrs Dawn French";
    assertEquals( expected, this.hamletProgramme.print() );
  }

}
