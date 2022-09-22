public class mo_r {
    public static void main(String[] args) {
        M i = new M();

        i.fu(5);
        fu(5);
        fu(5);
    }

    public static void fu(double i) {
        System.out.println("increment value of int : " + ++i);
    }

    public static void fu(int i) { // *This is method overload of above method//*
        System.out.println(i + " x 2 = " + i * 2);
    }
}

class M {
    public void fu(double i) { // *this is method override from Above class mo_r//*
        System.out.println("decrement value of int : " + --i);
    }
}