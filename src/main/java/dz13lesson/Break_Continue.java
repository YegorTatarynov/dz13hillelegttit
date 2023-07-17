package dz13lesson;

public class Break_Continue {
    public static void main(String[] args) {
        /*
        //1пример, с оператором break
        int i = 0;
         while(true){
             if (i==15){
                 break;
             }
             System.out.println(i);
             i++;
         }
        System.out.println("Мы вышли из цикла.");
        */

        //2пример, с оператором continue
         for (int i = 0; i<=15; i++ ){
             if (i%2==0){
                 continue;
             }
             System.out.println("Это нечетное число " + i);
         }
    }
}
