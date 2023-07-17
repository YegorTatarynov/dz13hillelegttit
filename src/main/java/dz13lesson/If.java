package dz13lesson;

public class If {
    public static void main(String[] args) {
        /*1пример
        if( 5<4 ){
            //Если введем 5>1, то покажет "Да верно"
            System.out.println("Да, верно.");
        } else {
            System.out.println("Нет, не верно");
        }
        */

        //2пример
        int myInt = 15;
        // если мы вместо 15 поставим 5, то должны исполняться оба условия.
        // Но программа выведет только "Да верно" ведь оно уже является правильным,
        // а все последующие условия какими бы они не были, уже не будут выполнены.
        if(myInt< 10){
            System.out.println("Да, верно.");
        } else if (myInt > 20){
            System.out.println("Нет, не верно.");
        } else {
            System.out.println("Ни один из предыдущих случаев.");
        }
    }
}
