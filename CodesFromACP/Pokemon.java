public class Pokemon {

    private String name;
    private int level;
  
    public Pokemon() {
      this.name = "Default";
      this.level = 1;
    }
  
    public Pokemon(String name, int level) {
      this.name = name;
      this.level = level;
    }
  
    public void printDetails() {
      System.out.println("Pokemon " + this.name + " is level " + this.level);
    }
  
    public void attack() {
      System.out.println(this.name + " attack!");
      level++;
    }
  }
  