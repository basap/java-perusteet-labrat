import java.util.*;

public class Labra3 {

    public static void tehtl1(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Omena");
        System.out.println(lista);
    }

    public static void tehtl2(String[] args) {
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(10);
        lista2.add(20);
        System.out.println(lista2);
    }

    public static void tehtl3(String[] args) {
        List<String> lista3 = new ArrayList<>();
        lista3.add("Kissa");
        lista3.add("Koira");
        System.out.println(lista3.getFirst());
    }

    public static void tehtl4(String[] args) {
        List<String> lista4 = new ArrayList<>();
        lista4.add("A");
        lista4.add("B");
        lista4.add("C");
        lista4.remove("B");
        System.out.println(lista4);
    }

    public static void tehtl5(String[] args) {
        List<String> lista5 = new ArrayList<>();
        lista5.add("eka");
        lista5.add("toka");
        lista5.add("kolmas");
        System.out.println(lista5.size());
    }

    public static void tehtl6(String[] args) {
        List<Integer> lista6 = new ArrayList<>();
        lista6.add(1);
        lista6.add(2);
        lista6.add(3);

        for (int i = 0; i < lista6.size(); i++) {
            System.out.println(lista6.get(i));
        }

        for (Integer luku : lista6) {
            System.out.println(luku);
        }
    }

    public static void tehts1(String[] args) {
        Set<String> setti = new HashSet<>();
        setti.add("Aurinko");
        setti.add("Kuu");
        System.out.println(setti);
    }

    public static void tehts2(String[] args) {
        Set<Integer> setti2 = new HashSet<>();
        setti2.add(4);
        setti2.add(4);
        setti2.add(5);
        System.out.println(setti2);
    }

    public static void tehts3(String[] args) {
        TreeSet<Integer> setti3 = new TreeSet<>();
        setti3.add(3);
        setti3.add(1);
        setti3.add(2);
        System.out.println(setti3);
    }

    public static void tehtm1(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.get("A"));
    }

    public static void tehtm2(String[] args) {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("eka", 6);
        map2.put("toka", 7);
        map2.put("kolmas", 3);
        map2.put("neljäs", 2);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void tehtm3(String[] args) {
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Punainen");
        map3.put(2, "Sininen");

        for (Integer avain : map3.keySet()) {
            System.out.print(avain + " ");
        }
    }

    public static void tehtc1(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> opiskelijat = new ArrayList<>();

        while (true) {
            System.out.print("Anna nimi (tai 'stop' lopettaaksesi): ");
            String nimi = sc.nextLine();
            if (nimi.equalsIgnoreCase("stop")) {
                break;
            }
            opiskelijat.add(nimi);
        }
        sc.close();
        System.out.println("Opiskelijat: " + opiskelijat);
    }

    public static void tehtc2(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> sanoja = new HashSet<>();

        while (true) {
            System.out.print("Anna sana (tai 'stop' lopettaaksesi): ");
            String sana = sc.nextLine();
            if (sana.equalsIgnoreCase("stop")) {
                break;
            }
            sanoja.add(sana);
        }
        sc.close();
        System.out.println("Sanojen lukumäärä: " + sanoja.size());
    }

    public static void tehtc3(String[] args) {
        Map<String, String> puhluettelo = new HashMap<>();
        puhluettelo.put("Pertti S", "0504983822");
        puhluettelo.put("Anna L", "0204938527");
        puhluettelo.put("Veeti S", "09004837182");

        Scanner sc = new Scanner(System.in);
        System.out.print("Anna haettava nimi: ");
        String haku = sc.nextLine();

        sc.close();
        if (puhluettelo.containsKey(haku)) {
            System.out.println("Numero: " + puhluettelo.get(haku));
        } else {
            System.out.println("Nimeä ei löytynyt luettelosta");
        }
    }

    public static void tehtc4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Anna lause: ");
        String lause = sc.nextLine();
        String[] sanat = lause.toLowerCase().split("\\s+");

        Map<String, Integer> sanalaskuri = new HashMap<>();

        for (String sana : sanat) {
            if (sanalaskuri.containsKey(sana)) {
                sanalaskuri.put(sana, sanalaskuri.get(sana) + 1);
            } else {
                sanalaskuri.put(sana, 1);
            }
        }

        System.out.println("Sanojen frekvenssit:");
        for (Map.Entry<String, Integer> entry : sanalaskuri.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }

    public static void tehta1(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("b", "a", "c"));
        Collections.sort(lista);
        System.out.println(lista);
    }

    public static void tehta2(String[] args) {
        List<String> lista2 = new ArrayList<>(Arrays.asList("kultakala", "hevonen", "kissa"));
        lista2.sort(Comparator.comparingInt(String::length));
        System.out.println(lista2);
    }

    public static void tehta3(String[] args) {
        TreeMap<Integer, String> lista3 = new TreeMap<>();
        lista3.put(3, "eka");
        lista3.put(1, "toka");
        lista3.put(2, "kolmas");
        System.out.println(lista3);
    }
}