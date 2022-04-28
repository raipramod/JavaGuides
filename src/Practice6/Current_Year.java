package Practice6;

import java.util.Calendar;

public class Current_Year {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Year is :" + c.get(Calendar.YEAR));
    }
}
