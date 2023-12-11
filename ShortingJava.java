public class ShortingJava {
    public static void main(String arg[]){
        // bubble short
        System.out.println("----------------------------------------------");
        System.out.println("Bubble Short: ");
        int[] hello = new int[4];
        // int[] hello = new int[4];
        hello[0] = 4;
        hello[1] = 12;
        hello[2] = 8;
        hello[3] = 5;

        System.out.println("befor in Order");
        for(int i = 0;i<hello.length;i++){
            System.out.println(hello[i]);
        }// for

        int m;
        for(int i = 0;i<hello.length;i++){
            for(int j = 0;j<hello.length;j++){
                if(i==j){
                    continue;
                }//if
                if(hello[i]>hello[j]){
                    continue;
                }//if
                else if(hello[i]<hello[j]){
                    m = hello[j];
                    hello[j] = hello[i];
                    hello[i] = m;
                }// else if
                
            }// for  j
        }// for i
        
        System.out.println("After in Order");
        for(int i = 0;i<hello.length;i++){
            System.out.println(hello[i]);
        }//for
        
        System.out.println("-----------------------------------------------");
        // selection shorting
        System.out.println("Selection Shorting: ");

        int select[] = new int[4];
        select[0] = 3;
        select[1] = 9;
        select[2] = 5;
        select[3] = 1;

        System.out.println("befor in Order");
        for(int i = 0;i<select.length;i++){
            System.out.println(select[i]);
        }// for

        System.out.println("-----------------------------------------------");
        
        int n;
        for(int i= 0;i<select.length;i++){
            for(int j=0;j<select.length;j++){
                if(i==j){
                    continue;
                }
                if(select[i]<select[j]){
                    continue;
                    
                }else if(select[i]>select[j]){
                    // continue;
                    n = select[i];
                    if(j==select.length-1){
                        select[i] = select[j];
                        select[j] = n;
                    }// if
                }// else if
            }// for j
        } // for

        System.out.println("After in Order");
        for(int i = 0;i<select.length;i++){
            System.out.println(select[i]);
        }//for

        System.out.println("-----------------------------------------------------------");
        System.out.println("Insertion Sort: ");
        int[] insertion = new int[4];
        insertion[0] = 5;
        insertion[1] = 1;
        insertion[2] = 4;
        insertion[3] = 9;

        for(int i=1; i<insertion.length;i++){
            for(int j=0; j<=i ; j++){
                if (insertion[i]<insertion[j]) {
                    
                }
            }
        }
    }
}
