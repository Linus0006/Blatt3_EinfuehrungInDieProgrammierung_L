package h1;

public class H1_main {
    static void main(String[] args) {

        //variables:
         double guthaben = 3;
         double monEingang = 12;
         int rating = 22;
         boolean warnhinweis = true;
         boolean negativ = false;

         //testing:

        if (guthaben>0){
            rating = rating +3;
        } else if (guthaben == 0) {
            rating = rating +2;
        }
        if(guthaben < 0){

        }
        else{
            negativ = false;
        }
    }
}
