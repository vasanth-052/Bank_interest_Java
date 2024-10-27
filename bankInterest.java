class Bank {
    int p;
    int n;
    int r;

    Bank(int p, int n, int r) {
        this.p = p;
        this.n = n;
        this.r = r;
    }

    void simpleInterest() {
        int a = (p * n * r) / 100;
        System.out.println("Bank interest: " + a);
    }
}

class Sbi extends Bank {
    Sbi(int p, int n, int r) {
        super(p, n, r);
    }

    @Override
    void simpleInterest() {
        int a = (p * n * r) / 100;
        System.out.println("SBI Bank interest: " + a);
    }
}

class Hdfc extends Bank {
    Hdfc(int p, int n, int r) {
        super(p, n, r);
    }

    @Override
    void simpleInterest() {
        int a = (p * n * r) / 100;
        System.out.println("HDFC Bank interest: " + a);
    }
}

class Indian extends Bank {
    Indian(int p, int n, int r) {
        super(p, n, r);
    }

    @Override
    void simpleInterest() {
        int a = (p * n * r) / 100;
        System.out.println("Indian Bank interest: " + a);
    }
}

public class Banktest {

    public static void main(String[] args) {
        Sbi s = new Sbi(1000, 2, 8);
        s.simpleInterest();

        Hdfc h = new Hdfc(1000, 2, 9);
        h.simpleInterest();

        Indian i = new Indian(1000, 2, 7);
        i.simpleInterest();
    }
}
