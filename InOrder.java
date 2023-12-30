public class InOrder {
    public static void main(String[] args){
        int first = (int) (Math.random() * 10);
        System.out.print(first + " ");
        int x;
        do {
            x = (int) (Math.random() * 10);
            if (x >= first){
                System.out.print(x + " ");
                first = x;
            } else {
                break;
            }
        } while (x >= first);
    }
}
