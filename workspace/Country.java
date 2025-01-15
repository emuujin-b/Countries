public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String image;
  //constructors
  public Country(){
    this.name = "";
    this.capital = "";
    this.language = "";
    this.image = "";
  }
  public Country(String name, String capital, String language, String image){
    this.name=name;
    this.capital=capital;
    this.language=language;
    this.image=image;
  }
  //methods
  public String getName(){
    return name;
  }
  public String getCapital(){
    return capital;
  }
  public String getLang(){
    return language;
  }
  public String getImage(){
    return image;
  }

  //premethod:capital and language and name must be strings. 
  //postmethod: returns a concatenated string of name, capital, and language
  public String toString() {
    return(name+"'s capital is "+capital+" and its primary language is "+language);
  }
}