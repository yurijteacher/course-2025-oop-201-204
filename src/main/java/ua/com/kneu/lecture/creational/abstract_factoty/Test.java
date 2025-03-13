package ua.com.kneu.lecture.creational.abstract_factoty;

public class Test {

    public static void main(String[] args) {

        AppleHead appleHead = new AppleHead();
        IbmHand ibmHand = new IbmHand();
        SonyBody sonyBody = new SonyBody();
        SonyHead sonyHead = new SonyHead();
        SonyLeg sonyLeg = new SonyLeg();


        // set
        Robot robot = new Robot();
        robot.setBody(sonyBody);
        robot.setHand(ibmHand);
        robot.setLeg(sonyLeg);
        robot.setHead(sonyHead);
        //

        Robot robot2 = new Robot(sonyBody, appleHead, ibmHand, sonyLeg);

        System.out.println(robot2);
        System.out.println(robot);


    }

}
