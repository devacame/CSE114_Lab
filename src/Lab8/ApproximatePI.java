package src.Lab8;

public class ApproximatePI {
    public static void main(String[] args) {
        for (int i=10000;i<100001;i+=10000) {
            double PI_approximate = 0;
            boolean chk = false;
            for (int j=1;j<2*(i+1);j+=2) {
                PI_approximate += (chk ? -1.0 : 1.0)/(double)j;
                chk = !chk;
            }
            PI_approximate *= 4.0;
            System.out.printf("i=%,d PI approximate: %.16f\n", i, PI_approximate);
        }
    }
}
