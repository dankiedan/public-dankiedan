class Main {
  public static void main(String[] args) {

    Pokemon pika = new Pokemon("Pikachu", 10);
    Pokemon eve = new Pokemon("Eevee", 3);

    Pokemon dank = new Pokemon("Dankie", 19);
    dank.printDetails();

    Pokemon dank2 = new Pokemon();
    dank2.printDetails(); // This will run through the default Pokemon() method.

    pika.printDetails();
    eve.printDetails();

    System.out.println("------");

    pika.attack();
    pika.attack();
    pika.attack();

    pika.printDetails();
    eve.printDetails();

    System.out.println("--- After Pikachu attacks... Taking a break... ");

    for (int i = 0; i < 3; i++) {
      eve.attack(); 
    }
	
    pika.printDetails();
    eve.printDetails();

  }
}