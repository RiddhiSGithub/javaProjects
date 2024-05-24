public class compositionCode1 {
    static class Home{
        public void mope(){
            System.out.println("today is mopind day.");
        }
    }

    static class mainHall{
        private Home home;
        
        mainHall(Home home){
            this.home = home;
        }

        public void mopeMainHall(){
            home.mope();
            System.out.println("Mop the Main Hall.");
        }
    }

    static class Room{
        private Home home;
        
        Room(Home home){
            this.home = home;
        }

        public void mopeMainHall(){
            home.mope();
            System.out.println("Mop the Room.");
        }
    }

    public static void main(String[] arg){
        Home home = new Home();
        mainHall mHall = new mainHall(home);
        Room room = new Room(home);

        mHall.mopeMainHall();
        room.mopeMainHall();
    }
}
