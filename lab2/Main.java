import javax.sound.midi.Instrument;
import java.util.*;

public class Main {

    public static int question(String question, int Range1, int Range2){
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do
        {
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // this is important!
            }
            i = sc.nextInt();

        } while (i<Range1 || i>Range2);
        return i;
    }
    public static void main(String args[]) {
        Map<Integer, Instruments> set  = new HashMap<>();
        set.put(1+3, new Instruments("Bayan"));
        set.put(1+4, new Instruments("Piano"));
        set.put(1+5, new Instruments("Synthesizer"));
        set.put(2+6+8, new Instruments("Harp"));
        set.put(2+6+9, new Instruments("Cello"));
        set.put(2+7+10, new Instruments("Guitar"));
        set.put(2+7+11, new Instruments("Violin"));
        String [] questions = {  "Музыкальный инструмент клавишный(1) / струнный(2)",
                "Для извлечения звука используются меха(3) / струны(4) / электроника(5)",
                "Инструмент имеет точку опоры на полу (6) / держится в руках(7)",
                "Звук извлекается пальцами руки(8) / смычком(9)",
                "Звук извлекается пальцами руки(10) / смычком(11)"};
        int i[] = new int [3];

        i[0] = question(questions[0], 1, 2);
        if(i[0] == 1)
        {
            i[1] = question(questions[i[0]], 3, 5);
            System.out.println(set.get(i[0] + i[1]).toString());
        }
        else
        {
            i[1] = question(questions[i[0]], 6, 7);
            int a = 5;
            i[2] = i[1] == 6 ? question(questions[3], 8, 9) :  question(questions[4], 10, 11);
            System.out.println(set.get(i[0] + i[1] + i[2]).toString());
        }
    }
}
