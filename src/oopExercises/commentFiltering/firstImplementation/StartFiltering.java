package oopExercises.commentFiltering.firstImplementation;

import java.util.Scanner;

public class StartFiltering {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter spam words or spam expressions separated by comma and space:");
        String[] spamKeywords = input.nextLine().toLowerCase().split(",\\s+");

        int commentMaxLength = 0;

        while(commentMaxLength <= 0) {
            System.out.println("Enter a max length of comment:");
            try {
                commentMaxLength = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }

        TextAnalyzer negative = new NegativeTextAnalyzer();
        TextAnalyzer spam = new SpamAnalyzer(spamKeywords);
        TextAnalyzer tooLong = new TooLongTextAnalyzer(commentMaxLength);

        TextAnalyzer[] analyzers = {negative, spam, tooLong};

        System.out.println("Enter some comment or \"end\":");
        String comment;

        while (!(comment = input.nextLine()).equals("end")) {
            Label result = checkLabels(analyzers, comment.toLowerCase());
            if(result.equals(Label.OK)) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(comment);
                System.out.println("--------------------------------------------------------------------------------");
            }
            else {
                System.out.println(result);
            }
            System.out.println("Enter some comment or \"end\":");
        }
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(TextAnalyzer a : analyzers) {
            if(a.processText(text).equals(Label.NEGATIVE_TEXT))return Label.NEGATIVE_TEXT;
            else if(a.processText(text).equals(Label.SPAM))return Label.SPAM;
            else if(a.processText(text).equals(Label.TOO_LONG))return Label.TOO_LONG;
        }
        return Label.OK;
    }
}



//Condition

//Създайте система за филтриране на коментари, за някакъв уеб портал, независимо дали става дума за новини, видео хостинг
//или платформа за обучение.
//Трябва да филтрирате коментари по различни критерии и да бъде възможно, лесно да добавяте нови филтри или да променяте старите.

//Да приемем, че ще филтрираме спам, коментари с отрицателно съдържание и твърде дълги коментари:
//Ще филтрираме СПАМЪТ по наличието на посочените ключови думи в текста;
//Ще определяме НЕГАТИВНОТО СЪДЪРЖАНИЕ чрез наличието на един от трите емотикона - " :( ", " =( " и " :| ";
//Ще определяме ТВЪРДЕ ДЪЛГИТЕ КОМЕНТАРИ въз основа на зададено число - максималната дължина на коментара;

//Трябва да създадете интерфейс TextAnalyzer за филтъра;
//Изброяване - Label, който съдържа следните константи: SPAM, NEGATIVE_TEXT, TOO_LONG, OK;
//След това трябва да създадете три класа, които реализират интерфейс TextAnalyzer: SpamAnalyzer, NegativeTextAnalyzer и TooLongTextAnalyzer;
// - Обектът на SpamAnalyzer трябва да съхранява масив от низове с ключови думи. Класът трябва да съдържа private поле keywords,
//   в което да се съхранява, този масив от низове с ключови думи;
// - NegativeTextAnalyzer трябва да има конструктор по подразбиране;
// - TooLongTextAnalyzer трябва да има private int поле - maxLength, за максимално допустимата дължина на коментара;

//Сигурност вече сте забелязали, че SpamAnalyzer и NegativeTextAnalyzer са много сходни, и двата проверяват текста,
//за наличието на някакви ключови думи. При спам ги получаваме от конструктора, а в случай на отрицателен текст, имаме
//предварително определен набор от тъжни емотикони. В случай на намиране на една от ключовите думи, се връща Label,
//съответно: или SPAM или NEGATIVE_TEXT. Ако нищо не е намерено, се връща OK.

//Тази логика трябва да бъде имплементирана в абстрактен клас KeywordAnalyzer, по следният начин:
//Трябва да дефинираме два абстрактни метода, getKeywords и getLabel, единият, от които ще връща набор от ключови думи, а другият препратка,
//която трябва да се използва за маркиране на положителни събития. Тези методи трябва да са достъпни само за класовете наследници.
//Трябва да реализираме processText, така че да зависи само от getKeywords и getLabel.
//Трябва да направим SpamAnalyzer и NegativeTextAnalyzer наследници на KeywordAnalyzer и да реализираме абстрактните методи.

//Напишете метод checkLabels, който да връща, препратка за коментар по дадените анализатори на текста.
//checkLabels трябва да връща, препратка, не-ОК ако някой от анализаторите върне резултат, различен от OK и препратка OK,
//ако всички анализатори са върнали OK.



//Test

//This comment is so good, This comment is so bad, Don't bother me with nonsense, fuck you, fool, idiot, jerk, cunt
//500
//Did you watch the recent launches into space by Sir Richard Branson and Jeff Bezos? I watched it with my family, but like many others I was questioning what this really means to the rest of us ordinary people. I know many people think how the money spent launching just a few people to the edge of space, could be better spent. What do you think? Share your thoughts.
//Don't bother me with nonsense.
//Damn rich people :(
//Supporters of the billionaire space race make two arguments in its favor. The first is a practical one. They argue that the battle for space dominance among these companies will lead to technological breakthroughs that will ultimately be utilized by people on Earth — just as the space race of the 1960s did. Others say companies like Blue Origin and SpaceX are a boon for science because their advanced new rockets open up new opportunities for research that cash-strapped space agencies like NASA aren’t able to complete on their own. The second argument in favor is more philosophical. Private space companies have reignited the world’s passion for space exploration, which had been dormant for decades, they argue. “We never want to lose our character as explorers, as adventurers,” Nelson said. Critics say the billionaires are much more focused on personal glory and profit than they are on any benefits that might trickle down to regular people. If Bezos, Musk and Branson were truly concerned about benefiting humanity, detractors argue, they would put their vast wealth and ingenuity toward solving the many major problems facing people on Earth, like climate change, poverty and hunger.
//If we see history, it is true that general commodities we give now for granted, they started many times being luxuries many years, even centuries ago. So I think yes, history can be repeated. One thing is unbridled luxury, a very negative thing, and another to go against any kind of luxury. These billionaires may be helping progress.
//Hi Alex. Thank you for sharing your thoughts. I think you are right.
//Idiots!
