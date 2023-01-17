package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class HoroscopeFinderProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day;
        String month;

        System.out.print("\nPlease enter that which month did you born : ");
        month = input.next();
        System.out.print("Please enter that which day did you born : ");
        day = input.nextInt();

        if (month.equals("January")){
            if (1<=day && day<=31){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Capricorn");
                }else System.out.println(" --> Your zodiac sign is Aquarius");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("February")){
            if (1<=day && day<=28){
                if (day<=19){
                    System.out.println(" --> Your zodiac sign is Aquarius");
                }else System.out.println(" --> Your zodiac sign is Pisces");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("March")){
            if (1<=day && day<=31){
                if (day<=20){
                    System.out.println(" --> Your zodiac sign is ");
                }else System.out.println(" --> Your zodiac sign is Aries");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("April")){
            if (1<=day && day<=30){
                if (day<=20){
                    System.out.println(" --> Your zodiac sign is Aries");
                }else System.out.println(" --> Your zodiac sign is Taurus");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("May")){
            if (1<=day && day<=31){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Taurus");
                }else System.out.println(" --> Your zodiac sign is Gemini");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("June")){
            if (1<=day && day<=30){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Gemini");
                }else System.out.println(" --> Your zodiac sign is Cancer");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("July")){
            if (1<=day && day<=31){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Cancer");
                }else System.out.println(" --> Your zodiac sign is Leo");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("August")){
            if (1<=day && day<=31){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Leo");
                }else System.out.println(" --> Your zodiac sign is Virgo");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("September")){
            if (1<=day && day<=30){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Virgo");
                }else System.out.println(" --> Your zodiac sign is Libra");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("October ")){
            if (1<=day && day<=31){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Libra");
                }else System.out.println(" --> Your zodiac sign is Scorpio");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("November ")){
            if (1<=day && day<=30){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Scorpio");
                }else System.out.println(" --> Your zodiac sign is Sagittarius");
            }else System.out.println("Error..Try again.!");
        }
        else if (month.equals("December ")){
            if (1<=day && day<=31){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Sagittarius");
                }else System.out.println(" --> Your zodiac sign is Capricorn");
            }else System.out.println("Error..Try again.!");
        }
        else System.out.println("Error..Try agin.!");


        /*switch (month){
            case 1: if (1<=day && day<=31){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Capricorn");
                }else System.out.println(" --> Your zodiac sign is Aquarius");
            }else System.out.println("Error..Try again.!");
            break;
            case 2: if (1<=day && day<=28){
                if (day<=19){
                    System.out.println(" --> Your zodiac sign is Aquarius");
                }else System.out.println(" --> Your zodiac sign is Pisces");
            }else System.out.println("Error..Try again.!");
            break;
            case 3: if (1<=day && day<=31){
                if (day<=20){
                    System.out.println(" --> Your zodiac sign is ");
                }else System.out.println(" --> Your zodiac sign is Aries");
            }else System.out.println("Error..Try again.!");
            break;
            case 4: if (1<=day && day<=30){
                if (day<=20){
                    System.out.println(" --> Your zodiac sign is Aries");
                }else System.out.println(" --> Your zodiac sign is Taurus");
            }else System.out.println("Error..Try again.!");
            break;
            case 5: if (1<=day && day<=31){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Taurus");
                }else System.out.println(" --> Your zodiac sign is Gemini");
            }else System.out.println("Error..Try again.!");
            break;
            case 6: if (1<=day && day<=30){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Gemini");
                }else System.out.println(" --> Your zodiac sign is Cancer");
            }else System.out.println("Error..Try again.!");
            break;
            case 7: if (1<=day && day<=31){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Cancer");
                }else System.out.println(" --> Your zodiac sign is Leo");
            }else System.out.println("Error..Try again.!");
            break;
            case 8: if (1<=day && day<=31){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Leo");
                }else System.out.println(" --> Your zodiac sign is Virgo");
            }else System.out.println("Error..Try again.!");
            break;
            case 9: if (1<=day && day<=30){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Virgo");
                }else System.out.println(" --> Your zodiac sign is Libra");
            }else System.out.println("Error..Try again.!");
            break;
            case 10: if (1<=day && day<=31){
                if (day<=22){
                    System.out.println(" --> Your zodiac sign is Libra");
                }else System.out.println(" --> Your zodiac sign is Scorpio");
            }else System.out.println("Error..Try again.!");
            break;
            case 11: if (1<=day && day<=30){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Scorpio");
                }else System.out.println(" --> Your zodiac sign is Sagittarius");
            }else System.out.println("Error..Try again.!");
            break;
            case 12: if (1<=day && day<=31){
                if (day<=21){
                    System.out.println(" --> Your zodiac sign is Sagittarius");
                }else System.out.println(" --> Your zodiac sign is Capricorn");
            }else System.out.println("Error..Try again.!");
            break;
            default:
                System.out.println("Error..Try again.!");*/
        }
    }

