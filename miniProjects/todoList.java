import java.util.Scanner;

class todoList{
    public static void main(String[] arg){
        //creat an arry to take all tasks
        // add scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to your daily Todo List:\n");
        System.out.println("Add Tasks: ");

        //creating arry for tasks
        String[] tasks = new String[5];

        addTask:
        for(int i=0;i<5;i++){
            //set warning for last task
            if(i==4){
                System.out.print("This is last slot to add");
            }

            //add task
            System.out.print("Enter your task-"+ (i+1) +": ");
            tasks[i] = scan.nextLine();
            isAdd:
            for(;;){
                System.out.println("Do you want to add Task?(y/n)");
                String toAdd = scan.nextLine();
                boolean isCorrect ;
                //if user wants to add more task or not
                if (toAdd.toLowerCase().equals("y")) {
                    isCorrect = true;
                } else if(toAdd.toLowerCase().equals("n")){
                    break addTask;
                } else {
                    System.out.print("Wrong input.");
                    isCorrect = false;
                }
                if(isCorrect = true){
                    break isAdd;
                }
                
            }
        }

        int count = 1;
        System.out.println("Todays TODO List:");
        for(String task:tasks){
            if(task == null){
                continue;
            }
            System.out.println( count + ". " + task);
            count++;
        }
        
        //close scanner
        scan.close();
    }
}