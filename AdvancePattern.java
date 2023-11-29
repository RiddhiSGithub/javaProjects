public class AdvancePattern {
    public static void main(String arg[]){
        System.out.println("Butterfly pattern:\n");

        for(int i=1;i<5;i++){
            for(int j= 1; j<5;j++){
                if(j<=i){
                    System.out.print(" * ");
                }else {System.out.print("   ");}
            }
            for(int j= 4; j>0;j--){
                if(j<=i){
                    System.out.print(" * ");
                }else {System.out.print("   ");}
            }
            System.out.println();
        }
        for(int i=4;i>0;i--){
            for(int j= 1; j<5;j++){
                if(j<=i){
                    System.out.print(" * ");
                }else {System.out.print("   ");}
            }
            for(int j= 4; j>0;j--){
                if(j<=i){
                    System.out.print(" * ");
                }else {System.out.print("   ");}
            }
            System.out.println();
        }
        System.out.println("\n\nIn other way:\n");
        int n = 4; 
        for(int i=1;i<=n;i++){
            for(int j= 1; j<=i;j++){
                System.out.print(" * ");
            }
            int spaces = 2*(n-i);
            for(int j= 1; j<=spaces;j++){
                System.out.print("   ");
            }
            for(int j= 1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
            
        } 
        for(int i=n;i>0;i--){
            for(int j= 1; j<=i;j++){
                System.out.print(" * ");
            }
            int spaces = 2*(n-i);
            for(int j= 1; j<=spaces;j++){
                System.out.print("   ");
            }
            for(int j= 1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
            
        }

        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("\nsquare dimond pattern:\n");
        int x = 1;
        for(int i=3;i>0;i--){
            for(int j = 1; j<=i;j++){
                System.out.print("   ");
            }
            for(int j = 1; j<=x;j++){
                System.out.print(" * ");
            }
            x=x+2;
            for(int j = 1; j<=i;j++){
                System.out.print("   ");
            }
            System.out.println();
        }
        // x=7
        
        for(int i=0;i<=3;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("   ");
            }

            for(int j = 1; j<=x;j++){
                System.out.print(" * ");
            }
            x=x-2;
            
            for(int j = 1; j<=i;j++){
                System.out.print("   ");
            }
            System.out.println();
        }



    }
}
