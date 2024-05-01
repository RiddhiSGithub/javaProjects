package inheritanceJavaOOP;
// why we need package inheritanceJavaOOP; package?
class childclass extends parentclass{

    public void sum(){
        takeinput();
        //sum of two number
        int sum = Integer.parseInt(this.num1)+Integer.parseInt(this.num2);
        //why we need to use "this" in int minus=this.num1-this.num2;?

        System.out.println("Sum is :"+sum);
    }
    public void mius(){
        //minus of two numbers
        int minus = Integer.parseInt(this.num1)-Integer.parseInt(this.num2);
        System.out.println("Minus is : "+minus);
    }

}