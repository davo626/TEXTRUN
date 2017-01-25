package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        String[] answer = new String[n];
        answer[0] = "1. не, я будильник сейчас поставлю, сам встану\n";
        answer[1] = "2.да, разбуди пожалуйста\n";
        answer[2] = "1. наспех умываешься и чистишь зубы\n";
        answer[3] = "2. чщательно чистишь зубы и приводишь себя в порядок\n";
        answer[4] = "1. выбираешь новую рубашку\n";
        answer[5] = "2. хватаешь первую попавшуюся одежду,быстро надеваешь\n";
        answer[6] = "1.позавтракать\n";
        answer[7] = "2. быстро попить чаю\n";
        answer[8] = "1. сесть в автобус\n";
        answer[9] = "2. пойти пешком\n";

        String[] result = new String[n + 1];
        result[0] = " будильник звонит уже минут 15.\n" +
                "осознаешь, что опаздываешь на учебу\n" +
                "бегом вскакиваешь и бежишь в ванную\n";
        result[1] = "СЫН! ШЕСТЬ УТРА! ПОДЪЕМ, А ТО ВОДОЙ ОБОЛЬЮ!\n" +
                "не понимешь, зачем тебя подняли в такую рань.\n" +
                "*одно новое уведомление*\n" +
                "открываешь ютуб\n" +
                "спустя час осознаешь, что провел в интернете на 20 минут больше, чем нужно\n";
        result[2] = " выглядишь все еще не очень, но ты потратил на это совсем немного времени!\n";
        result[3] = "отлично выглядишь, но наверное сейчас это было лишним\n" +
                "стоит поторопиться!\n";
        result[4] = "выглядишь отлично\n";
        result[5] = "рубашка оказалась мятая, пришлрось переодевать\n";
        result[6] = "было вкусно, но медленно\n";
        result[7] = "быстро, но ты голодный\n";
        result[8] = "автобус тебе подходит, отлично\n";
        result[9] = "ну, зато ты точно уверен, что не уедешь туда, куда не надо\n";
        result[10] = "ЧЕРТ, это не твой автобус!!!\n";

        int m = 8;
        String[] story = new String[m];
        story[0] = "ВЕЧЕР\n" +
                "никого не трогаешь, листаешь мемы в вк\n" +
                "golos s kuhni\n" +
                "СЫНОК! ПОРА СПАТЬ! ТЕБЯ УТРОМ БУДИТЬ?\n";
        story[1] = "СПОКОЙНОЙ НОЧИ!!!\n" +
                "ложишься спать\n" +
                "@@@@\n"+
                "хрррррррррп\n" +
                "@@@@\n"+
                "глаза не хотят открываться\n" +
                "сквозь сон слышишь странные звуки\n";
        story[2] = " бежишь в ванную";
        story[3] = "бегом в комнату, одеваться!\n" +
                "что же надеть, а?\n";

        story[4] = "идешь на кухню";
        story[5]="идешь в прихожую\n" +
                "одеваешьсся\n" +
                "бежишь на остановку\n" +
                "видишь, что на ней стоит автобус\n" +
                "возможно именно тот, который тебе нужен.\n" +
                "примерно с шансом 33%";
        story[6]="неужели!\n" +
                "ты добрался до школы\n" +
                "дергаешь за дверную ручку\n" +
                "дверь не поддается\n" +
                "дергаешь сильнее\n" +
                "все равно не открывается\n" +
                "*бзынь*\n" +
                "смотришь в телефон\n" +
                "календарь показывает, что сегодня воскресенье\n" +
                "на реактивной тяге уетаешь домой\n";
        story[7]="конец";

        System.out.println(story[0]+answer[0]+answer[1]);
        int decision = sc.nextInt() ;
        if (decision == 1){
            System.out.println(story[1]+result[0]+story[2]);
        }else {
            System.out.println(story[1] + result[1] + story[2]);
        }
        System.out.println(answer[2]+answer[3]);
        decision = sc.nextInt() ;
        if (decision == 1){
            System.out.println(result[2]+story[3]);
        }else{
            System.out.println(result[3]+story[3]);
        }
        System.out.println(answer[4]+answer[5]);
        decision = sc.nextInt();
        if (decision == 1){
            System.out.println(result[4]+story[4]);
        }else{
            System.out.println(result[5]+story[4]);
        }
        System.out.println(answer[6]+answer[7]);
        decision = sc.nextInt();
        if (decision == 1) {
            System.out.println(result[6] + story[5]);
        }else{
            System.out.println(result[7] + story[5]);
        }
        System.out.println(answer[8]+answer[9]);
        int decisionA = sc.nextInt();
        if (decisionA == 1) {
             if(decision == 1) {
                 System.out.println(result[8]+story[6]);
             }else {
                 System.out.println(result[10]+story[6]);
             }
        }else{
            System.out.println(result[9]+story[6]);
        }
        System.out.println(story[7]);
    }
}