public class Perfect {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        boolean isPerfect = true;
        int y = 0;
        for (int x = 1; x < a; x++){
            if (a % x == 0){
                y += x;
            }
        }
        if (y != a){
            isPerfect = false;
        }

        String s = (a) + " is a perfect number since " + (a) + " = 1";
        for (int i = 2; i < a; i++){
           if (a % i == 0){
            s += " + " + i;
           }
        }

        if (isPerfect){
            System.out.println(s);
        } else {
            System.out.println(a + " is not a perfect number");
        }
    }
}
