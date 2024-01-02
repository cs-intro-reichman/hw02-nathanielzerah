public class OneOfEachStats{
    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);
        int boy = 0;
        int girl = 0;
        boolean OneBoy;
        boolean OneGirl;
        int TwoChildren = 0;
        int ThreeChildren = 0;
        int MoreChildren = 0;
        double TotalChildren = 0;
        for (int x = 0; x < T; x++) {
        do {
            if (generator.nextDouble() < 0.5){
                boy += 1;
            } else {
                girl += 1;
            }
            OneBoy = (boy >= 1);
            OneGirl = (girl >= 1);
        } while (!(OneBoy && OneGirl));
        if ((boy + girl) == 2) {
            TwoChildren += 1;
        } else if ((boy + girl) == 3){
            ThreeChildren += 1;
        } else if ((boy + girl) >= 4){
            MoreChildren += 1;
        }
        TotalChildren += (boy + girl);
        boy = 0;
        girl = 0;
        }
        System.out.println("Average: " + (TotalChildren / T) + " children to get at least one of each gender.");
        int max =  Math.max(TwoChildren , Math.max(ThreeChildren , MoreChildren));
        System.out.println("Number of families with 2 children: " + TwoChildren);
        System.out.println("Number of families with 3 children: " + ThreeChildren);
        System.out.println("Number of families with 4 or more children: " + MoreChildren);
        if (max == TwoChildren) {
            System.out.println("The most common number of children is 2.");
        } else if (max == ThreeChildren) {
            System.out.println("The most common number of children is 3.");
        } else if (max == MoreChildren) {
            System.out.println("The most common number of children is 4 or more.");
        }
    }
}
