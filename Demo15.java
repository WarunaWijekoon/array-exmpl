import java.util.Objects;

void main() {

    final String[][] Array = {{"1", "kasun", "077-1236549", "012-5665665"}, {"2", "nuwan", "076-5662256", ""}, {"3", "ruwani", "078-3655655", "087-9936549"}, {"4", "supun", "088-3677655", null}};
    String Name = "";

    String phoneNumber1 = null;
    String phoneNumber2 = "";
    String mark;
    int idInt = 0;


    String ID = null;
    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-".repeat(11)}+\{"-".repeat(11)}+";
    final String HEADER = "\033[44;1m|%-5s|%-8s|%11s|%11s|\033[0m".formatted("ID", "NAME", "PHONE1", "PHONE2");

    System.out.println(LINE);
    System.out.println(HEADER);


    for (int j = 0; j < Array.length; j++) {
        String[] array2 = Array[j];
        for (int k = 0; k < Array[j].length; k++) {
            if (k == 0) {

                ID = array2[k];
                idInt =Integer.parseInt(ID);

            }

            if (k == 1) {

                Name = array2[k];
            }
            if (k == 2) {

                phoneNumber1 = array2[k];
            }
            if (k == 3) {
                if (Objects.equals(array2[k], "")) {
                    String NoNUMBER ="-";
                    phoneNumber2=NoNUMBER;

                }
                if (Objects.equals(array2[k], null)) {

                    phoneNumber2 = array2[k];
                } else {

                    phoneNumber2 = array2[k];
                }
            }


        }
        final String ROW = "|%-5s|%-8s|%-8s|%3s|%5s|%5s|\n";

        System.out.println("|%c%c%03d|%-8s|%3s|%11s|".formatted('C','-',idInt, Name, phoneNumber1, phoneNumber2));
    }
    System.out.println(LINE);
}













