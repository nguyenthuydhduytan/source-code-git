import java.util.Calendar;

public class DateTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        int gio = cal.get(Calendar.HOUR_OF_DAY);
        int phut = cal.get(Calendar.MINUTE);
        int giay = cal.get(Calendar.SECOND);
        System.out.println("Năm: " + nam);
        System.out.println("Tháng: " + thang);
        System.out.println("Ngày: " + ngay);
        System.out.println("Giờ: " + gio);
        System.out.println("Phút: " + phut);
        System.out.println("Giây: " + giay);
        
    }
}

