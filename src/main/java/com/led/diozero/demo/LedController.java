package com.led.diozero.demo;

import com.diozero.devices.LED;
import com.diozero.util.SleepUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LedController {

   @RequestMapping("/home")
    public String getHome() {
       return "home";
   }

   @RequestMapping("/blink")
    public String blink() {
       blinkLED();
       return "home";
   }
   public static void blinkLED() {
       try (LED led = new LED(17)) {
           for (int i = 0; i < 4; i++) {
               led.on();
               SleepUtil.sleepSeconds(1);
               led.off();
               SleepUtil.sleepSeconds(1);
           }
       }
   }





}
