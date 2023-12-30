public class Reverse {
    public static void main(String[] args){
        String word = args[0];
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--){
            rev = rev + word.charAt(i);
        }
        System.out.println(rev);
        System.out.println("The middle character is " + word.charAt((int)(word.length() - 1) / 2));
    }
}
