import java.util.HashMap;
import java.util.Map;

public class Init {
   static Map<String, String> abonent = new HashMap<String, String>();
    static void initList(){
        abonent.put("0507467091", "Bondarenko");
        abonent.put("0660782513", "Guzko");
        abonent.put("0990152356", "Skripka");
        abonent.put("0676452315", "Mixalko");
        abonent.put("0667234561", "Mixalko");
        abonent.put("0682281488", "Guzko");
        System.out.println("Выберете как вы хотите найти абонента");
        System.out.println("1.По номеру 2.По фамилии 0.Выход");
    }

}