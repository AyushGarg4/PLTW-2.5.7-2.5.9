public class Song{
  private String title;
  private int rating;
  private String time;

  public Song(String title){
    this.title = title;
    this.rating = 0;
    this.time = CalendarAll.returnTime();
  }

  public String getTitle(){
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public int getRating(){
    return rating;
  }

  public void adjustRating(int r){
    if ((rating + r >= 0) && (rating + r <= 10)){
      rating += r;
    }   
  }

  public String getTime() {
    return time;
  }

  public String toString() {
    String info = "\"" + title + "\"";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    info += ". Created on " + time;
    return info;
  }
}