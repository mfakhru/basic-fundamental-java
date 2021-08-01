package com.zi.javafundamental.basic;

import com.zi.javafundamental.basic.music.Gitar;
import com.zi.javafundamental.basic.vehicle.*;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
/* disederhanakan dari
import com.zi.javafundamental.basic.vehicle.Car;
import com.zi.javafundamental.basic.vehicle.Motorcycle;
import com.zi.javafundamental.basic.vehicle.Train;
namun tidak disaranakan jika class terlalu banyak
untuk import optimal bisa menu Code -> Optimize imports
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        Gitar.sound();

        Car.JumlahBan();
        Motorcycle.JumlahBan();
        Train.JumlahBan();

        Date today = new Date();
        System.out.println("Today is= " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Tomorrow is= " + tomorrow);
    }
}
