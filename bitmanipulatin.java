public class bitmanipulatin {
    public static void main(String[] args) {
        // And for get bitat position 3
        int n = 5; //0101
        int position = 2; 
        int bitMask = 1<<position; //0100
        if((bitMask & n)==0){//0100
            System.out.println("bit was zero");
        } else {//0100
            System.out.println("bit was one");
        }

        // OR for set bit in position 2
        int n1 = 5; //0101
        int position1 = 1;
        int bitMask1 = 1<<position1; //0001
        int setNum = bitMask1 | n1 ; //0111
        System.out.println(setNum); //(0111) ==7

        // clear bit with AND with NOT at position 3
        // in this case perfor NOT first then AND
        int n2 = 5; //0101
        int position2 = 2;
        int bitMask2 = 1<<position2; //0100
        int notNum = ~(bitMask2); //1011
        int setNum2 = notNum & n2; // 1011 & 0101 = 0001
        System.out.println(setNum2); //(0001) == 1

        // Update a bit at position 2 of number n to 1
        // for 1 operation OR its baisically set
        int n4 = 5; //0101
        int position4 = 1;
        int bitMask4 = 1<<position4; //0010
        int setNum4 = bitMask4 | n4; // 0010 & 0101 = 0111;
        System.out.println(setNum4); //(0111) == 7
        // n to 0
        // for 0 operation AND with NOT its baisically clear
        int n3 = 5; //0101
        int position3 = 2;
        int bitMask3 = 1<<position3; //0100
        int notNum3 = ~(bitMask3); //1011
        int setNum3 = notNum3 & n3; // 1011 & 0101 = 0001
        System.out.println(setNum3); //(0001) == 1


    }
}