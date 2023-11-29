public class SolidRectangle {
    public static void main(String arg[]){
        System.out.println("\nSolid Retangle: \n");
        for(int i = 1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Triangle: \n");
        for(int i = 0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Downword Triangle: \n");
        String[][] a = new String[4][5];
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i>j){
                    a[i][j]="   ";
                    System.out.print(a[i][j]);
                }else{
                    a[i][j]=" * ";
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Downword inner Triangle: \n");
        int n=4;
        for(int i = 0;i<4;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            n=n-1;
            System.out.println();
        }
        System.out.println("\nin other way,\n");
        for(int i = 3;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("inner Triangle: \n");
        // remember this is  a normal loop not arry so i =3 considered as row 1 
        for(int i = 3;i>=0;i--){
            for(int j = 0;j<4 ;j++){
                if(i<=j){
                    System.out.print(" * ");
                }else{ System.out.print("   "); }
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Border pattern: \n");
        String[][] b = new String[5][5];
        for(int i = 0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 || j==0 || i==4 || j==4){
                    b[i][j]=" * ";
                    System.out.print(b[i][j]);
                }else{
                    b[i][j]="   ";
                    System.out.print(b[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("number triangle pattern: \n");
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                if(j<=i){
                    System.out.print(" "+j+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Downside number triangle pattern: \n");
        for(int i=1;i<5;i++){
            for(int j=1;j<6-i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("Floyd's triangle pattern: \n");
        int x=0;
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(x==1){x=x-1;}
                else{x=x+1;}
                if(j<=i){
                    System.out.print(" "+x+" ");
                }else{
                    System.out.print("   ");
                }                
            }
            // x=x-1; this is odd squrw loop so we dont need this
            System.out.println();
        }
        System.out.println("\nin other way,\n");
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(j<=i){
                    int y = i+j;
                    if(y%2==0){System.out.print(" "+1+" ");}
                    else{System.out.print(" "+0+" ");}
                } else {
                    System.out.print("   ");
                }                
            }
            // x=x-1; this is odd squrw loop so we dont need this
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("\nPlush Diamond: \n");
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==3 || j==3 || (i==2 && j==2) || (i==4 && j==4) || (i==4 && j==2) || (i==2 && j==4)){System.out.print(" * ");}
                else{System.out.print("   ");}
            }
            System.out.println();
        }
        
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("\nsolid rhombus: \n");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                if(i+j>=6){
                    System.out.print(" * ");
                }else{ System.out.print("   "); }
            }
            for(int j=6; j<=9; j++){
                if(i+j<=10){
                    System.out.print(" * ");
                }else{ System.out.print("   "); }
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("\na number pyramid: \n");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5 ; j++){
                if((i+j)>=6){
                    if((i+j)%2==0){System.out.print(" "+(i)+" ");}
                    else{ System.out.print("   "); }
                }
                else{ System.out.print("   "); }   
            }
            for(int j =6;j<=9;j++){
                if((i+j)>=8 && i>1){
                    if((i+j)%2==0){
                        if((j==8 && (i+j)<12) ||(j==9 && (i+j)<14)){
                            System.out.print("   ");
                        }else{System.out.print(" "+(i)+" ");}
                    }
                    else{System.out.print("   ");}
                }
            }
            System.out.println();
        }
        System.out.println("\nIn other way: \n");
        // do it in free time

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("\na palindromic number pyramid: \n");
        for(int i = 1;i<=5;i++){
            for(int j = 5;j>0 ;j--){
                if(i>=j){
                    System.out.print(" "+j+" ");
                }else{ System.out.print("   "); }
            }
            
            for(int j = 2;j<6 ;j++){
                if(j<=i && i>1){
                    System.out.print(" "+j+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }// main
}
