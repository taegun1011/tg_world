package ConceptAndBasic;

import java.util.Scanner;

public class NewSwitch {
    //자바 12 버전부터 지원
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grade = sc.next();
        double score = switch(grade){
            case "A+" -> 4.5;
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3;
            case "C+" -> 2.5;
            case "C" -> 2;
            case "D", "F" -> 0;
            default -> {
                System.out.println("형식에 맞게 입력해주세요");
                yield 0;
            }
        };
        System.out.println("score = " + score);
    }
}
