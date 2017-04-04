package headfirst.strategy.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float temperature = 0;
  private float humidity = 0;
  private Subject weatherData;
  public StatisticsDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  public void update(float temp, float humidity, float pressure){
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }
  public void display() {
    System.out.println("Statistics conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}