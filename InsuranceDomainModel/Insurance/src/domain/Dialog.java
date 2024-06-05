package domain;

import java.util.Scanner;
import domain.constants.EMenu;

public class Dialog {

    private static final int SEPARATOR_LENGTH = 60;

    private static Scanner scanner = new Scanner(System.in);
    public static void separator1() {
        separator('-');
    }
    public static void separator1(String msg){
        separator(msg, '-');
    }
    public static void separator(char separatorChar){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < SEPARATOR_LENGTH; i++){
            sb.append(separatorChar);
        }
        System.out.println(sb.toString());
    }

    public static void separator2(){
        separator('=');
    }
    public static void separator2(String msg){
        separator(msg, '=');
    }
    public static void title(String msg){
        separator2();
        border(msg);
        separator2();
        lineFeed();
    }
    public static void lineFeed(){
        System.out.println();
    }

    public static void separator(String msg, char separatorChar) {
        int msgLength = msg.length();
        int totalPadding = SEPARATOR_LENGTH - msgLength - 2;
        int paddingEachSide = totalPadding / 2;
        int extraPadding = totalPadding % 2;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paddingEachSide; i++) {
            sb.append(separatorChar);
        }
        sb.append(' ').append(msg).append(' ');
        for (int i = 0; i < paddingEachSide + extraPadding; i++) {
            sb.append(separatorChar);
        }
        System.out.println(sb.toString());
    }

    private static void border() {
        border("");
    }
    public static void border(String msg) {
        int msgLength = msg.length();
        int totalPadding = SEPARATOR_LENGTH - msgLength - 2;
        int paddingEachSide = totalPadding / 2;
        int extraPadding = totalPadding % 2;

        StringBuilder sb = new StringBuilder();
        sb.append('|');
        for (int i = 0; i < paddingEachSide; i++) {
            sb.append(' ');
        }
        sb.append(msg);
        for (int i = 0; i < paddingEachSide + extraPadding; i++) {
            sb.append(' ');
        }
        sb.append('|');
        System.out.println(sb.toString());
    }

    public static void systemMsg(Object msg){
        System.out.println("[시스템] : " + msg);
    }

    public static void userInputMark(){
        System.out.print(">>");
    }
    public static String inputField(String fieldName){
        System.out.print(fieldName + " : ");
        return scanner.nextLine();
    }

//    public static int alternativeOption(EOperation operation1, EOperation operation2) {
//        String option1 = "1. " + operation1.getMenuName();
//        String option2 = "2. " + operation2.getMenuName();
//        int msg1Length = option1.length();
//        int msg2Length = option2.length();
//        int totalPadding = SEPARATOR_LENGTH - msg1Length - msg2Length - 6;
//        int paddingBetween = totalPadding / 2;
//        int extraPadding = totalPadding % 2;
//
//        separator1();
//        StringBuilder sb = new StringBuilder(SEPARATOR_LENGTH);
//        sb.append('|');
//        sb.append(' ');
//        sb.append(option1);
//        for (int i = 0; i < paddingBetween; i++) {
//            sb.append(' ');
//        }
//        sb.append('|');
//        for (int i = 0; i < paddingBetween + extraPadding; i++) {
//            sb.append(' ');
//        }
//        sb.append(option2);
//        sb.append(' ');
//        sb.append('|');
//        System.out.println(sb.toString());
//        separator1();
//
//        return selectInRange(2);
//    }

    public String inputAsString(String msg){
        userInputMark();
        return scanner.nextLine();
    }



    public static void showMenus(EMenu[] menus){
        for (int i = 0; i < menus.length; i++){
            System.out.println("    " + (i+1) + ". " + menus[i].getMenuName());
        }
    }


    /** 1 부터 range개의 정수를 입력 받아 리턴
     * 범위 밖의 값이 입력되거나 정수가 아닌값이 입력되면
     * 다시 입력받음.
     */
    public static int selectInRange(int range){
        int select = -1;
        while (select < 0 || select >= range) {
            try {
                userInputMark();
                select = Integer.parseInt(scanner.nextLine());
                if (select < 0 || select >= range) {
                    systemMsg("1 ~ " + range + " 사이의 숫자를 선택하세요.");
                }
            } catch (NumberFormatException e) {
                systemMsg("숫자만 입력 가능합니다.");
            }
        }
        return select;
    }

    /** Selectable을 구현한 Enum을 입력받아 메뉴를 띄우고
     * 사용자에게 메뉴 범위 안의 정수를 입력받아 리턴
     * @param menus Selectable을 구현한 enum
     * @return 사용자가 입력한 정수 i
     */
    public static EMenu selectMenu(EMenu[] menus){
        showMenus(menus);
        return menus[selectInRange(menus.length)-1];
    }

}