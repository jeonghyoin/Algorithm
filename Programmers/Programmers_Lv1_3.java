package algorithm.Programmers;

public class Programmers_Lv1_3 {
    public static void main(String[] args) {
        int a = 10, b = 12, temp;
        //b에 더 큰 수
        if(a > b) {
            temp = a; b = a; a = temp;
        }

        //최대공약수
        int gcd = 0;
        for(int i=a; i>=1; i--) {
            if(a%i==0 && b%i==0) {
                gcd = i; break;
            }
        }
        //최소공배수
        int lcm = -1;
        for(int i=1; i<=a*b; i++) {
            if(b%a==0) {
                lcm = b; break;
            } else if(i%a==0 && i%b==0) {
                lcm = i; break;
            }
        }

        System.out.println(gcd+" "+lcm);
    }
}
