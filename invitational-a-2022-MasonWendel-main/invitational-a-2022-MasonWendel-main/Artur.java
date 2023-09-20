public class Artur{
    public static void main(String[] args){
        int lineDif = 2; 
        int count = 0; 
        double num = 0.1; 
        String filling = "";
        for(int i = 0; i<20; i++){
            filling+=" ";
        }
        for(int i = 0; i<20;i++){
            int fillingNum = 20-i; 
            String filling2  = "";
            for(int j  = 0 ; j<count; j++){
                filling2+=(count%4==0)?"--":"  ";
            }
            System.out.print(filling.substring(0,fillingNum)+"/"+filling2+"\\");
            if(lineDif%4==0){
                num/=10;
                
                System.out.printf("--->%."+((lineDif/4)+1)+"f",num);
                System.out.print("%");
            }
            count++;
            lineDif++;
            System.out.print("\n");
        }
    }
}