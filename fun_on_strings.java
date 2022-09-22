//##### C H A R  A T  &  L E N G T H   #####
// public class fun_on_strings {
//     public static void main(String[] args) {
//         String name = "dharmik";

//         System.out.println(name.charAt(2)); // postion start with '0' so it prints 'a' in output
//         System.out.println(name.length()); // shows length of the strings

//     }

// }

//........ R E P L A C E  &  S U B S T R I N G ........
public class fun_on_strings {
    public static void main(String[] args) {
        String name = "Dhurmik Putel";
        String name2 = name.replace('u', 'a');
        String nameS = "My name is Dharmik";

        System.out.println("Before replacing " + name);
        System.out.println("After replacing " + name2);

        System.out.println("particular substring : " + nameS.substring(0, 15));

    }
}