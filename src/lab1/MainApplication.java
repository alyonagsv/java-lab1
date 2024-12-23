package lab1;
import java.util.Scanner;
public class MainApplication {
    // Конструктор класса отсутствует
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
//        Scanner in =new Scanner(System.in);
//        System.out.println ("Введите количество гамбургеров: ");
//        int burgerCount=in.nextInt();
//        //in.nextLine();
//        // Добавляем указанное количество сыра в завтрак
//        for (int i = 0; i < burgerCount; i++) {
//            if (itemsSoFar < breakfast.length) {
//               // System.out.println ("Введите размер гамбургера: ");
//                //String burgerSize=in.nextLine();
//                breakfast[itemsSoFar] = new Burger("большой");
//                itemsSoFar++; }
//            else { System.out.println("Недостаточно места для всех продуктов.");
//                break; }
//        }
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Burger")) {
// У гамбургера – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Burger(parts[1]);
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;

        int cheeseCount = 0;
        int BurgerCount = 0;
        int AppleCount = 0;
        for (Food item : breakfast) {
            if (item != null && item.equals(new Cheese())) {
                cheeseCount++;}
            if (item != null && item.equals(new Burger("БОЛЬШОЙ"))) {
                BurgerCount++; }
            if (item != null && item.equals(new Apple("маленький"))) {
                AppleCount++; }
        }
        System.out.println("Количество сыров в завтраке: " + cheeseCount);
        System.out.println("Количество гамбургеров в завтраке: " + BurgerCount);
        System.out.println("Количество яблок в завтраке: " + AppleCount);

        System.out.println("Всего хорошего!");
    }
}
