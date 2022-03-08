package methodsExercises.roles;

import java.io.*;

public class Roles {
    public static void main(String[] args) {
        String data;
        int counter1 = 0, counter2 = 0;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("src\\methodsExercises\\roles\\roles.txt"));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("src\\methodsExercises\\roles\\aPlay.txt"))) {
            reader.readLine();
            while (!(data = reader.readLine()).equals("text-lines:")) {
                writer1.write(data);
                writer1.newLine();
                counter1++;
            }
            while (!(data = reader.readLine()).equals("")) {
                writer2.write(data);
                writer2.newLine();
                counter2++;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        String[] roles = new String[counter1];
        counter1 = 0;

        try(BufferedReader rolesReader = new BufferedReader(new FileReader("src\\methodsExercises\\roles\\roles.txt"))) {
            while((data = rolesReader.readLine())!= null){
                roles[counter1++] = data;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        String[] textLines = new String[counter2];
        counter2 = 0;

        try(BufferedReader aPlayReader = new BufferedReader(new FileReader("src\\methodsExercises\\roles\\aPlay.txt"))) {
            while((data = aPlayReader.readLine())!= null){
                textLines[counter2++] = data;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < roles.length; a++) {
            sb.append(roles[a]);
            sb.append(":\n");
            for (int b = 0; b < textLines.length; b++) {
                if(textLines[b].startsWith(roles[a])) {
                    sb.append(b + 1);
                    sb.append(")");
                    sb.append(textLines[b].substring(roles[a].length() + 1));
                    sb.append("\n");
                }
            }
            sb.append("\n");
        }
        return "" + sb;
    }
}



//Тест

//Input

//roles:
//ГЛОСТЪР
//ГОНЕРИЛА
//ЕДМЪНД
//КЕНТ
//КОРДЕЛИЯ
//ЛИР
//РЕГАНА
//text-lines:
//КЕНТ: Мислех, че кралят обича повече Олбанския княз, отколкото Корнуолеца.
//ГЛОСТЪР: Всички мислехме тъй. Но сега от това как е разделил кралството не личи кого от двамата цени повече — частите са така изравнени, че никой от тях не би предпочел дела на другия, ако внимателно претегли качествата им.
//КЕНТ: Този млад човек е навярно ваш син, милорд?
//ГЛОСТЪР: Малко съм отговорен за него. Толкоз пъти съм се червял от това, че вече челото ми е закалено.
//КЕНТ: Не можах да ви схвана, сър.
//ГЛОСТЪР: Затова пък майката на този приятел ме схвана, подхвана и наду корема тъй бързо, че се сдоби с хлапак за люлката, преди да се е сдобила със съпруг за леглото. Намирисва на грях, а?
//КЕНТ: Не мога да осъдя един грях, който има такова добро последствие.
//ГЛОСТЪР: Аз имам, сър, и законен син, около година по-голям, но той не е по-драг на сърцето ми. Наистина този разбойник се появи на света малко нахално, без никой да го е канил, но майка му си я биваше и правенето му беше приятно, тъй че сега трябва да го признавам, кучия му син! Едмънд, знаеш ли кой е този благородник?
//ЕДМЪНД: Не, господарю.
//ГЛОСТЪР: Това е граф Кент. Помни го като мой уважаван приятел.
//ЕДМЪНД: Покорен ваш слуга, милорд!
//КЕНТ: Харесвате ми. Ще гледам да ви опозная по-отблизо.
//ЕДМЪНД: Ще се старая да заслужа честта, сър.
//ГЛОСТЪР: Беше в чужбина девет години и скоро пак ще замине. Кралят иде!



//Output

//ГЛОСТЪР:
//2) Всички мислехме тъй. Но сега от това как е разделил кралството не личи кого от двамата цени повече — частите са така изравнени, че никой от тях не би предпочел дела на другия, ако внимателно претегли качествата им.
//4) Малко съм отговорен за него. Толкоз пъти съм се червял от това, че вече челото ми е закалено.
//6) Затова пък майката на този приятел ме схвана, подхвана и наду корема тъй бързо, че се сдоби с хлапак за люлката, преди да се е сдобила със съпруг за леглото. Намирисва на грях, а?
//8) Аз имам, сър, и законен син, около година по-голям, но той не е по-драг на сърцето ми. Наистина този разбойник се появи на света малко нахално, без никой да го е канил, но майка му си я биваше и правенето му беше приятно, тъй че сега трябва да го признавам, кучия му син! Едмънд, знаеш ли кой е този благородник?
//10) Това е граф Кент. Помни го като мой уважаван приятел.
//14) Беше в чужбина девет години и скоро пак ще замине. Кралят иде!
//
//ГОНЕРИЛА:
//
//ЕДМЪНД:
//9) Не, господарю.
//11) Покорен ваш слуга, милорд!
//13) Ще се старая да заслужа честта, сър.
//
//КЕНТ:
//1) Мислех, че кралят обича повече Олбанския княз, отколкото Корнуолеца.
//3) Този млад човек е навярно ваш син, милорд?
//5) Не можах да ви схвана, сър.
//7) Не мога да осъдя един грях, който има такова добро последствие.
//12) Харесвате ми. Ще гледам да ви опозная по-отблизо.
//
//КОРДЕЛИЯ:
//
//ЛИР:
//
//РЕГАНА:
