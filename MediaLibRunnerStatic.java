public class MediaLibRunnerStatic {
  public static void main(String[] args){   
    // Step 1
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.owner = "PLTW";
    System.out.println(MediaLib.getOwner() + "'s Library");

    // Step 14
    System.out.println(MediaLib.getNumEntries());

    // Step 16-17
    MediaLib myBookLib = new MediaLib();
    myBookLib.addBook(new Book("1984", "Orwell"));
    System.out.println("myBookLib Contents: " + myBookLib);

    MediaLib myMovieLib = new MediaLib();
    myMovieLib.addMovie(new Movie("Oppenheimer", 10203));
    System.out.println("myMovieLib Contents: " + myMovieLib);

    System.out.println("Num entries: " + myBookLib.getNumEntries() + ", " + myMovieLib.getNumEntries());

    // Step 23
    MediaLib mySongLib = new MediaLib();
    mySongLib.addSong(new Song("Gummy Bear"));
    System.out.println("mySongLib Contents: " + mySongLib);
  }
}