package com.example.gas.entity;

public class Warninfo {
    private Integer low_weight;
    private Integer height_weight;
    private Integer low_pressure;
    private Integer height_pressure;
    private float low_temperature;
    private float height_temperature;
    private float low_voltage;
    private float height_voltage;
    private long device_id;

    public Integer getLow_weight() {
        return low_weight;
    }

    public void setLow_weight(Integer low_weight) {
        this.low_weight = low_weight;
    }

    public Integer getHeight_weight() {
        return height_weight;
    }

    public void setHeight_weight(Integer height_weight) {
        this.height_weight = height_weight;
    }

    public Integer getLow_pressure() {
        return low_pressure;
    }

    public void setLow_pressure(Integer low_pressure) {
        this.low_pressure = low_pressure;
    }

    public Integer getHeight_pressure() {
        return height_pressure;
    }

    public void setHeight_pressure(Integer height_pressure) {
        this.height_pressure = height_pressure;
    }

    public float getLow_temperature() {
        return low_temperature;
    }

    public void setLow_temperature(float low_temperature) {
        this.low_temperature = low_temperature;
    }

    public float getHeight_temperature() {
        return height_temperature;
    }

    public void setHeight_temperature(float height_temperature) {
        this.height_temperature = height_temperature;
    }

    public float getLow_voltage() {
        return low_voltage;
    }

    public void setLow_voltage(float low_voltage) {
        this.low_voltage = low_voltage;
    }

    public float getHeight_voltage() {
        return height_voltage;
    }

    public void setHeight_voltage(float height_voltage) {
        this.height_voltage = height_voltage;
    }

    public long getDevice_id() {
        return device_id;
    }

    public void setDevice_id(long device_id) {
        this.device_id = device_id;
    }
}
