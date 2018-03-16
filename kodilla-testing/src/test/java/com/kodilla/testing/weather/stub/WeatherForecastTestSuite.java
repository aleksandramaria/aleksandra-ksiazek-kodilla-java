package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        double resultTemp = weatherForecast.calculateForecast().get(0);

        //Then
        Assert.assertEquals(5, quantityOfSensors);
        System.out.println(resultTemp);
    }
}