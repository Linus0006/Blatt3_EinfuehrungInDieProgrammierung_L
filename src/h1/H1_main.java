package h1;

public class H1_main {
    static void main(String[] args) {

        //variables:
         double guthaben = -100;
         double monEingang = 200;
         int rating = -2;
         boolean warnhinweis = true;
         boolean negativ = false;

         //testing:

        if (guthaben>0){
            rating = rating +3;
        }
        else if (guthaben == 0) {
            rating = rating +2;
        }
        else if(guthaben < 0){
            negativ = true;
            if (monEingang >= guthaben){
                rating = rating +1;
            }

            else if(monEingang < guthaben && rating <0){
                warnhinweis = true;
                rating = rating -1;
            }
            else{
                warnhinweis = false;
            }
            if (monEingang < guthaben) {
                rating = rating -1;
            }

        }
        else{
            negativ = false;
            warnhinweis = false;
        }
        System.out.println("rating: "+rating+" warnhinweis: "+warnhinweis+" negativ?: "+negativ);
    }
}
