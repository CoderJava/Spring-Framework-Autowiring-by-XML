package com.tokobuku;

import com.tokobuku.impl.Man;
import com.tokobuku.impl.Traveler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Traveler firstTraveler = (Traveler) context.getBean("theFirstTraveler");
        System.out.println(firstTraveler);
        firstTraveler.showCar();
        firstTraveler.startJourney();
        System.out.println("=====================================================");

        Traveler secondTraveler = (Traveler) context.getBean("theSecondTraveler");
        System.out.print(secondTraveler);
        secondTraveler.showCar();
        secondTraveler.startJourney();
        System.out.println("=====================================================");

        Traveler thirdTraveler = (Traveler) context.getBean("theThirdTraveler");
        System.out.println(thirdTraveler);
        thirdTraveler.showCar();
        thirdTraveler.startJourney();
        System.out.println("=====================================================");

        Traveler fourthTraveler = (Traveler) context.getBean("theFourthTraveler");
        System.out.println(fourthTraveler);
        fourthTraveler.showCar();
        fourthTraveler.startJourney();

        System.out.println("=====================================================");
        Man man = (Man) context.getBean("theMan");
        System.out.println(man);
        man.showHuman();
        man.startWalk();
    }
}
