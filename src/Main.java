public class Main {

    public static void main(String[] args) {
        /*
        4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
         Поменять местами дробную и целую части числа и вывести полученное значение числа.
         */
        double r, a, b, res;
        r = 123.456;
        a = r * 1000 % 1000;
        b = (int) r;
        res = a + b / 1000;
        System.out.println(res);
    }
}
