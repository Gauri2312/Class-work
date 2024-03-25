//In the below java prog Bulb class inherits the Device class.
//Therefore,we can say that Bulb is having an IS-A relationship 
//with the class Device.Hence Bulb is a Device.
package com.oopexample;

class Device
{
	private String devicename;

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	
}
public class Bulb extends Device {
      public static void main(String[]args)
      {
    	  Device obj=new Bulb();
    	  obj.setDevicename("Ultra TechBulb");
    	  System.out.println(obj.getDevicename());
      }
}
