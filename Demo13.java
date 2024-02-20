import java.util.Objects;

void main() {
   final String[][][] Array = {{{"1"}, {"kasun","sampath"}, {"30", "80", "65"}}, {{"2"}, {"nuwan"}, {"40", "70", "-1"}}, {{"3"}, {"sampath", null},{ "-1", "65", "85"}}};
    String firstName="";
    String lastName="";
    String mark1;
    String mark2;
    String mark3;
    int markInt1=0;
    int markInt2=0;
    int markInt3=0;
    int scount=0;
    String ID = null;
    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-" .repeat(8)}+\{"-".repeat(3)}+\{"-".repeat(5)}+\{"-".repeat(5)}+";
    final String HEADER = "\033[43;1m|%-5s|%-8s|%-8s|%3s|%5s|%5s|\033[0m" .formatted("ID", "F.NAME", "L.NAME", "SUB", "TOTAL", "AVG.");
    final String ROW = "|%-5s|%-8s|%-8s|%3s|%5s|%5s|\n";
    System.out.println(LINE);
    System.out.println(HEADER);


    int sum =0;
   for (int i = 0; i < Array.length; i++) {
       String[][] array =Array[i];
        for (int j = 0; j < Array[i].length; j++) {
            String[]array2 =array[j];
            for (int k = 0; k < array[j].length; k++) {
                if (j == 0) {
                    //System.out.println(STR."ID \{array2[k]}");
                    ID=array2[k];
                }
                if (j == 1) {
                    if (k == 0) {
                        //System.out.print(STR."FITST NAME :\{array2[k]}");
                        firstName = array2[k];
                    } else if (array2[1] != null) //System.out.print(STR."LAST NAME :\{array2[k]}");
                    lastName = array2[k];
                }
                if (j == 2) {


                    if (!Objects.equals(array2[k], "-1")) {

                        sum =sum+Integer.parseInt(array2[k]);

                        scount=scount+1;

                                }

                            }

                        }
         //   System.out.println(sum);
                    }
        int avg=sum/3;
       System.out.println( "|%-5s|%-8s|%-8s|%3s|%5s|%5s|\n".formatted(ID,firstName,lastName,scount,sum,avg));

       scount=0;
   sum=0;
   }
    System.out.println(LINE);

}



