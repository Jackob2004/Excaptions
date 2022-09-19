public class Main {
    public static void main(String[] args) {
        int c;
        try{ // whenever exception happens in try block it will try to send it to the catcher
            int bob = 500;
            c = bob / 1;
            try {
                int coolArray[] = {1};
                coolArray[3] = 4;
            }catch (ArrayIndexOutOfBoundsException e){ // if there is a catch statement that matches the error it won't be sent to the default handler and terminated
                System.out.println("There  an error while trying to set 4th element");
            }
        }catch (ArithmeticException e){
            System.out.println("c was set to zero because of an error");
            System.out.println(e);
            c = 0;

        }
        System.out.println(c);
    }
}