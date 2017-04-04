package headfirst.strategy.weather;
import java.util.ArrayList;
public class WeatherData implements Subject{
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private float temperature = 0;
  private float humidity = 0;
  private float pressure = 0;
  public void registerObserver(Observer o){
    observers.add(o);
  }
  public void removeObserver(Observer o){
    int l = observers.indexOf(o);
    if(l>=0){
     observers.remove(l); 
    }
  }
  public void notifyObservers(){
    for(int i=0; i<observers.size(); i++){
      Observer observer = (Observer)observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }
  public void measurementsChanged() {
  notifyObservers();
 }
  public void setMeasurements(float temperature, float humidity, float pressure) {
   this.temperature = temperature;
   this.humidity = humidity;
   this.pressure = pressure;
   measurementsChanged();
  }
 
  public float getTemperature() {
   return temperature;
  }
 
  public float getHumidity() {
   return humidity;
  }
 
  public float getPressure() {
   return pressure;
  }
}