public class ConversaoDeTemperatura {

    int Celsius;

    int conversaoDeCelcioParaKelvin(){
        int k = Celsius + 273; 

        return k ; 
    }

    double conversaoDeCelcioParaFahrenheit(){
        double F = 1.8*Celsius + 32;

        return F;
    }
}
