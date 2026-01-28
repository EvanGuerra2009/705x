import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class prog705x {
    public static void main(String[] args) throws Exception {
    
        ArrayList<String[]> list = new ArrayList<String[]>();

        String word = "";

        Scanner r = new Scanner(new File ("prg.512h.txt"));

        Scanner b = new Scanner(new File ("prg.705x.txt"));


        for(int lcv=0;lcv>10 ;lcv++){
            System.out.print(lcv);
        }
        while (r.hasNextLine()) {
            String line = r.nextLine();
            String[] parts = line.split(" ");
            list.add(parts);
        }

        while (b.hasNextLine()) {
                int mainnum = b.nextInt();

                int num2 = mainnum/100;
                
                int num3 = mainnum%100/10;
                int num4 = mainnum%10;
                String[] fun =list.get(num2-1);

                String newWord = fun[num3-1];

                String letter = newWord.substring(num4-1, num4);

                System.out.print(letter);

                word += letter;
            }
    }
}
        
    

