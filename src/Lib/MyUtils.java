/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author letu
 */
import java.util.Scanner;

public class MyUtils {
    static Scanner inputFrom = new Scanner(System.in);

    public static boolean isNum(String input) {
        if (input.equals(""))
            return false;
        else
            try {
                Double.parseDouble(input);
            } catch (NumberFormatException NaN) {
                return false;
            }

        return true;
    }

    //- min <= num <= max
    public static boolean isInRanged(double num, double min, double max) {
        return (min <= num && num <= max);
    }

    public static boolean isFormat(String input, String pattern, String errorMsg) {
        if (!input.matches(pattern) && !errorMsg.isEmpty())
            System.out.println(errorMsg);
        return input.matches(pattern);
    }

    public static String getString(String startMsg) {
        boolean isLoop = true;
        String input = "";
        do {
            System.out.format("%-10s: ", startMsg);
            input = inputFrom.nextLine();

            if (input.isEmpty())
                System.out.println("empty string");
            else
                isLoop = false;
        } while (isLoop);

        return input;
    }

    public static String getStringRegex(String startMsg, String pattern, String errorMsg) {
        String input = "";
        do {
            System.out.format("%-10s: ", startMsg);
            input = inputFrom.nextLine();
        } while (!isFormat(input, pattern, errorMsg));
        return input;
    }

    public static float getFloat(String startMsg) {
        return (float) getDouble(startMsg);
    }

    public static float getFloat(String startMsg, float min, float max) {
        return (float) getDouble(startMsg, min, max);
    }

    public static double getDouble(String startMsg) {
        String input = "";
        double output = 0;
        boolean isLoop = true;
        do {
            input = getStringRegex(startMsg, "[+-]?([0-9]*([.]|,))?[0-9]+", "Invalid Float").replace(",", ".");
            isLoop = !isNum(input);
            if (!isLoop && (output = Double.parseDouble(input)) > Float.MAX_VALUE) {
                System.out.println("Invalid Float");
                isLoop = true;
            }
        } while (isLoop);
        return output;

    }

    public static double getDouble(String startMsg, double min, double max) {
        String input = "";
        double output = 0;
        boolean isLoop = true;
        do {
            input = getStringRegex(startMsg, "[+-]?([0-9]*([.]|,))?[0-9]+", "Invalid Float").replace(",", ".");
            isLoop = !isNum(input);
            output = Double.parseDouble(input);
            if (output > Float.MAX_VALUE) {
                System.out.println("Invalid Float");
                isLoop = true;
            } else if (isNum(input) && !isInRanged(output, min, max)) {
                System.out.println("out of range (" + min + ", " + max + ")");
                isLoop = true;
            }
        } while (isLoop);

        return output;
    }

    public static int getInt(String startMsg) {
        String input = "";
        int output = 0;
        boolean isLoop = true;
        do {
            input = getStringRegex(startMsg, "\\d+", "Invalid Integer");
            isLoop = !isNum(input);
            if (isNum(input))
                try {
                    output = Integer.parseInt(input);
                    isLoop = false;
                } catch (NumberFormatException error) {
                    System.out.println("Invalid Integer");
                    isLoop = true;
                }

        } while (isLoop);

        return output;
    }

    public static int getInt(String startMsg, int min, int max) {
        String input = "";
        int output = 0;
        boolean isLoop = true;
        do {
            input = getStringRegex(startMsg, "\\d+", "Invalid Integer");
            isLoop = !isNum(input);

            if (isNum(input))
                try {
                    output = Integer.parseInt(input);
                    isLoop = false;
                    if (!isInRanged(Integer.parseInt(input), min, max)) {
                        System.out.println("out of range (" + min + " - " + max + ")");
                        isLoop = true;
                    }
                } catch (NumberFormatException error) {
                    System.out.println("Invalid Integer");
                    isLoop = true;
                }

        } while (isLoop);

        return output;
    }

    public static boolean getBoolean(String startMsg) {
        String boolString = "(?i)(Y|N|T|F|1|0|true|false|yes|no)";
        String input = getStringRegex(startMsg + " (Y/N)", boolString, "Wrong Boolean Format");
        return isFormat(input, "(?i)(Y|T|1|true|yes)", "");
    }

    public static String formatName(String name) {
        // - xóa khoảng trắng
        name = name.replaceAll(" +", " ").trim();

        // - xóa số
        name = name.replaceAll("\\d", "");

        // - xóa kí tự đặc biệt
        name = name.replaceAll("[^a-zA-Z\\s]", "");

        String nameSplit[] = name.split("\\s");
        String newName = "";
        for (String namePart : nameSplit) {
            String FirstLetter = namePart.substring(0, 1).toUpperCase();
            String OtherLetter = namePart.substring(1, namePart.length()).toLowerCase() + " ";
            newName += (FirstLetter + OtherLetter);
        }

        name = newName.trim();
        return name;
    }
}
