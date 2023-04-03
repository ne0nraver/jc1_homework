package part3.task11;


public class DvaDoma {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        a = 12;
        b = 8;
        c = 7;
        d = 4;
        e = 19;
        f = 12;
        if (a+c <= e && b+d <= f || a+d <=e && b+c <= f || a+c <= f && b+d <= e || a+d <=f && b+c <=e) {
            System.out.println("Дома помещаются");
        } else System.out.println("дома не помещаются");
    }
}
