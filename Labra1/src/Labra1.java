public class Labra1 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String sign(int n) {
        if (n > 0) {
            return "positiivinen";
        } else if (n < 0) {
            return "negatiivinen";
        } else {
            return "nolla";
        }
    }

    public static String describe(int n) {
        String result = sign(n);
        if (n != 0) {
            if (isEven(n)) {
                result += " parillinen";
            } else {
                result += " pariton";
            }
        }
        return result;
    }

    public static String order2(int a,int b) {
        int smaller = Math.min(a,b);
        int bigger = Math.max(a,b);
        return smaller + "," + bigger;
    }

    public static String order3(int a,int b,int c) {
        int smallest = Math.min(a, Math.min(b,c));
        int biggest = Math.max(a, Math.max(b,c));
        int mid = (a+b+c) - smallest - biggest;
        return smallest + "," + mid + "," + biggest;
    }

    public static String line(int n,int i) {
        return n + " x " + i + " = " + (n*i) + "\n";
    }

    public static String table10(int n) {
        String result = "";
        for (int i = 1; i<=10; ++i) {
            result += n + " x " + i + " = " + (n*i) + "\n";
        }
        return result;        
    }

    public static boolean check(String s) {
        String correctPwd = "java123";

        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.equals(correctPwd);
    }

    public static String login(String[] tries) {
        int yritykset = 3;

        for (int i = 0; i < tries.length && i < yritykset; i++) {
            if (tries[i].equals("java123")) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta...";        
    }

    public static double average (int[] a) {
        if (a == null || a.length == 0) {
            return 0.0;
        } else {
            double sum = 0;
            for (int num : a) {
                sum += num;
            }

            return sum / a.length;
        }
    }

    public static int max (int[] a) {
        if (a == null || a.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int largest = a[0];
            for (int num : a) {
                if (num > largest) {
                    largest = num;
                }
            }
            return largest;
        }
    }

    public static void main(String[] args) {
        boolean kahdeksanOnParillinen = isEven(8);
        System.out.println("Onko 8 parillinen? " + kahdeksanOnParillinen);

        String luvunMerkki = sign(-5);
        System.out.println("Luvun -5 merkki on: " + luvunMerkki);

        String lukuInfo = describe(8);
        System.out.println("Luku 8 on: " + lukuInfo);

        String pienempiSuurempi = order2(5,2);
        System.out.println(pienempiSuurempi);

        String minMidMax = order3(5,2,9);
        System.out.println(minMidMax);

        String kertolasku = line(7,8);
        System.out.println(kertolasku);

        String kertolaskut = table10(7);
        System.out.println(kertolaskut);

        System.out.println(check("java123"));

        String[] attempts = {"123", "321", "java123"};
        System.out.println(login(attempts));

        int[] numbers = {10, 20, 30, 40, 50};
        double avg = average(numbers);
        int largest = max(numbers);
        System.out.println(avg);
        System.out.println(largest);
    }
}