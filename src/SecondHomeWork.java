public class SecondHomeWork {
    public static void main(String[] args) {
        String[] company = {"MAIB","Allied Testing","VICB","Amdaris","Pentalog"};
        int lenghtArray = company.length;
        System.out.println(company.length); // Size

        for (int i = 0; i < 1; i++) {
            System.out.println(company[i]); // First element
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(company[company.length - 1]); // Last element
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(company[i]); // Second element
        }
    }
}
