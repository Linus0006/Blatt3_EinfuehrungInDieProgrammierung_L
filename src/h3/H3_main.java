package h3;

public class H3_main {
    static void main(String[] args) {

        //variables:

        int max = 12;
        int fix = 6;
        int wartend = 1;
        boolean istVoll = false;

        //schleife:

        while (max > fix && wartend >0){
            fix ++;
            wartend --;
        }
        if (fix == max){
            istVoll = true;
        }
        else{
            istVoll = false;
        }
    }
}
