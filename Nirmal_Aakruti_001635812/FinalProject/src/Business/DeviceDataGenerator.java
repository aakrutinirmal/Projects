/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Random;

/**
 *
 * @author aakrutinirmal
 */
public class DeviceDataGenerator {

    Random randomNo = new Random();
    /*GIVEN RANGES ARE NORMAL I.E. HEALTHY RANGE */

    public double generateRespRate() {
        float minX = 10.0f;
        float maxX = 22.0f;

        double respRate = randomNo.nextDouble() * (maxX - minX) + minX;
        return respRate;

    }

    public double generateHeartRate() {
        float minX = 50.0f;
        float maxX = 110.0f;

        double heartRate = randomNo.nextDouble() * (maxX - minX) + minX;
        return heartRate;

    }

    public double generateBloodPressure() {
        float minX = 110.0f;
        float maxX = 120.0f;

        double bloodPressure = randomNo.nextDouble() * (maxX - minX) + minX;
        return bloodPressure;

    }

    public double generateWeight() {
        float minX = 40.0f;
        float maxX = 150.0f;

        double weight = randomNo.nextDouble() * (maxX - minX) + minX;
        return weight;

    }

    public double generateBloodSugar() {
        float minX = 90.0f;
        float maxX = 160.0f;

        double bloodSugar = randomNo.nextDouble() * (maxX - minX) + minX;
        return bloodSugar;

    }

}
