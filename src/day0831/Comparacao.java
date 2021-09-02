package day0831;

public class Comparacao {

    public static void main(String[] args) {
        
        int x = 9;
        int y = 5;
        int z = 3;
        // if x>y and x >z: 
        if (x > y && x > z){

            if (y>z){
                System.out.println(x + " " + y + " " +z);
            }else{
                System.out.println(x + " " + z + " " +y);
            }
        }else if(y>x && y>z){
            if (x>z){
                System.out.println(y + " " + x + " " +z);
            }else{
                System.out.println(y + " " + z + " " +x);
            }
        }else{
            if (x>y){
                System.out.println(z + " " + x + " " +y);
            }else{
                System.out.println(z + " " + y + " " +x);
            }
        }
    }    
}
