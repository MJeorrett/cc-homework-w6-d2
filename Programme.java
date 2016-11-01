import java.util.*;

class Programme {

  private Play play;

  public Programme( Play play ) {
    this.play = play;
  }

  public String print() {
    String playTitle = this.play.title();
    ArrayList<Actor> cast = this.play.getCast();
    String result = playTitle;
    result += "\n\n** starring **\n";

    for ( Actor actor : cast ) {
      result += "\n" + actor.title();
    }

    return result;
  }
}
