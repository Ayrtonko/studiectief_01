package model;

public class Rating {
    private int appRating;

    public Rating(int number){
        this.appRating = number;
    }

    public static boolean checkRating(int appRating){
        return (!(appRating <1) && !(appRating >5));
    }

    public int getAppRating() {
        return appRating;
    }

   public void toRateList(int rate) {
       if (checkRating(rate)) {
           Account.getLoggedAccount().getGivesApp().add(new Rating(rate));
       }
   }

    public String toString(){
        return String.valueOf(appRating);
    }
}
