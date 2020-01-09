
interface Calculator {
    int calculate(int a, int b);
}

// Реализуем алгоритм с использованием интерфейса стратегии
class CalculatorAdd implements Calculator {

    public int calculate(int a, int b) {
        System.out.println("Функция сложения");
        return a + b; 
    }
}

class CalculatorSubtract implements Calculator {

    public int calculate(int a, int b) {
        System.out.println("Функиция вычитания");
        return a - b;  
    }
}

class CalculatorMultiply implements Calculator {

    public int calculate(int a, int b) {
        System.out.println("функция умножения");
        return a * b;   
    }
}
class CalculatorRaiseToPower implements Calculator {

    public int calculate(int a, int b) {
        System.out.println("функция умножения");
        return  (int) Math.pow(a,b);   
    }
}

// Класс контекста использующий интерфейс стратегии
class Context {

    private Calculator calculator;

    // Constructor
    public Context() {
    }

    // Set new strategy
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int executeCalculator(int a, int b) {
        return calculator.calculate(a, b);
    }
}

// Тестовое приложение
class StrategyExample {

    public static void main(String[] args) {

        Context context = new Context();

        context.setCalculator(new CalculatorAdd());
        int addresult = context.executeCalculator(17,12);

        context.setCalculator(new CalculatorSubtract());
        int subtractresult = context.executeCalculator(17,12);

        context.setCalculator(new CalculatorMultiply());
        int multiplyresult = context.executeCalculator(17,12);

        context.setCalculator(new CalculatorRaiseToPower());
        int power = context.executeCalculator(17,12);

        System.out.println("результат сложения : " + addresult );
        System.out.println("результат вычитания : " + subtractresult );
        System.out.println("Результат умножения : " + multiplyresult );
        System.out.println("Результат возведения в степень : " + power );
    }
}
