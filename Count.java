/*
Вывести числа от 1 до 100 в одну строку со следующими изменениями:
- если число кратно 5 то вместо него вывести Hello
- если число кратно 3 то вместо него вывести World
- если число кратно и 3 и 5 то вместо него вывести HelloWorld
 */

public class Count {

    public static void main(String[] args){

        for(int i = 1; i <= 100; i++){
            if(i%3==0 & i%5==0){//checking if "i" multiple of 3 and 5
                System.out.print("HelloWorld ");
            } else if(i%3==0){//checking if "i" multiple of 3
                System.out.print("World ");
            } else if(i%5==0){//checking if "i" multiple of 5
                System.out.print("Hello ");
            } else{
                System.out.print(i+" ");
            }
        }
    }
}
