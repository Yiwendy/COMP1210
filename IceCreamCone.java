import java.text.DecimalFormat;
/**
 * Defines IceCreamCone object.
 * @ Wenzhuo Fan
 * @ 10/23/2019
 */
public class IceCreamCone
{
   // instance variable
   private String label = "";
   private double radius = 0;
   private double height = 0;
   private static int count = 0;
   /** 
    * Built the constructors.
    * @param labelIn replace the old label
    * @param radiusIn replace the old radius
    * @param heightIn replace the old height
    */
   public IceCreamCone(String labelIn, double radiusIn, double heightIn) 
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
      count++;
   }
    /**
     * @param labelIn to replace the old label.
     * @return the labelSet.
     */
   public boolean setLabel(String labelIn)
   {
      boolean labelSet = false;
      if (labelIn != null) 
      {       
         label = labelIn;
         label = label.trim();
         labelSet = true;
      }
      return labelSet;
   }
   /**
    * @return the label.
    */
   public String getLabel() 
   {
      return label;
   }
     
   /**
    * @param radiusIn replace the old radius.
    * @return rediusSet.
    */
   public boolean setRadius(double radiusIn) 
   {
      boolean radiusSet = false;
      if (radiusIn > 0) 
      {
         radius = radiusIn;
         radiusSet = true;
      }
      return radiusSet;
   }
   /** 
    * @return radius.
    */
   public double getRadius()
   {
      return radius;
   }
      
   /**
    * @param heightIn replace the old height.
    * @return heightSet
    */
   public boolean setHeight(double heightIn)
   {
      boolean heightSet = false;
      if (heightIn > 0)
      {   
         height = heightIn;
         heightSet = true;
      }
      return heightSet;
   }  
   /**
    * @return height.
    */
   public double getHeight() 
   { 
      return height;
   }
       
   /**
    * @return surfaceArea.
    */
   public double surfaceArea() 
   {
      double surfaceArea = Math.PI * radius * Math.sqrt(Math.pow(height, 2) 
         + Math.pow(radius, 2)) + 2 * Math.PI * Math.pow(radius, 2);
      return surfaceArea;
   }
        
   /**
    * @return volume.
    */
   public double volume() 
   {
      double volume = (height * Math.PI * Math.pow(radius, 2)) / 3
         + (2 * Math.PI * Math.pow(radius, 3) / 3);
      return volume;
   }
      
   /** 
    * @return output.
    */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,###.0######");
      String output = "IceCreamCone " + "\"" + label + "\" with radius = " 
         + radius + " and height = " + height + " units has:" + "\n\t";
      output += "surface area = " + df.format(surfaceArea()) 
         + " square units" + "\n\t";
      output += "volume = " + df.format(volume()) + " cubic units";
      return output;
   }
   
  /**
   * @return the count.
   */  
   public static int getCount()
   {
      return count;
   }
    /**
    * resets count to zero.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /** 
    * @param obj to object.
    * @return obj.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof IceCreamCone)) {
         return false;
      }
      else {
         IceCreamCone icc = (IceCreamCone) obj;
         return (label.equalsIgnoreCase(icc.getLabel())
            && Math.abs(radius - icc.getRadius()) < .000001
            && Math.abs(height - icc.getHeight()) < .000001);
      }
   }
   
   /**
    * @return zero.
    */
   public int hashCode() {
      return 0; 
   }     
}