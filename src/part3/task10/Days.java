package part3.task10;

public class Days {
    public static void main(String[] args) {
        int day = 28;
        int month = 4;
        int year = 1;
        if (year % 4 == 0 && month == 2 && day == 29) System.out.println("" + (day=1));
        else if (year % 4 != 0 && month == 2 && day == 28) {
            day = 1;
            month++;
            System.out.println("the next day is " + day + "." + month + "." + year);}
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            day = 1;
            month++;
            System.out.println("the next day is " + day + "." + month + "." + year);
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1;
            month++;
            System.out.println("the next day is " + day + "." + month + "." + year);
        } else if(month == 12 && day == 31){
            day = 1;
            month = 1;
            year++;
            System.out.println("the next day is " + day + "." + month + "." + year);
        }
        else {
            day++;
            System.out.println("the next day is " + day + "." + month + "." + year);
        }
        }
    }