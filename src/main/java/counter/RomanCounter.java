package counter;

public class RomanCounter {

    public int convertRomanValue(String input) {

        String[] inputValueList = new String[input.length()];

        for(int i = 0; i < input.length(); i++){
            inputValueList[i] = String.valueOf(input.charAt(i));
        }

        return calcIndArabic(inputValueList);
    }

    private int calcIndArabic(String[] inputValueList) {

        RomanNumerals numeral = RomanNumerals.valueOf(inputValueList[inputValueList.length-1]);
        RomanNumerals numeralBefore;
        int output = numeral.getNumeralValue();

        for (int i = inputValueList.length-1; i >= 1; i--){

            numeral = RomanNumerals.valueOf(inputValueList[i-1]);
            numeralBefore = RomanNumerals.valueOf(inputValueList[i]);

            if(numeral.getNumeralValue() >= numeralBefore.getNumeralValue())
                output += numeral.getNumeralValue();
            else
                output -= numeral.getNumeralValue();
        }

        return output;
    }
}
