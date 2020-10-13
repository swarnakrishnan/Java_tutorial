public class globe {
   public void simplemessage(String name){
       System.out.println("Hello "+ name);
   }
   private String boyName;
   public  globe(String nm){
       boyName = nm;
   }
   public void setName(String nm){
       boyName=nm;
   }
   public String getName(){
       return boyName;
   }
   public void saying(){
       System.out.printf("Your fist bf name is %s", getName());
   }
}
