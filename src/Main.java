import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namn=new ArrayList<String>();
        namn.add("Luke");
        namn.add("Leia");
        namn.add("Han");

        ArrayList<Integer> heltal = new ArrayList<Integer>();
        heltal.add(421);
        heltal.add(1977);
        heltal.add(1138);
        heltal.add(2187);

        System.out.println();

        for (int i = 0; i<namn.size(); i++){
            System.out.println(namn.get(i));

        }
        System.out.println();

        for (int i = namn.size() -1; i>=0; i--){
            System.out.println(namn.get(i));

        }
    }
}