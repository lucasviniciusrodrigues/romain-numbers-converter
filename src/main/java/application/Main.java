package application;

import counter.RomanCounter;
import utils.ValidateBadRequest;


public class Main {

    static String input = "CDXCIX";

    public static void main(String[] args) throws Exception {

        new ValidateBadRequest(input);

        RomanCounter romamCounter = new RomanCounter();

        System.out.println(romamCounter.convertRomanValue(input));


    }



}
