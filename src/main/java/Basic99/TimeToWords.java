package Basic99;

/**
 * Created by root on 12/11/15.
 */
public class TimeToWords {

    public static final String[] times = {"O'Clock" ,"One" , "Two" , "Three" ,"Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Eleven" ,
            "Twelve" , "Thirteen" , "Fourteen" , "Quarter" , "Sixteen" , "Seventeen" , "Eighteen" , "Nineteen" , "Twenty" ,
            "Twenty One" , "Twenty Two" , "Twenty Three" , "Twenty Four" , "Twenty Five" , "Twenty Six" , "Twent Seven" , "Twenty Eight",
            "Twenty Nine" , "Half"};

    public String getTimeInWords(String time){

        if(time==null || time.equals("")){
            return  time;
        }


        String[] split = time.split(":");

        String timeInWords= times[Integer.parseInt(split[0])];

        int minutes = Integer.parseInt(split[1]);

        if(minutes > 0 && minutes <= 30){
            timeInWords = times[minutes] + " past " + timeInWords;
        }
        else if(minutes>30 && minutes <60){
            timeInWords= times[(60 -minutes)] + " to " + timeInWords;
        }
        else if(minutes== 0){
            timeInWords = timeInWords + " " + times[minutes];
        }


     return timeInWords;
    }
}
