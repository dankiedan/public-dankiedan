class Main {
  public static void main(String[] args) {

    Pokemon pika = new Pokemon("Pikachu", 10);
    Pokemon eve = new Pokemon("Eevee", 3);

    pika.printDetails();
    eve.printDetails();

    System.out.println("------");

    pika.attack();
    pika.attack();
    pika.attack();

    pika.printDetails();
    eve.printDetails();

    System.out.println("--- After Pikachu attacks... Taking a break... ");

    for (int i = 0; i < 15; i++) {
      eve.attack(); 
    }
	
    pika.printDetails();
    eve.printDetails();

  }
}