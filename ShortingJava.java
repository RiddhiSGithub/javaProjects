public class ShortingJava {
    public static void main(String arg[]){
        // bubble short
        int[] hello = new int[4];
        // int[] hello = new int[4];
        hello[0] = 4;
        hello[1] = 12;
        hello[2] = 8;
        hello[3] = 5;

        System.out.println("befor in Order");
        for(int i = 0;i<hello.length;i++){
            System.out.println(hello[i]);
        }
        System.out.println("-----------------------------------------------");
        int  k = hello.length, m;
        for(int i = 0;i<hello.length;i++){
            for(int j = 0;j<k;j++){
                if(i==j){
                    continue;
                }
                if(hello[i]>hello[j]){
                    continue;
                }else if(hello[i]<hello[j]){
                    m = hello[j];
                    hello[j] = hello[i];
                    hello[i] = m;
                }
                
            }
            // k-=1;
            
        }
        
        System.out.println("After in Order");
        for(int i = 0;i<hello.length;i++){
            System.out.println(hello[i]);
        }        
    }
}
