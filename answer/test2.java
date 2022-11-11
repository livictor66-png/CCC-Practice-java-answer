
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inGroupCount = Integer.parseInt(scan.nextLine()) ;
        System.out.println("inGroupCount="+ inGroupCount);

        Map<String, String> mapInGroup = new HashMap<>();
        for (int i = 0; i < inGroupCount; i++) {
            String lineData = scan.nextLine();
            mapInGroup.put(lineData, "");
        }
        int notInGroupCount = Integer.parseInt(scan.nextLine());
        System.out.println("notInGroupCount="+ notInGroupCount);
        Map<String, String> mapNotInGroup = new HashMap<>();
        for (int i = 0; i < notInGroupCount; i++) {
            mapNotInGroup.put(scan.nextLine(), "");
        }
        int result = 0 ;
        int currentGroupCount =Integer.parseInt(scan.nextLine()) ;
        Map<String, String> mapGroup = new HashMap<>();
        System.out.println("currentGroupCount="+ currentGroupCount);
        for (int i = 0; i < currentGroupCount; i++) {
            String currentGroup = scan.nextLine();
            mapGroup.put(currentGroup, "");
            int match2 = getNotInGroup(currentGroup, mapNotInGroup);
            System.out.println("match2=" + match2);
            result += match2;
        }

        int match1 = get2personinGroup(mapGroup, mapInGroup);
        result +=match1;



        System.out.println(result);
    }

    private static int get2personinGroup(Map<String, String> mapGroup, Map<String, String> mapInGroup) {
        boolean b=false ;
        int result=0;
        for (Map.Entry<String, String> entry : mapInGroup.entrySet()) {
            String key = entry.getKey();
            String[] personName = key.split(" ");
            b=false;
            int tempCounter = 0 ;
            tempCounter = 0 ;
            for (Map.Entry<String, String> entry2: mapGroup.entrySet()) {
                String group3person = entry2.getKey();
                if(group3person.contains(personName[0] ) && group3person.contains(personName[1])){
                    b= true;
                    break ;
                }
            }
            if (b) {
                tempCounter=0;
                continue ;
            }
            else{
                tempCounter ++;
            }
            result += tempCounter;
        }
        return result;


    }

    private static int getNotInGroup(String currentGroup, Map<String, String> mapNotInGroup) {
        int confict = 0 ;
        for (Map.Entry<String, String> entry : mapNotInGroup.entrySet()) {
            String key = entry.getKey();
            String[] personName = key.split(" ");
            if (currentGroup.contains(personName[0]) && currentGroup.contains(personName[1]) )
            {
                confict++;
            }
        }
        return confict;
    }


}