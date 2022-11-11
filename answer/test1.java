
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caseCount = scan.nextInt() ;
        Deque<Integer> mountain= new LinkedList<>();
        Deque<Integer> branch= new LinkedList<>();
        for (int i = 0; i < caseCount; i++) {
            mountain.clear();
            branch.clear();
            int trainCount =scan.nextInt();
            for (int j = 0; j < trainCount; j++) {
                mountain.push(scan.nextInt()); ;
            }
            int currentLowest = 1 ;
            while(mountain.peekFirst() != currentLowest) {
                branch.push(mountain.pop());
            }
            String result = "Y";
            while (mountain.size() > 0 || branch.size() >0)
            {
                if (mountain.size() > 0 && branch.size() >0) {
                    if (branch.peek() == currentLowest) {
                        branch.pop();
                        currentLowest ++;
                    }
                    else if ( mountain.peek() == currentLowest) {
                        mountain.pop();
                        currentLowest += 1;
                    }
                    else {
                        branch.push(mountain.pop());
                    }
                } else if ( branch.size() > 0 ) {
                    if (branch.peek() == currentLowest)
                    {
                        branch.pop();
                        currentLowest ++;
                    }
                    else {
                        result = "N";
                        break;
                    }
                } else {
                    if (mountain.peek() == currentLowest) {
                        mountain.pop();
                        currentLowest += 1;
                    }
                    else {
                        branch.push(mountain.pop());
                    }
                }
            }
            System.out.println(result);
        }
    }
}
