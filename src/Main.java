public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("128 BE","Acer",28,"1280 x 1920");
        Motherboard theMotherboard = new Motherboard("192:E","HP",4,5,"v2.44");
        PersonalComputer pc = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);

//        pc.getMonitor().drawPixelAt(1,100,"blue");
//        pc.getComputerCase().pressPowerButton();
        pc.loadProgram("Windows OS");
        pc.drawLogo();
        pc.powerUp();
    }
}