import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IpSplit {
    public static void main(String[] args) {
        String ip = "300.168.0.1";

        
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            String[] arr = ip.split("\\.");

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Invalid IP address format");
        }
    }
}