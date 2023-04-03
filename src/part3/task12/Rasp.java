package part3.task12;

public class Rasp {
    public static int Raspisanie(int d){
        switch(d) {
            case 1:
                System.out.println(" monday:\n 1: math\n 2: literature\n 3: English");
                break;
            case 2:
                System.out.println(" tuesday:\n 1: literature\n 2: math\n 3: English");
                break;
            case 3:
                System.out.println(" wednesday:\n 1: math\n 2: English\n 3: literature");
                break;
            case 4:
                System.out.println(" thursday:\n 1: English\n 2: math\n 3: literature");
                break;
            case 5:
                System.out.println(" friday:\n 1: English\n 2: literature\n 3: math");
                break;
            case 6:
                System.out.println(" saturday:\n literature\n 2: English\n 3: math");
                break;
            case 7:
                System.out.println(" sunday:\n weekend");
                break;
        }
        return d;
    }
}
