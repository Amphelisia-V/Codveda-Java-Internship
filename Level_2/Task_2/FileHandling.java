package Level_2.Task_2;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileHandling {
      public static void main(String[] args)
    {
        // Variable
        int lineCount =0;
        int wordCount =0;

        String input ="Level_2/Task_2/input.txt";
        String output="Level_2/Task_2/output.txt";

        try//fileReader onlyဘဲဆိုerror တက်နိုင်တာကြောင့် try/catchကိုခေါ်သုံး
        {
            //Reading
            FileReader fr= new FileReader(input);
            BufferedReader br=new BufferedReader(fr);//fileRreader နဲ့ချိတ်ထားတာ, bufferedReaderကစာကြောင်းဖတ်ဖို့သုံး
             FileWriter fw= new FileWriter(output);
                BufferedWriter bw=new BufferedWriter(fw);
            String line;

            //readline() loop
            while((line=br.readLine()) != null) //why use check null, because "စာကြောင်းဖတ်လို့ရနေသရွေ့ (null မဖြစ်သေးသရွေ့) loop ကို ဆက်လုပ်ပါ"
            {
                // Process data
                lineCount++;
                String[] words= line.split(" ");
                wordCount += words.length;
               
                //wordCount ကိုရေတဲ့အခါ split(" ") ကိုသုံးရ 
                //split() ဆိုတာ String တစ်ခုကို အပိုင်းပိုင်းခွဲပေးတဲ့ method ပါ။
            }
            
                
                bw.write("File Analysis Result");
                bw.newLine();

                bw.write("Total Lines: " + lineCount);
                bw.newLine();

                bw.write("Total Words: " + wordCount);
                            
                
             br.close();
             bw.close();
              System.out.println("File processed successfully");
            
        }catch(FileNotFoundException e)
        {
            System.out.println("file not found");
        }
        catch(IOException e)
        {
           System.out.println("error reading file");
        }
       
    }
}
