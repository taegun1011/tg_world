package ConceptAndBasic;

public class StringMethod {
    static String str = "CodingNojam";

    public static void main(String[] args) {

        //2번째 인자는 length 가 아니라 endIndex다
        System.out.println("substring from 6 to 8 : " + str.substring(6, 8));

        String target1 = "No", target2 = "Yes";
        printIfExist(target1);
        printIfExist(target2);

        String strWithBlank = "C o d i n g N o j a m";
        String strWithComma = strWithBlank.replace(' ', ',');
        System.out.println("strWithComma = " + strWithComma);
        for(String s : strWithComma.split(","))
            System.out.print(s);


    }

    private static void printIfExist(String target){
        int index = str.indexOf(target);
        System.out.println("index = " + index);
        if(str.contains(target)){
            System.out.println(str.substring(index, index + target.length()));
            return;
        }

        System.out.println("Do not exist");
    }
}
