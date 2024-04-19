
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.util.HashMap;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
     static int romanTo(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));
            System.out.println(currValue );

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
    static void romanToInt(String s) {
        String sc = "IVXLCDM";
        int c =0;
        if (sc.contains(s)){
            if(s == "I"){
                c++;
            }
            if(s == "II"){
                System.out.println("2");
            }
            if(s == "III"){
                System.out.println("3");
            }
        }

    };
    public static void main(String[] args) throws Exception {



        System.out.println(romanTo("XV"));


/*
        try {

            URL url = new URL("https://mocki.io/v1/7bb18d0b-5bfd-48da-b389-a3a0b6d5ced2");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Response: " + response.toString());

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(response.toString());
            String status = jsonNode.get("statu").asText();
            int code = jsonNode.get("code").asInt();
            System.out.println(status + " "+ code);

            Connection conx =null;
            PreparedStatement prepared ;
            String sql = "insert into online (status,code) values(?,?)";


            conx = ConnexionMysql.ConnecDB();
            assert conx != null;
            prepared =conx.prepareStatement(sql);
            prepared.setString(1,status);
            prepared.setInt(2,code);
            prepared.execute();




            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


 */
/*
        Scanner scanner = new Scanner(new File("Config.txt"));
        String line = scanner.nextLine();
        Class<?> typepaiment = Class.forName(line);
        Paiment obj = (Paiment) typepaiment.newInstance();
 //       Class<?> type = Class.forName(line);
 //     Constructor<?> constructor = type.getConstructor();
 //       return (Paiment) constructor.newInstance();


        Commande commande = new Commande(obj);
        commande.effctuerPaiment();

 */

    }
}



