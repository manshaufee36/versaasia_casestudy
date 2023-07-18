//Online Case Study (Versa Asia - Backend Developer Intern)
//By Lukman Shaufee 

package versaasia;

//Import the libraries to be use
import java.io.*;
import org.json.*;

public class VersaAsia 
{
    public static void main(String[] args) 
    {
        //Declare the variable for array in JSON type
        JSONArray arr = new JSONArray();
        
        //Initiation of the iteration
        for(int i=1; i<=100; i++)
        {
            //Check if the number divisible by 3 and 5
            if((i%3 == 0) & (i%5 == 0))
            {
                arr.put("BIG BANG");
            }
            //Check if the number divisible by 3
            else if(i%3 == 0)
            {
                arr.put("BIG");
            }
            //Check if the number divisible by 5
            else if(i%5 == 0)
            {
                arr.put("BANG");
            }
            else {
                //If it not divisible then print the num
                arr.put(i);
            }
        }
        
        //Create an object to save out the output in JSON object
        JSONObject obj = new JSONObject();
        try
        {
            obj.put("output", arr);
        }
        catch (JSONException e)
        {
            System.out.println("There's error occured while crating JSON object");
            e.printStackTrace();
            return;
        }
        
        //Create an output file to save the JSON output file
        try (FileWriter fw = new FileWriter("output.json"))
        {
            fw.write(obj.toString());
            System.out.println("Output have been saved");
        } 
        catch (IOException e)
        {
            System.out.println("There's error occured while saving the output");
            e.printStackTrace();
        }
    } 
}
