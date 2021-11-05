package com.knoldus.Ques6;
import java.io.*;

public class Histogram {
    public static void main (String[] args)
    {
        File file = new File("src/main/java/com/knoldus/Ques6/data.txt");
        BufferedReader br = null;
        String line;
        int[] nums = new int[101];
        int base10 = 0;
        try {
            br = new BufferedReader(new FileReader(file));
            int i = 0;
            int no = Integer.parseInt(br.readLine());
            while ((line = br.readLine())!=null){
                nums[no]++;
                no = Integer.parseInt(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        for (int count = 1; count <=100;count+=10)
        {

            System.out.print(count + " - " + (base10+=10) + "  \t| " );
            for (int index = count ; index<=base10 ; index++)
            {
                while(nums[index] > 0) {
                    System.out.print("* ");
                    nums[index]--;
                }
            }
            System.out.println();
        }
    }
}
