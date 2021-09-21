public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
      this.flying = true;
      System.out.println("Hawkeye takes off in the sky.");
    }

    @Override
    public int descend(int meters){
      if(this.altitude - meters > 0 && this.flying){
        this.altitude -= meters;
      }
      else{
        if(flying){
          this.altitude = 1;
        }
        else{
          System.out.println("Hawkeye does not have taken off.");
          return this.altitude;
        }
      }

      System.out.println("Hawkeye flies downward, altitude: " + this.altitude);
      return this.altitude;
    }

    @Override
    public int ascend(int meters){
      if(this.altitude == 0 && this.flying){
        this.altitude = meters;
      }
      else{
        if(flying){
          this.altitude += meters;
        }
        else{
          System.out.println("Hawkeye does not have taken off.");
          return this.altitude;
        }
      }

      System.out.println("Hawkeye flies upward, altitude: " + this.altitude);
      return this.altitude;
    }

    @Override
    public void land(){
      if(this.altitude == 1 && this.flying){
        this.flying = false;
        this.altitude = 0;
        System.out.println("Hawkeye lands on the ground.");
      }
      else {
        if(!this.flying)
          System.out.println("Hawkeye does not have taken off.");
        else
          System.out.println("Hawkeye is too high, it can't land.");
      }
    }
}
