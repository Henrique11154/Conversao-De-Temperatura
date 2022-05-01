public class Celsius {

    public static void main(String[] args) {
        
        ConversaoDeTemperatura t = new ConversaoDeTemperatura();

        t.Celsius = 25;
        
        int kelvin = t.conversaoDeCelcioParaKelvin();
        double Fahrenheit = t.conversaoDeCelcioParaFahrenheit();

        System.out.println("Temperatura em celsius " + t.Celsius);
        System.out.println("Temperatura em Kelvin " + kelvin);
        System.out.println("Temperatura em Fahrenheit " + Fahrenheit);
    }
    
}




