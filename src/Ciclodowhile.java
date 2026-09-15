public class Ciclodowhile {
    public static void main(String[] args) {
        var i = 1;
        System.out.println("Cliclo do-while");

        do{
            System.out.println(i);
            var incremento = i++;
        }while (i <= 3);
    }
}
