public class Forloop1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1;i<=10;i+=2){
            System.out.print(i+" ");
        }System.out.println();
        int i=1;
        for(;i<=10;i+=3){
            System.out.print(i+" ");
        }System.out.println();//this statement is out of loop
        for(;i<=10;i+=3);//observe the semicolon
        System.out.print(i+" ");
        System.out.println();
        //for(int j=1;j<=10;j+=2);
        //System.out.print(j+" "); it gives compile-time error because j is initialized in loop and we are printing out of loop but j is inside for loop
        for(int I =1,j=5;I<=j;I++,j--){
            System.out.print(I+j);
        }
        System.out.println();
        int y=1;
        for(;;){
            System.out.print(y++);
            ++y;
            if(y>6)
                break;
        }System.out.println();
        for(int t=1;;t++){
            System.out.println(t);// it will lead to infinte loop
        }
    }
}
