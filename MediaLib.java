public class MediaLib
{
  public static String owner = "Ayush and Eashan";
  private static int numEntries = 0;
  
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  
  private Book book;
  private Movie movie;
  private Song song;

  public void addBook(Book b)
  {
    // Step 23
    if (book == null) {
      book = b;
      numEntries += 1; // Step 15
      numBooks += 1; // Step 29
    } else {
      // Step 24
      System.out.println("Cannot add a new book to the library; a book has already been added.");
    }
  }

  public void addMovie(Movie m){
    // Step 23
    if (movie == null) {
      movie = m;
      numEntries += 1; // Step 15
      numMovies += 1; // Step 29
    } else {
      // Step 24
      System.out.println("Cannot add a new movie to the library; a movie has already been added.");
    }
  }

  public void addSong(Song s) {
    if (song == null) {
      song = s;
      numEntries += 1;
      numSongs += 1; // Step 29
    } else {
      System.out.println("Cannot add a new song to the library; a song has already been added.");
    }
  }

  // new step 18-22
  /* test scenario
  public void testBook(Book tester)
  {
  tester.setTitle("Animal Farm");
  // show state chagne with one of the following
  System.out.println(" in test: " + tester);
  System.out.println(" in test: " + tester.getTitle());
  }
  */

  public String toString()  
  {
    String info = "";
  
    // Step 5, avoid crashing by testing that book is not null before using its toString method
    if (book != null)
      info += "Book: " + book + "\n";
    
    if (movie != null)
      info += "Movie: " + movie + "\n";

    if (song != null)
      info += "Song: " + song + "\n";
  
    return info;
  }
  // Step 8 
  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String owner) {
    MediaLib.owner = owner;
  }
  // Step 14
  public static int getNumEntries() {
    System.out.println("Test: Owner is " + owner);
    return numEntries;
  }

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }
}
