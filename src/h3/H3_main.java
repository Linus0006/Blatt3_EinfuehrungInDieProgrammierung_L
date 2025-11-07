package h3;

public class H3_main {
    static void main(String[] args) {

        //variables:

        int max = 5;
        int fix = 2;
        int wartend = 2;
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

        System.out.println("max: " + max + " fix: " + fix + " wartend: " + wartend + " Voll?: " + istVoll);
    }
}
