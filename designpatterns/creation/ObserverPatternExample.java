package designpatterns.creation;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Concrete Observer: Phone Display
class PhoneDisplay implements Observer {
    private float temperature;
    private float humidity;
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Phone Display - Temperature: " + temperature + "C, Humidity: " + humidity + "%");
    }
}

// Concrete Observer: Window Display
class WindowDisplay implements Observer {
    private float temperature;
    private float humidity;
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Window Display - Temperature: " + temperature + "C, Humidity: " + humidity + "%");
    }
}

// Subject Interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject: Weather Station
class WeatherStation implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;
    
    public WeatherStation() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    
    // Simulate new data being received from the weather station
    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

// Main class
public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create weather station (subject)
        WeatherStation weatherStation = new WeatherStation();
        
        // Create observers
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WindowDisplay windowDisplay = new WindowDisplay();
        
        // Register observers with the weather station
        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(windowDisplay);
        
        // Simulate new weather data being set
        weatherStation.setWeatherData(30.5f, 65f, 1013f); // Temperature: 30.5°C, Humidity: 65%, Pressure: 1013 hPa
        weatherStation.setWeatherData(25.0f, 70f, 1010f); // Temperature: 25.0°C, Humidity: 70%, Pressure: 1010 hPa
    }
}

