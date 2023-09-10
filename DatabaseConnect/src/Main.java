import java.sql.*;

public class Main {
    public static void main(String[] args) {


      //  Oracle_Sample oracleSample = new Oracle_Sample();
        
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@194.163.169.38:1521:","system","maneger");
            System.out.println("done");
        }
      catch (Exception e){
          System.out.println("no");
      }

    }
}

//// spring.datasource.url=jdbc:oracle:thin:@ip:port.

