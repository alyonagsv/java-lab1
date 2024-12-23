package lab1;

public class Burger extends Food  {

    private String size;

    public Burger (String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Бургер");
// Инициализировать размер гамбургера
        this.size = size;
    }

    // Переопределить способ употребления гамбургера
    public void consume() {
        System.out.println(this + " съеден");
    }

    // Селектор для доступа к полю данных РАЗМЕР
     public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
      public void setSize(String size) {
         this.size = size;
    }

    // Переопределенная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
//    public boolean equals(Object arg0) {
//        if (super.equals(arg0)) { // Шаг 1
//            if (!(arg0 instanceof Burger)) return false; // Шаг 2
//            return size.equals(((Burger)arg0).size); // Шаг 3
//        } else
//            return false;
//    }
    // Переопределенная версия метода toString(), возвращающая не только
// название продукта, но и его размер

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

}

