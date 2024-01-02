public class OneOfEach {
    public static void main(String[] args){
        int boy = 0;
        int girl = 0;
        boolean OneBoy;
        boolean OneGirl;
        do {
            if (Math.random() < 0.5){
                boy += 1;
                System.out.print("b ");
            } else {
                girl += 1;
                System.out.print("g ");
            }
            OneBoy = (boy >= 1);
            OneGirl = (girl >= 1);
        } while (!(OneBoy && OneGirl));
        System.out.println();
        System.out.print("You made it... and you now have " + (boy + girl) + " children.");
    }
}
