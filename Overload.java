package question3;

public class Overload {
    public static void main(String[] args) {
        ndanu("A","B","C");
        ndanu("Mercy","ndanu","wambua");
        ndanu(52,96,69);
        ndanu(45.3,56.2,45.3);

    }

    public static String ndanu(String x, String y, String z) {
        String ans = x + y + z;
        System.out.println(ans);
        return ans;
    }

    public static Integer ndanu(Integer x, Integer y, Integer z) {
        Integer ans = x + y + z;
        System.out.println(ans);
        return ans;
    }

    public static Double ndanu(Double x, Double y, Double z) {
        Double ans = x + y + z;
        System.out.println(ans);
        return ans;
    }
    public static char ndanu(char x,char y,char z) {
        char ans = x ;
        System.out.println(ans);
        return ans;
    }
}
