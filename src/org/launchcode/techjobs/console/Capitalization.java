package org.launchcode.techjobs.console;

public class Capitalization {

    public static String CapUp(String value){


        String NewValue = "";

        value = value.toLowerCase();
        value = value.substring(0,1).toUpperCase() + value.substring(1);

        for (int i = 0; i < value.length(); i++){

            if (value.charAt(i) == ' '){

                NewValue += value.charAt(i);
                NewValue += value.toUpperCase().charAt(i+1);
                i += 1;

            } else {
                NewValue += value.charAt(i);
            }
        }
        return NewValue;
    }
}
