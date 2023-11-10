public class Movie {
  private String title;
  private double duration;
  private int rating;

  public Movie(String title, double duration) {
    this.title = title;
    this.duration = duration;
    this.rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getDuration() {
    return duration;
  }

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public int getRating() {
    return rating;
  }

  public void adjustRating(int r) {
    if ((rating + r >= 0) && (rating + r <= 10))
      rating += r;
  }

  public String toString() {
    String info = "\"" + title + "\", with duration " + duration;
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie o) {
    return this.toString().equals(o.toString());
  }
}