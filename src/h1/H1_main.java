package h1;

public class H1_main {
    static void main(String[] args) {

        //variables:
         double guthaben = -201;
         double monEingang = 200;
         int rating = -2;
         boolean warnhinweis = true;
         boolean negativ = true;

         //testing:

        if (guthaben > 0){
            rating = rating +3;
            warnhinweis =false;
            negativ = false;
        }
        else if (guthaben == 0) {
            rating = rating +2;
            warnhinweis = false;
            negativ = false;
        }
        else if(guthaben < 0){
            negativ = true;

            if (Math.abs(monEingang) >= (Math.abs(guthaben)) ){
                rating = rating +1;
                warnhinweis = false;

            }
            else if (Math.abs(monEingang) < Math.abs(guthaben)) {
                rating = rating -1;

                if (rating < 0){
                    warnhinweis = true;
                }
                else {
                    warnhinweis = false;
                }


            }

        }
        else {
            negativ = false;
        }
        System.out.println("rating: "+rating+" warnhinweis: "+warnhinweis+" negativ?: "+negativ);

        }

}


