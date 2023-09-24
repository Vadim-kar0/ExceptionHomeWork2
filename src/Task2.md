# Task2 and Task3

## Задание 2

1. Массив ***intArray*** не был проинициализирован
   Также у массива нужно вызвать метод ***length*** для получения числа
2. Переменная ***cathedRes1*** имеет тип double
   В связи с этим при делении переменной на 0
   результат будет равен ***положительной бесконечности***
3. Чтобы ошибка появилась нужно результат деления привести к типу ***int***

```java
**try** {

**int** d = 0;

**double** catchedRes1 = intArray[8] / d;

System.***out***.println(**"catchedRes1 = "** + catchedRes1);

} **catch** (ArithmeticException e) {

System.***out***.println(**"Catching exception: "** + e);

}
```

## Задание 3

- В строке метода ***main*** можно явно не указывать ***trows Exception***
- Метод ***printSum*** в качестве аргументов использует переменные с типами обертками
  ***Integer*** метод должен выбрасывать ошибки типа NullPointerException или
  нужно изменить сигнатуру метода на примитивы ***int*** и выбрасывать ошибки деления на 0
- При выполнение кода

```java
abc[3] = 9 
```

- Будет вызвана ошибка ***IndexOutOfBoundsException*** но пользователь её не увидит так как

  Блок


```java
**catch** (IndexOutOfBoundsException ex) {

System.***out***.println(**"Массив выходит за пределы своего размера!"**);

}
```

- Находится после блока

```java
**catch** (Throwable ex) {

System.***out***.println(**"Что-то пошло не так..."**);

}
```

- Для решения этой проблемы Блок кода

```java
**catch** (Throwable ex) {

System.***out***.println(**"Что-то пошло не так..."**);

}
```

- Нужно расположить после всех блоков **catch**

```java

**public static void** main(String[] args) **throws** Exception {

**try** {

**int** a = 90;

**int** b = 3;

System.***out***.println(a / b);

*printSum*(23, 234);

**int**[] abc = { 1, 2 };

abc[3] = 9;

} **catch** (Throwable ex) {

System.***out***.println(**"Что-то пошло не так..."**);

} **catch** (NullPointerException ex) {

System.***out***.println(**"Указатель не может указывать на null!"**);

} **catch** (IndexOutOfBoundsException ex) {

System.***out***.println(**"Массив выходит за пределы своего размера!"**);

}

}

**public static void** printSum(Integer a, Integer b) **throws** FileNotFoundException {

System.***out***.println(a + b);

}
```
